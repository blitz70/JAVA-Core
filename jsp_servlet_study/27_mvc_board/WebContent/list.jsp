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

	<%
		ArrayList<BoardDTO> dtos = (ArrayList<BoardDTO>) request.getAttribute("list");
		Iterator<BoardDTO> i = dtos.iterator();
		while (i.hasNext()) {
			BoardDTO dto = i.next();
			int bNumber = dto.getbNumber();
			String bAuthor = dto.getbAuthor();
			String bTitle = dto.getbTitle();
			String bContent = dto.getbContent();
			Timestamp bDate = dto.getbDate();
			int bHit = dto.getbHit();
			int bGroup = dto.getbGroup();
			int bStep = dto.getbStep();
			int bIndent = dto.getbIndent();
	%>
		<%= dto.getbNumber() %> : <%= dto.getbAuthor() %> : <%= dto.getbTitle() %> : <%= dto.getbContent() %> : <%= dto.getbDate() %> : <%= dto.getbGroup() %> : <%= dto.getbStep() %> : <%= dto.getbIndent() %><br>
	<%
		}
	%>
</body>
</html>