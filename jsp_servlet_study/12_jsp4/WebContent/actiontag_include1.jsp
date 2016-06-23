<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Action tag</title>
</head>
<body>
	<h1>원래 페이지 입니다.</h1>
	action tag : <jsp:include page="actiontag_include2.jsp"/>
	directive : <%@ include file="actiontag_include2.jsp"  %>
	<h1>원래 페이지 입니다.</h1>
</body>
</html>