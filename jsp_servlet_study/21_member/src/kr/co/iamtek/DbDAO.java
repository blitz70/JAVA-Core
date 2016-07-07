package kr.co.iamtek;

import java.sql.*;
import java.util.ArrayList;

public class DbDAO {
	
	private static DbDAO INSTANCE;
	//DB data
	private final String DRIVER = "com.mysql.jdbc.Driver";
	private final String URL = "jdbc:mysql://localhost:3306/jdbc";
	private final String USER = "blitz";
	private final String PASSWORD = "mysql";
	private final String TABLE = "members";

	private Connection myConn;
	private Statement myStmt;
	private PreparedStatement myPsmt;
	private ResultSet myRs;
	private String SQL;
	
	private DbDAO() {
		try {
			Class.forName(DRIVER);
		} catch (Exception e) {
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
	
	public ArrayList<DbDTO> memberSelect() {
		ArrayList<DbDTO> dtos = new ArrayList<DbDTO>();
		try {
			SQL = "SELECT * FROM `"+ TABLE + "`";
			myConn = DriverManager.getConnection(URL, USER, PASSWORD);
			myStmt = myConn.createStatement();
			myRs = myStmt.executeQuery(SQL);
			while(myRs.next()) {
				String name = myRs.getString("name");
				String id = myRs.getString("id");
				String pw = myRs.getString("pw");
				String phone = myRs.getString("phone");
				String gender = myRs.getString("gender");
				//dtos.add(new DbDTO(name, id, pw, phone, gender));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (!myRs.isClosed()) myRs.close();
				if (!myStmt.isClosed()) myStmt.close();
				if (!myConn.isClosed()) myConn.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return dtos;
	}
	public DbDTO getMember(String id, String pw) {
		DbDTO dto = null;
		try {
			SQL = "SELECT * FROM `"+ TABLE + "` WHERE id=? AND pw=?";
			myConn = DriverManager.getConnection(URL, USER, PASSWORD);
			myPsmt = myConn.prepareStatement(SQL);
			myPsmt.setString(1, id);
			myPsmt.setString(2, pw);
			myRs = myPsmt.executeQuery();
			if(myRs.next()) {
				String name = myRs.getString("name");
				String id2 = myRs.getString("id");
				String pw2 = myRs.getString("pw");
				String email = myRs.getString("email");
				Timestamp date  = myRs.getTimestamp("date");
				String address = myRs.getString("address");
				dto = new DbDTO(name, id2, pw2, email, date, address);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (!myRs.isClosed()) myRs.close();
				if (!myStmt.isClosed()) myStmt.close();
				if (!myConn.isClosed()) myConn.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return dto;
	}
	public String getId(String id) {
		String id_result = "";
		try {
			SQL = "SELECT id FROM `"+ TABLE + "` WHERE id=?";
			myConn = DriverManager.getConnection(URL, USER, PASSWORD);
			myPsmt = myConn.prepareStatement(SQL);
			myPsmt.setString(1, id);
			myRs = myPsmt.executeQuery();
			if(myRs.next()) {
				id_result = myRs.getString("id");
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (!myRs.isClosed()) myRs.close();
				if (!myStmt.isClosed()) myStmt.close();
				if (!myConn.isClosed()) myConn.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return id_result;
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
			e.printStackTrace();
		} finally {
			try {
				if (!myPsmt.isClosed()) myPsmt.close();
				if (!myConn.isClosed()) myConn.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return i;
	}

}
