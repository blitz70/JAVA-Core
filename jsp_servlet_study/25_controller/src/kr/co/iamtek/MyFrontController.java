package kr.co.iamtek;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * Servlet implementation class MyFrontController
 */
@WebServlet("*.do")
public class MyFrontController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MyFrontController() {
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
		String uri = request.getRequestURI();
		String contextPath = request.getContextPath();
		String command = uri.substring(contextPath.length());
		
		response.setContentType("text/html; charset=EUC-KR");
		PrintWriter writer = response.getWriter();
		writer.println("<html><head></head><body>");
		writer.println("URI : " + uri + "<br>Context Path : " + contextPath + "<br>Command : " + command + "<br><br>");

		if(command.equals("/insert.do")) {
			writer.println("INSERT<hr>");
		} else if(command.equals("/update.do")) {
			writer.println("UPDATE<hr>");
		} else if (command.equals("/select.do")) {
			writer.println("SELECT<hr>");
		} else if (command.equals("/delete.do")) {
			writer.println("DELETE<hr>");
		}
		
		writer.println("<a href='frontController.jsp'>처음으로</a>");
		writer.println("</body></html>");
		writer.close();
	}

}
