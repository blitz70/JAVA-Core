package kr.co.iamtek.controller;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.co.iamtek.db.*;

public class BListCommand implements BCommand {

	@Override
	public void exectute(HttpServletRequest request, HttpServletResponse response) {
		BoardDAO dao = BoardDAO.getInstance();
		ArrayList<BoardDTO> dtos = dao.listContents(); 
		request.setAttribute("list", dtos);
	}

}
