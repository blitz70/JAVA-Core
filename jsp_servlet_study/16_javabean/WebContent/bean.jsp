<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<jsp:useBean id="student" class="kr.co.iamtek.Student" scope="page" />
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>

	<%-- bean data setter --%>
	<jsp:setProperty name="student" property="name" value="홍길동" />
	<jsp:setProperty name="student" property="age" value="13" />
	<jsp:setProperty name="student" property="grade" value="6" />
	<jsp:setProperty name="student" property="studentNum" value="7" />

	<%-- bean data getter --%>
	이름 : <jsp:getProperty name="student" property="name" /><br>
	나이 : <jsp:getProperty name="student" property="age" /><br>
	학년 : <jsp:getProperty name="student" property="grade" /><br>
	학번 : <jsp:getProperty name="student" property="studentNum" />
	
</body>
</html>