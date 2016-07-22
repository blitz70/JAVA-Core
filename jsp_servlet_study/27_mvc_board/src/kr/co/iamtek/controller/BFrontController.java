package kr.co.iamtek.controller;

import java.io.IOException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Iterator;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.co.iamtek.db.BoardDTO;

/**
 * Servlet implementation class BFrontController
 */
@WebServlet("*.do")
public class BFrontController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BFrontController() {
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
		request.setCharacterEncoding("EUC-KR");
		String uri = request.getRequestURI();
		String contextPath = request.getContextPath();
		String cmd = uri.substring(contextPath.length());
		
		String viewPage = null;
		BCommand bcmd = null;

		if(cmd.equals("/list.do")) {
			bcmd = new BListCommand();
			bcmd.exectute(request, response);
			viewPage = "list.jsp";
		} else if (cmd.equals("/write_view.do")) {
			System.out.println("write_view");
		} else if (cmd.equals("/write.do")) {
			System.out.println("write");
		} else if (cmd.equals("/content_view.do")) {
			System.out.println("content_view");
		} else if (cmd.equals("/modify.do")) {
			System.out.println("modify");
		} else if (cmd.equals("/delete.do")) {
			System.out.println("delete");
		} else if (cmd.equals("/reply_view.do")) {
			System.out.println("reply_view");
		} else if (cmd.equals("/reply.do")) {
			System.out.println("reply");
		}
		
		RequestDispatcher dispatcher = request.getRequestDispatcher(viewPage);
		dispatcher.forward(request, response);
	}

}
