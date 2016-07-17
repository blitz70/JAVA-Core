package kr.co.iamtek;

import java.sql.*;
import java.util.ArrayList;

public class DbDAO {
	
	private static DbDAO INSTANCE;
	
	private final String DRIVER = "com.mysql.jdbc.Driver";
	private final String URL = "jdbc:mysql://localhost:3306/jdbc";
	private final String USER = "blitz";
	private final String PASSWORD = "mysql";
	private final String TABLE = "members";

	private Connection myConn;
	private PreparedStatement myPsmt;
	private ResultSet myRs;
	private String SQL;
	
	private DbDAO() {
		try {
			Class.forName(DRIVER);
		} catch (Exception e) {
			System.out.println("DbDAO.DbDAO() error");
			e.printStackTrace();
		}
	}
	
	public static DbDAO getInstance() {
		if (INSTANCE == null) {
			return new DbDAO();
		} else {
			return INSTANCE;
		}
	}
	
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
	
	public ArrayList<DbDTO> membersAll() {
		ArrayList<DbDTO> result = new ArrayList<DbDTO>();
		try {
			SQL = "SELECT * FROM `"+ TABLE + "`";
			myConn = DriverManager.getConnection(URL, USER, PASSWORD);
			myPsmt = myConn.prepareStatement(SQL);
			myRs = myPsmt.executeQuery();
			while (myRs.next()) {
				DbDTO dto = new DbDTO();
				dto.setName(myRs.getString("name"));
				dto.setId(myRs.getString("id"));
				dto.setPw(myRs.getString("pw"));
				dto.setEmail(myRs.getString("email"));
				dto.setDate(myRs.getTimestamp("date"));
				dto.setAddress(myRs.getString("address"));
				result.add(dto);
				System.out.println(dto.getName()+ " " + dto.getId());
			}
		} catch (Exception e) {
			System.out.println("DbDAO.membersAll() error");
			e.printStackTrace();
		} finally {
			try {
				if (myRs!=null) myRs.close();
				if (myPsmt!=null) myPsmt.close();
				if (myConn!=null) myConn.close();
			} catch (Exception e) {
				System.out.println("DbDAO.membersAll() error");
				e.printStackTrace();
			}
		}
		return result;
	}

}
