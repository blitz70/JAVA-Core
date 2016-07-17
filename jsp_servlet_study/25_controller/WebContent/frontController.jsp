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
		out.println("Context path : "	+ request.getContextPath() + "<br>");
		out.println("URL : " 				+ request.getRequestURL() + "<br>");
		out.println("URI : " 				+ request.getRequestURI() + "<br>");
	%>
	<hr>
	
	<a href="insert.do">insert</a>
	<hr>
	<a href="http://localhost:8080<%= request.getContextPath() %>/update.do">update</a>
	<hr>
	<a href="http://localhost:8080/25_controller/select.do">select</a>
	<hr>
	<a href="<%= request.getContextPath() %>/update.do">update</a>
	
</body>
</html>