package kr.co.iamtek;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class PostForm
 */
@WebServlet("/PForm")
public class PostForm extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public PostForm() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("doGet");
		String name = request.getParameter("name");
		String id = request.getParameter("id");
		String pwd = request.getParameter("pwd");
		String[] hobby = request.getParameterValues("hobby");
		String major = request.getParameter("major");
		String protocol = request.getParameter("protocol");

		response.setContentType("text/html; charset = euc-kr");
		PrintWriter writer = response.getWriter();
		writer.println("<html><head></head><body>");
		writer.println("이름 : " + name + "<br>");
		writer.println("아이디 : " + id + "<br>");
		writer.println("암호 : " + pwd + "<br>");
		writer.println("취미 : " + Arrays.toString(hobby) + "<br>");
		writer.println("전공 : " + major + "<br>");
		writer.println("프로토콜 : " + protocol + "<br>");
		writer.println("</body></html>");
		writer.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("doPost");

		request.setCharacterEncoding("EUC-KR");		//한글 처리
		String name = request.getParameter("name");
		String id = request.getParameter("id");
		String pwd = request.getParameter("pwd");
		String[] hobby = request.getParameterValues("hobby");
		String major = request.getParameter("major");
		String protocol = request.getParameter("protocol");
		String hobbies = "";

		for (int i = 0; i < hobby.length; i++) {
			if (i == 0) {
				hobbies += hobby[i];
			} else {
				hobbies += ", " + hobby[i];
			}
		}

		response.setContentType("text/html; charset = euc-kr");
		PrintWriter writer = response.getWriter();
		writer.println("<html><head></head><body>");
		writer.println("이름 : " + name + "<br>");
		writer.println("아이디 : " + id + "<br>");
		writer.println("암호 : " + pwd + "<br>");
		// writer.println("취미 : " + Arrays.toString(hobby) + "<br>");
		writer.println("취미 : " + hobbies + "<br>");
		writer.println("전공 : " + major + "<br>");
		writer.println("프로토콜 : " + protocol + "<br>");
		writer.println("</body></html>");
		writer.close();

	}
}
