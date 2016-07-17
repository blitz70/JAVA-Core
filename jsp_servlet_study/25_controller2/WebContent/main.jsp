<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
 <%
 	String id;
 	if (session.getAttribute("Valid") == null) {
 %>
<jsp:forward page="login.jsp"></jsp:forward>
 <%
 	}
 	id = session.getAttribute("id").toString();
 %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
<h1>어서오세요 <%= id %>님, 메인 페이지 입니다.</h1>
	<form action="logout.jsp" method="post">
		<input type="submit" value="로그아웃">
		<input type="button" value="정보수정" onclick="location='modify.jsp'">
	</form>
</body>
</html>