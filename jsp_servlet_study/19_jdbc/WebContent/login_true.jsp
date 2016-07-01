<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%
	try {
		String id = session.getAttribute("id").toString();
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<%= id %>님 어서오세요.<br><br>
	<a href="modify.jsp">회원정보 수정</a><br>
	<a href="logout.jsp">로그아웃</a>
</body>
</html>
<%		
	} catch (Exception e) {
		response.sendRedirect("login.html");
		e.printStackTrace();
	}
%>