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
	private final String URL = "jdbc:mysql://localhost:3306/mydb";
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

	public ArrayList<BoardDTO> list() {
		ArrayList<BoardDTO> result = new ArrayList<BoardDTO>();
		try {
			sql = "SELECT * FROM `"+ TABLE + "` ORDER BY bGroup DESC, bStep ASC";
			conn = DriverManager.getConnection(URL, USER, PASSWORD);
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
			System.out.println("BoardDAO.list() error");
			e.printStackTrace();
		} finally {
			try {
				if (rs!=null) rs.close();
				if (psmt!=null) psmt.close();
				if (conn!=null) conn.close();
			} catch (Exception e) {
				System.out.println("BoardDAO.list() error");
				e.printStackTrace();
			}
		}
		return result;
	}

		/*
	public int checkMember(String id, String pw) {
		int result = 0;	//2:모두 일치, 1:id 일치, 0: 모두 틀림
		try {
			SQL = "SELECT pw FROM `"+ TABLE + "` WHERE id=?";
			myConn = DriverManager.getConnection(URL, USER, PASSWORD);
			myPsmt = myConn.prepareStatement(SQL);
			myPsmt.setString(1, id);
			myRs = myPsmt.executeQuery();
			if(myRs.next()) {
				String pwDb = myRs.getString("pw");
				if (pw.equals(pwDb)) {	//== 사용 못함.
					result = 2;
				} else {
					result = 1;
				}
			}
		} catch (Exception e) {
			System.out.println("DbDAO.getMember() error");
			e.printStackTrace();
		} finally {
			try {
				if (!myRs.isClosed()) myRs.close();
				if (!myPsmt.isClosed()) myPsmt.close();
				if (!myConn.isClosed()) myConn.close();
			} catch (Exception e) {
				System.out.println("DbDAO.getMember() error");
				e.printStackTrace();
			}
		}
		return result;
	}
	public boolean checkId(String id) {
		boolean result = false;		//id 없음
		try {
			SQL = "SELECT * FROM `"+ TABLE + "` WHERE id=?";
			myConn = DriverManager.getConnection(URL, USER, PASSWORD);
			myPsmt = myConn.prepareStatement(SQL);
			myPsmt.setString(1, id);
			myRs = myPsmt.executeQuery();
			if(myRs.next()) {
				result = true;
			}
		} catch (Exception e) {
			System.out.println("DbDAO.checkId() error");
			e.printStackTrace();
		} finally {
			try {
				if (!myRs.isClosed()) myRs.close();
				if (!myPsmt.isClosed()) myPsmt.close();
				if (!myConn.isClosed()) myConn.close();
			} catch (Exception e) {
				System.out.println("DbDAO.checkId() error");
				e.printStackTrace();
			}
		}
		return result;
	}
	
	public DbDTO memberGet(String id) {
		DbDTO result = null;
		try {
			SQL = "SELECT * FROM `"+ TABLE + "` WHERE id=?";
			myConn = DriverManager.getConnection(URL, USER, PASSWORD);
			myPsmt = myConn.prepareStatement(SQL);
			myPsmt.setString(1, id);
			myRs = myPsmt.executeQuery();
			if(myRs.next()) {
				result = new DbDTO();
				result.setName(myRs.getString("name"));
				result.setId(myRs.getString("id"));
				result.setPw(myRs.getString("pw"));
				result.setEmail(myRs.getString("email"));
				result.setDate(myRs.getTimestamp("date"));
				result.setAddress(myRs.getString("address"));
			}
		} catch (Exception e) {
			System.out.println("DbDAO.checkId() error");
			e.printStackTrace();
		} finally {
			try {
				if (!myRs.isClosed()) myRs.close();
				if (!myPsmt.isClosed()) myPsmt.close();
				if (!myConn.isClosed()) myConn.close();
			} catch (Exception e) {
				System.out.println("DbDAO.checkId() error");
				e.printStackTrace();
			}
		}
		return result;
	}
	
	public int memberInsert(DbDTO dto) {
		int i = 0;
		try {
			SQL = "INSERT INTO `"+ TABLE + "` (id, pw, name, email, date, address) VALUES (?, ?, ?, ?, ?, ?)";
			myConn = DriverManager.getConnection(URL, USER, PASSWORD);
			myPsmt = myConn.prepareStatement(SQL);
			myPsmt.setString(1, dto.getId());
			myPsmt.setString(2, dto.getPw());
			myPsmt.setString(3, dto.getName());
			myPsmt.setString(4, dto.getEmail());
			myPsmt.setTimestamp(5, dto.getDate());
			myPsmt.setString(6, dto.getAddress());
			i = myPsmt.executeUpdate();
		} catch (Exception e) {
			System.out.println("DbDAO.memberInsert() error");
			e.printStackTrace();
		} finally {
			try {
				if (!myPsmt.isClosed()) myPsmt.close();
				if (!myConn.isClosed()) myConn.close();
			} catch (Exception e) {
				System.out.println("DbDAO.memberInsert() error");
				e.printStackTrace();
			}
		}
		return i;
	}

	public int memberUpdate(DbDTO dto) {
		int i = 0;
		try {
			SQL = "UPDATE `"+ TABLE + "` set pw=?, name=?, email=?, address=? where id=?";
			myConn = DriverManager.getConnection(URL, USER, PASSWORD);
			myPsmt = myConn.prepareStatement(SQL);
			myPsmt.setString(1, dto.getPw());
			myPsmt.setString(2, dto.getName());
			myPsmt.setString(3, dto.getEmail());
			myPsmt.setString(4, dto.getAddress());
			myPsmt.setString(5, dto.getId());
			i = myPsmt.executeUpdate();
		} catch (Exception e) {
			System.out.println("DbDAO.memberUpdate() error");
			e.printStackTrace();
		} finally {
			try {
				if (!myPsmt.isClosed()) myPsmt.close();
				if (!myConn.isClosed()) myConn.close();
			} catch (Exception e) {
				System.out.println("DbDAO.memberUpdate() error");
				e.printStackTrace();
			}
		}
		return i;
	}
	*/

}
