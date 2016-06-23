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
		String age = request.getParameter("age");
		String enc = response.getCharacterEncoding();
	%>
	<%= age %>세 성인, 주류구매 가능.<br>
	<%= enc %><br>
	<a href="response_form.html">처음으로...</a>
</body>
</html>