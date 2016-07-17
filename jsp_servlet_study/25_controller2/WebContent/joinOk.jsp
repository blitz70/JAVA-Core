<%@page import="java.sql.Timestamp"%>
<%@page import="kr.co.iamtek.*"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
<script type="text/javascript" src="member.js"></script>
</head>
<body>
<%
	request.setCharacterEncoding("EUC-KR");
%>
<jsp:useBean id="dto" class="kr.co.iamtek.DbDTO" scope="page"/>
<jsp:setProperty name="dto" property="*"  /> <%-- date만 제외한 form 내용만 dto에 입력 --%>
<%
	Timestamp date = new Timestamp(System.currentTimeMillis());
	dto.setDate(date);		//빠진 date를 dto에 입력
	DbDAO dao = DbDAO.getInstance();
	if (dao.checkId(dto.getId())) {
%>
	<script type="text/javascript">
		alert("회원가입에 실패 했습니다. 아이디가 이미 존재합니다.");
		history.back();
	</script>
<%
	} else {
		if (dao.memberInsert(dto) == 1) {
			session.setAttribute("id", dto.getId());
%>
	<script type="text/javascript">
		alert("회원 가입을 축하합니다.");
		location = "login.jsp";
	</script>
<%
		} else {
%>
	<script type="text/javascript">
		alert("회원 가입에 실패 했습니다.");
		location = "login.jsp";
	</script>
<%
		}
	}
%>
</body>
</html>