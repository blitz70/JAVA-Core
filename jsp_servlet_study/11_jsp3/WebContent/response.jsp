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
		int age = Integer.parseInt(request.getParameter("age"));
		if (age >= 20 && age <=150) {
			response.sendRedirect("response_pass.jsp?age=" + age);
		} else if (age >0 && age < 20 ) {
			response.sendRedirect("response_fail.jsp?age=" + age);
		} else {
			response.sendRedirect("response_form.html");
		}
	%>
</body>
</html>