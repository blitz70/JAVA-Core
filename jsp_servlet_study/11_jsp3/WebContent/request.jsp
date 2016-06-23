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
		out.println("Request : "			+ request + "<br>");
		out.println("Server : " 			+ request.getServerName() + "<br>");
		out.println("Port : " 				+ request.getServerPort() + "<br>");
		out.println("Method : " 			+ request.getMethod() + "<br>");
		out.println("Protocol : " 		+ request.getProtocol() + "<br>");
		out.println("Context path : "	+ request.getContextPath() + "<br>");
		out.println("Session : "			+ request.getSession() + "<br>");
		out.println("URL : " 				+ request.getRequestURL() + "<br>");
		out.println("URI : " 				+ request.getRequestURI() + "<br>");
		out.println("Query : " 			+ request.getQueryString() + "<br>");
	%>

</body>
</html>