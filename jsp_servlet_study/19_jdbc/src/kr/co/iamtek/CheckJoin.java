package kr.co.iamtek;

import java.io.IOException;
import java.sql.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CheckJoin
 */
@WebServlet("/CheckJoin")
public class CheckJoin extends HttpServlet implements DB {
	private static final long serialVersionUID = 1L;
	
	//DB
	private Connection myConn;
	private Statement myStmt;
	private ResultSet myRs;
	private String sql;
	
	//member data
	private String name;
	private String id;
	private String pw;
	private String phone;
	private String gender;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CheckJoin() {
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
		request.setCharacterEncoding("EUC-KR");
		name = request.getParameter("name");
		id = request.getParameter("id");
		pw = request.getParameter("pw");
		phone = request.getParameter("phone1")+"-"+request.getParameter("phone2")+"-"+request.getParameter("phone3");
		gender = request.getParameter("gender");
		//System.out.println("name:"+name+", id:"+id+", pw:"+pw+", phone:"+phone+", gender:"+gender);
		
		//form check
		if (name == "" || id == "" || pw == "" || phone == "" || gender == "") {
			response.sendRedirect("join_false.html");
		} else {
			try {
				Class.forName(DRIVER);
				myConn = DriverManager.getConnection(URL, USER, PASSWORD);
				myStmt = myConn.createStatement();
				sql = "SELECT id FROM `"+ TABLE + "` WHERE id='" + id + "'";
				myRs = myStmt.executeQuery(sql);
				if (myRs.next()) {
					//id exits
					response.sendRedirect("member_true.html");
				} else {
					//no id
					sql = "INSERT INTO `"+ TABLE + "` VALUES ('" + name + "', '" + id + "', '" + pw + "', '" + phone + "', '" + gender+"')";
					//System.out.println(sql);
					if(myStmt.executeUpdate(sql)==1) {
						response.sendRedirect("join_true.html");
					} else {
						response.sendRedirect("join_false.html");
					}
				}
			} catch (Exception e) {
				e.printStackTrace();
				response.sendRedirect("join_false.html");
			} finally {
				try {
					if (!myRs.isClosed()) myRs.close();
					if (!myStmt.isClosed()) myStmt.close();
					if (!myConn.isClosed()) myConn.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
	}

}