<%@page import="kr.co.iamtek.*"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%
	if (session.getAttribute("Valid") == null) {
 %>
<jsp:forward page="login.jsp"></jsp:forward>
 <%
	 }
 %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
<%
	request.setCharacterEncoding("EUC-KR");
%>
<jsp:useBean id="dto" class="kr.co.iamtek.DbDTO" scope="page"/>
<jsp:setProperty name="dto" property="*"  /> <%-- date만 제외한 form 내용만 dto에 입력 --%>
<%
	dto.setId(session.getAttribute("id").toString());
	DbDAO dao = DbDAO.getInstance();
	if (dao.memberUpdate(dto) == 0) {
%>
	<script type="text/javascript">
		alert("정보 수정에 실패 했습니다.");
		history.back();
	</script>
<%
	} else {
		session.setAttribute("id", dto.getId());
		session.setAttribute("name", dto.getName());
		session.setAttribute("Valid", dao.memberGet(dto.getId()));
%>
	<script type="text/javascript">
		alert("정보 수정을 성공적으로 했습니다.");
		location = "main.jsp";
	</script>
<%
	}
%>

</body>
</html>