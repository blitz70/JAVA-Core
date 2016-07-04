<%@page import="java.util.ArrayList"%>
<%@page import="kr.co.iamtek.*"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>

	<%
		DbDAO dao = new DbDAO();
		ArrayList<DbDTO> dtos = dao.memberSelect();
		
		for(int i = 0; i < dtos.size(); i++) {
			DbDTO dto = dtos.get(i);
			String name = dto.getName();
			String id = dto.getId();
			String pw = dto.getPw();
			String phone = dto.getPhone();
			String gender = dto.getGender();
	%>
			이름: <%= name %>, 아이디: <%= id %>, 암호: <%= pw %>, 연락처: <%= phone %>, 성별:<%= gender %><br>
	<%
		}
	%>
	

</body>
</html>