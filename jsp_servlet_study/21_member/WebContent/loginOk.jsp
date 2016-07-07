<%@page import="kr.co.iamtek.*"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
<%
	request.setCharacterEncoding("EUC-KR");
	String id = request.getParameter("id");
	String pw = request.getParameter("pw");
	DbDAO dao = DbDAO.getInstance();
	System.out.println(dao.getMember(id, pw));
	if (dao.getMember(id, pw) != null) {
		session.setAttribute("id", id);
		session.setAttribute("Valid", "valid");
%>
	<script type="text/javascript">
		alert("성공적으로 로그인 했습니다..");
		location = "main.jsp";
	</script>
		
<%		
	} else {
%>
	<script type="text/javascript">
		alert("로그인에 실패 했습니다.");
		location = "login.jsp";
	</script>
<%		
	}
%>

</body>
</html>