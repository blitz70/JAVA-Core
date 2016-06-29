package kr.co.iamtek;

import java.io.IOException;
import java.sql.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CheckLoin
 */
@WebServlet("/CheckLogin")
public class CheckLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	//DB
	Connection myConn;
	Statement myStmt;
	ResultSet myRs;
	String driver = "com.mysql.jdbc.Driver";
	String url = "jdbc:mysql://localhost:3306/jdbc";
	String user = "blitz";
	String password = "mysql";
	String sql;
	
	//member data
	private String id;
	private String pw;

	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CheckLogin() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doAction(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doAction(request, response);
	}

	private void doAction(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//get form data
		id = request.getParameter("id");
		pw = request.getParameter("pw");
		//System.out.println("id:"+id+", pw:"+pw);

		//DB
		/*
		try {
			Class.forName(driver);	//DB 종류 설정
			myConn = DriverManager.getConnection(url, user, password);		//DB 접속
			myStmt = myConn.createStatement();	//
			sql = "SELECT id FROM members WHERE id='" + id + "'";
			myRs = myStmt.executeQuery(sql);
			if (myRs.next() ) {
				//id exits
				response.sendRedirect("login.html");
			} else {
				//no id
				sql = "INSERT INTO `members` VALUES ('" + name + "', '" + id + "', '" + pw + "', '" + phone + "', '" + gender+"')";
				//System.out.println(sql);
				if(myStmt.executeUpdate(sql)==1) {
					response.sendRedirect("login.html");
				} else {
					response.sendRedirect("join.html");
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
			response.sendRedirect("join.html");
		} finally {
			try {
				if (!myRs.isClosed()) myRs.close();
				if (!myStmt.isClosed()) myStmt.close();
				if (!myConn.isClosed()) myConn.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	*/
	}

}
