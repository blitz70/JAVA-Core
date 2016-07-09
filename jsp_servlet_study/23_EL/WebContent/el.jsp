<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>

	EL<br>
	${10}<br>
	${99.99}<br>
	${"ABC"}<br>
	${true}<br><br>
	
	JSP expression<br>
	<%= 10 %><br>
	<%= 99.99 %><br>
	<%= "ABC" %><br>
	<%= true %><br><br>
	
	<hr>
	
	EL<br>
	${ 1+2 }<br>	
	${ 1-2 }<br>	
	${ 1*2 }<br>	
	${ 1/2 }<br>	
	${ 1>2 }<br>	
	${ 1<2 }<br>	
	${ (1>2)?1:2 }<br>	
	${ (1>2)||(1<2)}<br><br>
		
	JSP expression<br>
	<%= 1+2 %><br>
	<%= 1-2 %><br>
	<%= 1*2 %><br>
	<%= (double)1/2 %><br>
	<%= 1>2 %><br>
	<%= 1<2 %><br>
	<%= (1>2)?1:2 %><br>
	<%= (1>2)||(1<2) %><br>
	
</body>
</html>