package kr.co.iamtek.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.co.iamtek.db.*;

public class BModifyCommand implements BCommand {

	@Override
	public void exectute(HttpServletRequest request, HttpServletResponse response) {
		String bNumber = request.getParameter("bNumber");
    String bTitle = request.getParameter("bTitle");
    String bContent = request.getParameter("bContent");
	  BoardDAO dao = BoardDAO.getInstance();
	  dao.modify(bNumber, bTitle, bContent);
	}

}
