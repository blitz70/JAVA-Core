<%@page import="kr.co.iamtek.MemberInfo"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>

	Action-tag<br>
	<jsp:useBean id="member" class="kr.co.iamtek.MemberInfo" scope="page" />
	<jsp:setProperty name="member" property="name" value="홍길동"/>
	<jsp:setProperty name="member" property="id" value="abcd"/>
	<jsp:setProperty name="member" property="pw" value="1234"/>
	이름 : <jsp:getProperty name="member" property="name" /><br>
	아이디 : <jsp:getProperty name="member" property="id" /><br>
	비밀번호 : <jsp:getProperty name="member" property="pw" /><br>
	
	<hr>
	
	EL<br	>
	<jsp:useBean id="member2" class="kr.co.iamtek.MemberInfo" scope="page" />
	<%-- java bean말고 객체 생성은 어떻게? --%>
	${member2.setName("홍길순")}
	${member2.setId("efgh")}
	${member2.setPw("5678")}
	이름 : ${member2.name} <br>
	아이디 : ${member2.id} <br>
	비밀번호 : ${member2.pw} <br>

</body>
</html>