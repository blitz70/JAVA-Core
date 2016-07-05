<%@page import="kr.co.iamtek.*"%>
<%@page import="java.sql.*"%>
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

		String name;
		String id;
		String pw;
		String phone;
		String gender;

		id = "abc";
		pw = "123";
		name = "홍길동";
		phone = "010-1234-5678";
		gender = "male";
		if (dao.memberInsert(new DbDTO(name, id, pw, phone, gender)) != "") {
			out.println(name + " updated!<br>");
		}
		
		id = "def";
		pw = "466";
		name = "홍길자";
		phone = "010-9012-3456";
		gender = "female";
		if (dao.memberInsert(new DbDTO(name, id, pw, phone, gender)) != "") {
			out.println(name + " updated!<br>");
		}
		
		id = "ghi";
		pw = "789";
		name = "홍길순";
		phone = "010-7890-1234";
		gender = "female";
		if (dao.memberInsert(new DbDTO(name, id, pw, phone, gender)) != "") {
			out.println(name + " updated!<br>");
		}
		
		id = "AAA";
		pw = "123";
		name = "이길동";
		phone = "010-1234-1111";
		gender = "male";
		if (dao.memberInsert(new DbDTO(name, id, pw, phone, gender)) != "") {
			out.println(name + " updated!<br>");
		}
	%>

</body>
</html>