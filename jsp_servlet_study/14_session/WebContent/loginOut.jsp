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
		if (request.isRequestedSessionIdValid()) {
			while (names.hasMoreElements()) {
				String name = (String)names.nextElement();
				String value = session.getAttribute(name).toString();
				if (name.equals("id") && value.equals("blitz")) {
					session.removeAttribute(name);
				}
			}
		}
		response.sendRedirect("loginTest.jsp");
	%>

</body>
</html>