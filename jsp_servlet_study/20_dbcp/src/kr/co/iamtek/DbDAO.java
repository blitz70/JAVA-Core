package kr.co.iamtek;

import java.sql.*;
import java.util.ArrayList;

public class DbDAO {
	
	//DB data
	private final String DRIVER = "com.mysql.jdbc.Driver";
	private final String URL = "jdbc:mysql://localhost:3306/jdbc";
	private final String USER = "blitz";
	private final String PASSWORD = "mysql";
	private final String TABLE = "members";

	private Connection myConn;
	private Statement myStmt;
	private ResultSet myRs;
	private String sql;
	
	public DbDAO() {
		try {
			Class.forName(DRIVER);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public ArrayList<DbDTO> memberSelect() {
		ArrayList<DbDTO> dtos = new ArrayList<DbDTO>();
		try {
			myConn = DriverManager.getConnection(URL, USER, PASSWORD);
			myStmt = myConn.createStatement();
			sql = "SELECT * FROM `"+ TABLE + "`";
			myRs = myStmt.executeQuery(sql);
			while(myRs.next()) {
				String name = myRs.getString("name");
				String id = myRs.getString("id");
				String pw = myRs.getString("pw");
				String phone = myRs.getString("phone");
				String gender = myRs.getString("gender");
				dtos.add(new DbDTO(name, id, pw, phone, gender));
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

}
