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
	int checkMember = dao.checkMember(id, pw);
	if (checkMember == 0) {
%>
	<script type="text/javascript">
		alert("로그인에 실패 했습니다. 존재하지 않는 ID입니다.");
		history.back();
	</script>
<%		
	} else if (checkMember == 1) {
%>
	<script type="text/javascript">
		alert("로그인에 실패 했습니다. 비밀번호가 틀립니다.");
		history.back();
	</script>
<%		
	} else if (checkMember == 2) {
		DbDTO dto = dao.memberGet(id);
		if (dto == null) {
%>
	<script type="text/javascript">
		alert("로그인에 실패 했습니다. 존재하지 않는 회원입니다.");
		history.back();
	</script>
<%
		} else {
		session.setAttribute("id", dto.getId());
		session.setAttribute("name", dto.getName());
		session.setAttribute("Valid", dao.memberGet(dto.getId()));
%>
	<script type="text/javascript">
		alert("성공적으로 로그인 했습니다..");
		location = "main.jsp";
	</script>
<%
		}
	}
%>

</body>
</html>