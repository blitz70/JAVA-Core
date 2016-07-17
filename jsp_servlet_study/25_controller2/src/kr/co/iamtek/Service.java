package kr.co.iamtek;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface Service {

	public ArrayList<DbDTO> execute(HttpServletRequest request, HttpServletResponse response);
	
}
