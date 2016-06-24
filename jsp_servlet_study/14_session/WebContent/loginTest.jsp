<%@page import="java.util.Enumeration"%>
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
		Enumeration<String> names = session.getAttributeNames();
		int i = 0;
		while (names.hasMoreElements()) {
			i++;
			String name = names.nextElement().toString();
			String value = session.getAttribute(name).toString();
			out.println("name : "+name+", value : "+value+"<br>");
		}
		if (i == 0) {
			out.println("session has been deleted<br>");
		}
	%>

	<a href="login.html">처음으로</a>

</body>
</html>