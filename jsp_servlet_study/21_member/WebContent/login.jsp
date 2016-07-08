<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
 <%
 	String id = "";
 	if (session.getAttribute("Valid") != null) {
 %>
<jsp:forward page="main.jsp"></jsp:forward>
 <%
 	} else if (session.getAttribute("id") != null) {
 		id = session.getAttribute("id").toString();
 	}
 %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
<script language="JavaScript" src="member.js"></script>
</head>
<body>
<h1>로그인 페이지 입니다.</h1>
	<form action="loginOk.jsp" method="post" name="formLogin">
	아이디 : <input type="text" name="id" value="<%= id %>"><br>
	비밀번호 : <input type="password" name="pw" value="">
	<br><br>
	<input type="button" value="로그인"  onclick="checkLogin()">
	<input type="button" value="회원가입" onclick="location='join.jsp'">
	</form>
</body>
</html>