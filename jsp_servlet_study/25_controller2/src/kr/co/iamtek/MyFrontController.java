package kr.co.iamtek;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

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

		if(command.equals("/membersAll.do")) {
			response.setContentType("text/html; charset=EUC-KR");
			PrintWriter writer = response.getWriter();
			writer.println("<html><head></head><body>");
			
			Service service = new MembersAllService();
			ArrayList<DbDTO> dtos = service.execute(request, response);
			
			for (int i = 0; i < dtos.size(); i++) {
				DbDTO dto = dtos.get(i);
				String name = dto.getName();
				String id = dto.getId();
				String email = dto.getEmail();
				String address = dto.getAddress();
				String date = dto.getDate().toString();
				writer.println("name : "+name+", id : "+id+", email : "+email+", address : "+address+", date : "+date+"<br>");
			}
			writer.println("<a href='main.jsp'>메인</a>");
			writer.println("</body></html>");
			writer.close();
		}
		
	}

}
