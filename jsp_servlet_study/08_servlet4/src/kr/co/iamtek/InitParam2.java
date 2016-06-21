package kr.co.iamtek;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class InitParam2
 */
@WebServlet(
		urlPatterns={"/IParam2"},
		initParams={@WebInitParam(name="id", value="aaaa"),
				@WebInitParam(name="pwd", value="9876"),
				@WebInitParam(name="path", value="C:\\TEMP")
		}
)

public class InitParam2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InitParam2() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doGet");
		String id = getInitParameter("id");
		String pwd = getInitParameter("pwd");
		String path = getInitParameter("path");
		System.out.println("id:" + id+ ", pwd:" + pwd + ", path:" + path);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doPost");
	}

}
