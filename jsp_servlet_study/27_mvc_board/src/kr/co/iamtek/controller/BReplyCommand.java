package kr.co.iamtek.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.co.iamtek.db.BoardDAO;

public class BReplyCommand implements BCommand {

  @Override
  public void exectute(HttpServletRequest request, HttpServletResponse response) {
    String bNumber = request.getParameter("bNumber");
    String bAuthor = request.getParameter("bAuthor");
    String bTitle = request.getParameter("bTitle");
    String bContent = request.getParameter("bContent");
    BoardDAO dao = BoardDAO.getInstance();
    dao.replyContent(bNumber, bAuthor, bTitle, bContent);
  }

}
