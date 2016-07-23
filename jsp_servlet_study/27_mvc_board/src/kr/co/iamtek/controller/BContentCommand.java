package kr.co.iamtek.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.co.iamtek.db.*;

public class BContentCommand implements BCommand {

	@Override
	public void exectute(HttpServletRequest request, HttpServletResponse response) {
		String bNumber = request.getParameter("bNumber");
	  BoardDAO dao = BoardDAO.getInstance();
		BoardDTO dto = dao.getContent(bNumber); 
		request.setAttribute("content_view", dto);
	}

}
