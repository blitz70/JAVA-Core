package kr.co.iamtek;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MembersAllService implements Service {
	
	public MembersAllService() {
	}

	@Override
	public ArrayList<DbDTO> execute(HttpServletRequest request, HttpServletResponse response) {
		DbDAO dao = DbDAO.getInstance();
		return dao.membersAll();
	}

}
