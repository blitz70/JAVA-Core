<%@page import="kr.co.iamtek.Student"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
	
	<!-- exception -->
	<%
		try {
			int i = 2/0;
		} catch(Exception e) {
			out.println(e.toString());
		}
	%>
	<br>
	<c:catch var="error">
		<%= 2/0 %>
	</c:catch>
	<c:out value = "${error}" /><br>
	<hr>
	<!-- condition -->
	<!-- if else ex -->
	<%
		if (1+2==3) {
			out.println("1+2==3");
		}
		if (1+2!=3) {
			out.println("1+2!=3");
		}
	%><br>
	<c:if test="${1+2==3}">
		1+2==3<br>
	</c:if>
	<c:if test="${1+2!=3}">
		1+2!=3<br>
	</c:if>
	<hr>
	<!-- for -->
	<!-- object ex -->
	<%
		for(int fEach=0; fEach <=30; fEach+=3) {
			out.println(fEach);
		}
	%><br>
	<c:forEach var="fEach" begin="0" end="30" step="3">
		${fEach}
	</c:forEach><br>
	<hr>
	<!--page redirect ex, param ex-->

</body>
</html>