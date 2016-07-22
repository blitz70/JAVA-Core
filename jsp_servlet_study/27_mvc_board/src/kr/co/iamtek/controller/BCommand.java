package kr.co.iamtek.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface BCommand {
	
	void exectute(HttpServletRequest request, HttpServletResponse response);

}
