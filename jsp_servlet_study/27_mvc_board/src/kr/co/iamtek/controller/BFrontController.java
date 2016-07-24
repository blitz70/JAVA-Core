package kr.co.iamtek.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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

		if (cmd.equals("/new_view.do")) {
		  viewPage = "new_view.jsp";
    } else if (cmd.equals("/new_write.do")) {
      bcmd = new BNewCommand();
      bcmd.exectute(request, response);
      viewPage = "list.do";
    } else if(cmd.equals("/list.do")) {
			bcmd = new BListCommand();
			bcmd.exectute(request, response);
			viewPage = "list.jsp";
    } else if (cmd.equals("/content_view.do")) {
      bcmd = new BContentCommand();
      bcmd.exectute(request, response);
      viewPage = "content_view.jsp";
    } else if (cmd.equals("/modify.do")) {
      bcmd = new BModifyCommand();
      bcmd.exectute(request, response);
      viewPage = "list.do";
		} else if (cmd.equals("/delete.do")) {
      bcmd = new BDeleteCommand();
      bcmd.exectute(request, response);
      viewPage = "list.do";
		} else if (cmd.equals("/reply_view.do")) {
      viewPage = "reply_view.jsp";
		} else if (cmd.equals("/reply.do")) {
		  bcmd = new BReplyCommand();
		  bcmd.exectute(request, response);
		  viewPage = "list.do";
		} else viewPage = "list.do";
		
		RequestDispatcher dispatcher = request.getRequestDispatcher(viewPage);
		dispatcher.forward(request, response);
	}

}
