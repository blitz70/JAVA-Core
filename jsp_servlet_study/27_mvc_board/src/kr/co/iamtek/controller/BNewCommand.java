package kr.co.iamtek.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.co.iamtek.db.*;

public class BNewCommand implements BCommand {

	@Override
	public void exectute(HttpServletRequest request, HttpServletResponse response) {
		String bAuthor = request.getParameter("bAuthor");
    String bTitle = request.getParameter("bTitle");
    String bContent = request.getParameter("bContent");
	  BoardDAO dao = BoardDAO.getInstance();
		dao.newContent(bAuthor, bTitle, bContent); 
	}

}
