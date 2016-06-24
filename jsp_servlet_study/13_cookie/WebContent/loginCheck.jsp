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
		String id, pwd;
	%>
	<%	//page used for processing, this page isn't shown
		id = request.getParameter("id");
		pwd = request.getParameter("pwd");
		if (id.equals("blitz") && pwd.equals("1234")) {
			Cookie cookie = new Cookie("id", id);
			cookie.setMaxAge(60);	//60s
			response.addCookie(cookie);
			response.sendRedirect("loginWelcome.jsp");
		} else {
			response.sendRedirect("login.html");
		}
	%>

</body>
</html>