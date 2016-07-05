
<%@page import="javax.sql.DataSource"%>
<%@page import="javax.naming.InitialContext"%>
<%@page import="javax.naming.Context"%>
<%@page import="java.sql.Connection"%>
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
	Connection conn = null;
	try {
		Context c = new InitialContext();
		DataSource ds = (DataSource) c.lookup("java:comp/env/jdbc/MySQL");
		conn = ds.getConnection();
		out.println("Success");
	} catch (Exception e) {
		out.println("Failed");
		e.printStackTrace();
	}
%>
</body>
</html>