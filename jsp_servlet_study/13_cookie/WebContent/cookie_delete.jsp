<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>

	<%!
		Cookie[] cookies;
	%>
	<%
		cookies  = request.getCookies();
		for(int i=0; i <cookies.length; i++) {
			String name = cookies[i].getName();
			String value = cookies[i].getValue();
			if (name.equals("id") && value.equals("blitz")) {
				out.println("Deleting "+value+"<br>");
				cookies[i].setMaxAge(0);
				response.addCookie(cookies[i]);
			}
		}
	%>

	<a href="cookie_test.jsp">cookie test</a>

</body>
</html>