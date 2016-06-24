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
		session.setAttribute("mySessionName1", "mySessionData");
		session.setAttribute("mySessionName2", 12345);
	%>
	
	<a href="session_get.jsp">session get</a>
	
</body>
</html>