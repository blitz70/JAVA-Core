<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
<script language="JavaScript" src="member.js" ></script>
</head>
<body>
<h1>가입 페이지 입니다.</h1>
	<form action="joinOk.jsp" method="post" name="formJoin">
		아이디 : <input type="text" name="id" value="blitz"/><br>
		비밀번호 : <input type="password" name="pw" value="1234"/><br>
		비밀번호(확인) : <input type="password" name="pw_check" value="1234"/><br>
		이름 : <input type="text" name="name" value="김성규"/><br>
		이메일 : <input type="text" name="email" value="blitz70@hanmail.net"/><br>
		주소 : <input type="text" name="address" value="천호동"/><br>
		<input type="button" value="회원가입"  onclick="checkJoin()">
		<input type="reset" value="취소" onclick="location='login.jsp'">
	</form>
</body>
</html>