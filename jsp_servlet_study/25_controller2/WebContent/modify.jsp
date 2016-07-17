<%@page import="kr.co.iamtek.*"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%
	if (session.getAttribute("Valid") == null) {
 %>
<jsp:forward page="login.jsp"></jsp:forward>
 <%
	 }
 	DbDTO dto = (DbDTO) session.getAttribute("Valid");
 %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
<script language="JavaScript" src="member.js"></script>
</head>
<body>
<h1>회원 정보수정 페이지 입니다.</h1>
	<form action="modifyOk.jsp" method="post" name="formModify">
		아이디 : <%= dto.getId() %><br>
		비밀번호 : <input type="password" name="pw" /><br>
		비밀번호(확인) : <input type="password" name="pw_check" /><br>
		이메일 : <input type="text" name="email" value="<%= dto.getEmail() %>"/><br>
		이름 : <input type="text" name="name" value="<%= dto.getName() %>"/><br>
		주소 : <input type="text" name="address" value="<%= dto.getAddress() %>"/><br>
		모두 필수 입력 항목입니다.
		<br><br>
		<input type="button" value="정보수정"  onclick="checkModify()">
		<input type="reset" value="취소" onclick="location='main.jsp'">
	</form>
</body>
</html>