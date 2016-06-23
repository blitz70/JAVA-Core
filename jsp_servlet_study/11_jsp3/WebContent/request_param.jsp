<%@page import="java.util.Enumeration"%>
<%@page import="java.util.Arrays"%>
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
		request.setCharacterEncoding("EUC-KR");
		String name = request.getParameter("name");
		String id = request.getParameter("id");
		String pwd = request.getParameter("pwd");
		String major = request.getParameter("major");
		String protocol = request.getParameter("protocol");
		String[] hobbies = request.getParameterValues("hobby");

		out.println("name : " + name + "<br>");
		out.println("id : " + id + "<br>");
		out.println("pwd : " + pwd + "<br>");
		out.println("major : " + major + "<br>");
		out.println("protocol : " + protocol + "<br>");
		out.println("hobbies : " + Arrays.toString(hobbies) + "<br>");
	%>
	<br>
	이름 : <%= name %><br>
	아이디 : <%= id %><br>
	암호 : <%= pwd %><br>
	전공 : <%= major %><br>
	프로토콜 : <%= protocol %><br>
	취미 : <%= Arrays.toString(hobbies) %><br>
	<br>
	<%
		Enumeration<String> names_param = request.getParameterNames();
		String names = "";
		while (names_param.hasMoreElements()) {
			names += names_param.nextElement() + " ";
		}
		out.println("parameter names : " + names + "<br>");
	%>
</body>
</html>