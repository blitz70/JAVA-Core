<%@page import="kr.co.iamtek.db.BoardDTO"%>
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
		BoardDTO dto = (BoardDTO) request.getAttribute("content_view");
	%>
	<form action="modify.do" method="post">
		<input type="hidden" name="bNumber" value="<%= dto.getbNumber() %>">
		<table width="700" border="1">
			<tr>
				<td bgcolor="grey" width="50">번 호</td><td><%= dto.getbNumber() %></td>
				<td bgcolor="grey" width="50">조 회</td><td><%= dto.getbHit() %></td>
				<td bgcolor="grey" width="50">이 름</td><td><%= dto.getbAuthor() %></td>
			</tr>
			<tr>
				<td bgcolor="grey">제 목</td><td colspan="5"><input type="text" size="90" name="bTitle" value="<%= dto.getbTitle() %>"></td>
			</tr>
			<tr>
				<td bgcolor="grey">내 용</td><td colspan="5"><textarea rows="10" cols="90" name="bContent" ><%= dto.getbContent() %></textarea></td>
			</tr>
			<tr>
				<td colspan="6" align="center"><input type="submit" value="글 수정"></td>
			</tr>
		</table>
	</form>
	<a href="list.do"><button>글 목록</button></a>
	<a href="delete.do?bNumber=<%= dto.getbNumber()%>"><button>글 삭제</button></a>
	<a href="reply_view.do?bNumber=<%= dto.getbNumber()%>"><button>댓글 달기</button></a>

</body>
</html>