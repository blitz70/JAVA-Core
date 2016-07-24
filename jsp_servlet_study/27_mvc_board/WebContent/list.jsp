<%@page import="java.sql.Timestamp"%>
<%@page import="java.util.Iterator"%>
<%@page import="kr.co.iamtek.db.*"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>

	<table width="700" border="1">
		<tr bgcolor="grey">
			<th>번 호</th>
			<th width="200">제 목</th>
			<th width="100">이 름</th>
			<th width="200">날 짜</th>
			<th>조 회</th>
		</tr>
		<%
		  ArrayList<BoardDTO> dtos = (ArrayList<BoardDTO>) request.getAttribute("list");
		  Iterator<BoardDTO> i = dtos.iterator();
		  while (i.hasNext()) {
		    BoardDTO dto = i.next();
		%>
		<tr align="right">
			<td><%=dto.getbNumber()%></td>
			<td align="left">
				<%
					for(int j = 0; j < dto.getbIndent(); j++) out.print("-");
				%>
				<a href="content_view.do?bNumber=<%= dto.getbNumber()%>"><%=dto.getbTitle()%></a>
			</td>
			<td><%=dto.getbAuthor()%></td>
			<td><%=dto.getbDate()%></td>
			<td><%=dto.getbHit()%></td>
		</tr>
		<%
		  }
		%>
		<tr>
			<td colspan="5" align="center">
				<a href="new_view.do"><button>글 쓰기</button></a>
			</td>
		</tr>
	</table>
	
</body>
</html>