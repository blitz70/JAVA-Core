package kr.co.iamtek;

import java.io.IOException;
import java.sql.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class CheckLoin
 */
@WebServlet("/CheckLogin")
public class CheckLogin extends HttpServlet implements DB {
	private static final long serialVersionUID = 1L;
    
	//DB
	private Connection myConn;
	private Statement myStmt;
	private ResultSet myRs;
	private String sql;
	
	//member data
	private String id;
	private String pw;
	private HttpSession session;
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
		
		//form check
		if (id == "" || pw == "") {
			response.sendRedirect("login_false.html");
		} else {
			try {
				Class.forName(DRIVER);
				myConn = DriverManager.getConnection(URL, USER, PASSWORD);
				myStmt = myConn.createStatement();	
				sql = "SELECT * FROM `"+ TABLE + "` WHERE id='" + id + "' and pw='" + pw + "'";
				//System.out.println(sql);
				myRs = myStmt.executeQuery(sql);
				if (myRs.next()) {
					//id exits
					session = request.getSession();
					session.setAttribute("id", id);
					session.setAttribute("pw", pw);
					//System.out.println(session.getAttribute("id").toString() + " " + session.getAttribute("pw").toString());
					response.sendRedirect("login_true.jsp");
				} else {
					//no id
					response.sendRedirect("login_false.html");
				}
			} catch (Exception e) {
				e.printStackTrace();
				response.sendRedirect("login_false.html");
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
