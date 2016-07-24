package kr.co.iamtek.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import kr.co.iamtek.db.BoardDTO;


public class BoardDAO {

	private static BoardDAO INSTANCE;
	
	private final String DRIVER = "com.mysql.jdbc.Driver";
	private final String URL = "jdbc:mysql://localhost:3306/mydb?useSSL=false";  //useSSL=false to prevent looong warning
	private final String USER = "blitz";
	private final String PASSWORD = "mysql";
	private final String TABLE = "mvc_board";

	private Connection conn;
	private PreparedStatement psmt;
	private ResultSet rs;
	private String sql;
	
	private BoardDAO() {
		try {
			Class.forName(DRIVER);
		} catch (Exception e) {
			System.out.println("BoardDAO.BoardDAO() error");
			e.printStackTrace();
		}
	}
	
	public static BoardDAO getInstance() {
		if (INSTANCE == null) {
			return new BoardDAO();
		} else {
			return INSTANCE;
		}
	}
	
	private void closeDAO() {
	  try {
	    if (rs != null) rs.close();
      if (psmt != null) psmt.close();
      if (conn != null) conn.close();
    } catch (Exception e) {
      System.out.println("BoardDAO.close() error");
      e.printStackTrace();
    }
	}
	
  public int newContent(String bAuthor, String bTitle, String bContent) {
    int result = 0;
    try {
      conn = DriverManager.getConnection(URL, USER, PASSWORD);
      sql = "INSERT INTO `" + TABLE + "` (`bAuthor`, `bTitle`, `bContent`, `bDate`, `bHit`, `bGroup`, `bStep`, `bIndent`) VALUES (?, ?, ?, now(), 0, 0, 0, 0)";
      psmt = conn.prepareStatement(sql);
      psmt.setString(1, bAuthor);
      psmt.setString(2, bTitle);
      psmt.setString(3, bContent);
      result = psmt.executeUpdate();
      sql = "UPDATE `"+ TABLE + "` SET bGroup =bNumber WHERE bGroup=0";
      psmt = conn.prepareStatement(sql);
      psmt.executeUpdate();
    } catch (Exception e) {
      System.out.println("BoardDAO.newContent() error");
      e.printStackTrace();
    } finally {
      closeDAO();
    }
    return result;
  }

	public ArrayList<BoardDTO> listContents() {
		ArrayList<BoardDTO> result = new ArrayList<BoardDTO>();
		try {
      conn = DriverManager.getConnection(URL, USER, PASSWORD);
			sql = "SELECT * FROM `" + TABLE + "` ORDER BY bGroup DESC, bStep ASC";
			psmt = conn.prepareStatement(sql);
			rs = psmt.executeQuery();
			while (rs.next()) {
						BoardDTO dto = new BoardDTO(
						rs.getInt("bNumber"),
						rs.getString("bAuthor"),
						rs.getString("bTitle"),
						rs.getString("bContent"),
						rs.getTimestamp("bDate"),
						rs.getInt("bHit"),
						rs.getInt("bGroup"),
						rs.getInt("bStep"),
						rs.getInt("bIndent")
						);
				result.add(dto);
			}
		} catch (Exception e) {
			System.out.println("BoardDAO.listContents() error");
			e.printStackTrace();
		} finally {
			closeDAO();
		}
		return result;
	}

  public BoardDTO getContent(String bNumber) {
    BoardDTO result = null;
    try {
      conn = DriverManager.getConnection(URL, USER, PASSWORD);
      sql = "SELECT * FROM `" + TABLE + "` WHERE bNumber=?";
      psmt = conn.prepareStatement(sql);
      psmt.setString(1, bNumber);
      rs = psmt.executeQuery();
      while (rs.next()) {
            result = new BoardDTO(
            rs.getInt("bNumber"),
            rs.getString("bAuthor"),
            rs.getString("bTitle"),
            rs.getString("bContent"),
            rs.getTimestamp("bDate"),
            rs.getInt("bHit"),
            rs.getInt("bGroup"),
            rs.getInt("bStep"),
            rs.getInt("bIndent")
            );
      }
    } catch (Exception e) {
      System.out.println("BoardDAO.getContent() error1");
      e.printStackTrace();
    } finally {
     closeDAO();
    }
    return result;
  }

  public int modifyContent(String bNumber, String bTitle, String bContent) {
    int result = 0;
    try {
      conn = DriverManager.getConnection(URL, USER, PASSWORD);
      sql = "UPDATE `" + TABLE + "` SET bTitle=?, bContent=? WHERE bNumber=?";
      psmt = conn.prepareStatement(sql);
      psmt.setString(1, bTitle);
      psmt.setString(2, bContent);
      psmt.setString(3, bNumber);
      result = psmt.executeUpdate();
    } catch (Exception e) {
      System.out.println("BoardDAO.modifyContent() error");
      e.printStackTrace();
    } finally {
      closeDAO();
    }
    return result;
  }

  public int deleteContent(String bNumber) {
    int result = 0;
    try {
      conn = DriverManager.getConnection(URL, USER, PASSWORD);
      sql = "DELETE FROM `" + TABLE + "` WHERE bNumber=?";
      psmt = conn.prepareStatement(sql);
      psmt.setString(1, bNumber);
      result = psmt.executeUpdate();
    } catch (Exception e) {
      System.out.println("BoardDAO.deleteContent() error");
      e.printStackTrace();
    } finally {
      closeDAO();
    }
    return result;
  }

  public int replyContent(String bNumber, String bAuthor, String bTitle, String bContent) {
    int result = 0;
    int bGroup = 0;
    int bStep = 0;
    int bIndent = 0;
    try {
      conn = DriverManager.getConnection(URL, USER, PASSWORD);
      sql = "SELECT * FROM `" + TABLE + "` WHERE bNumber=?";
      psmt = conn.prepareStatement(sql);
      psmt.setString(1, bNumber);
      rs = psmt.executeQuery();
      while(rs.next()) {
        bGroup = rs.getInt("bGroup");
        bStep = rs.getInt("bStep");
        bIndent = rs.getInt("bIndent");
      }
      sql = "UPDATE `" + TABLE + "` SET bStep=bStep+1 WHERE bGroup=? AND bStep > ?";
      psmt = conn.prepareStatement(sql);
      psmt.setInt(1, bGroup);
      psmt.setInt(2, bStep);
      psmt.executeUpdate();
      sql = "INSERT INTO `" + TABLE + "` (`bAuthor`, `bTitle`, `bContent`, `bDate`, `bHit`, `bGroup`, `bStep`, `bIndent`) VALUES (?, ?, ?, now(), 0, ?, ?, ?)";
      psmt = conn.prepareStatement(sql);
      psmt.setString(1, bAuthor);
      psmt.setString(2, bTitle);
      psmt.setString(3, bContent);
      psmt.setInt(4, bGroup);
      psmt.setInt(5, bStep+1);
      psmt.setInt(6, bIndent+1);
      result = psmt.executeUpdate();
    } catch (Exception e) {
      System.out.println("BoardDAO.replyContent() error");
      e.printStackTrace();
    } finally {
      closeDAO();
    }
    return result;
  }

}
