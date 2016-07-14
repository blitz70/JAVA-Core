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
	JSP :
	<%
		try {
			int i = 2/0;
		} catch(Exception e) {
			out.println(e.toString());
		}
	%><br>
	JSTL :
	<c:catch var="error">
		<%= 2/0 %>
	</c:catch>
	<c:out value = "${error}" /><br>
	<hr>
	
	<!-- condition, if -->
	JSP :
	<%
		int a1=1, b1=2, c1=3;
		if (a1+b1==c1) {
			out.println(a1 +"+" +b1 +"=="+c1);
		}
		if (a1+b1!=c1) {
			out.println(a1 +"+" +b1 +"!="+c1);
		}
	%><br>
	JSTL :
	<c:set var="a1" value="1"/>
	<c:set var="b1" value="2"/>
	<c:set var="c1" value="4"/>
	<c:if test="${a1+b1==c1}">
		${a1}+${b1}==${c1}<br>
	</c:if>
	<c:if test="${a1+b1!=c1}">
		${a1}+${b1}!=${c1}<br>
	</c:if>
	
	<!-- condition, if else -->
	JSP :
	<%
		int a2=1, b2=2, c2=-3;
		if (a2+b2==c2) {
			out.println(a2 +"+" +b2 +" is EQUAL to "+c2);
		} else if (a2+b2<c2) {
			out.println(a2 +"+" +b2 +" is LESS than "+c2);
		} else if (a2+b2>c2) {
			out.println(a2 +"+" +b2 +" is GREATER than "+c2);
		} else {
			out.println(a2 +"+" +b2 +" is NOT equal to "+c2);
		}
	%><br>
	JSTL :
	<c:set var="a2" value="1"/>
	<c:set var="b2" value="2"/>
	<c:set var="c2" value="10"/>
	<c:choose>
		<c:when test="${a2+b2==c2}">
			${a2}+${b2} is EQUAL to ${c2}<br>
		</c:when>
		<c:when test="${a2+b2<c2}">
			${a2}+${b2} is LESS than ${c2}<br>
		</c:when>
		<c:when test="${a2+b2>c2}">
			${a2}+${b2} is GREATER than ${c2}<br>
		</c:when>
		<c:otherwise>
			${a2}+${b2} is NOT equal to ${c2}<br>
		</c:otherwise>
	</c:choose>
	<hr>
	
	<!-- loop, for -->
	JSP :
	<%
		for(int i=0; i <=30; i+=3) {
			out.println(i);
		}
	%><br>
	JSTL :
	<c:forEach var="i" begin="0" end="30" step="3">
		${i}
	</c:forEach><br>
	
	<!-- loop, while -->
	JSP :
	<%
		int i = 0;
		while(true) {
			out.println(i);
			if (i >= 50) break;
			i+=5;
		}
	%><br>
	JSTL :
	<hr>

	<!--redirect, param-->
	<form action="jstl_core2.jsp" method="post">
		주소 : <input type="text" name="id">
		<input type="submit">
	</form>
	<c:if test="${param.id == 'blitz'}">
		<c:redirect url="jstl_core2.jsp">
			<c:param name="name" value="${param.id}"/>
			<c:param name="age" value="40's"/>
			<c:param name="job" value="think tank"/>
		</c:redirect>
	</c:if>
	Id : ${param.id}<br>
	<c:if test="${param.name != null}">
	Name : ${param.name}<br>
	Age : ${param.age}<br>
	Job : ${param.job}
	</c:if>
	
</body>
</html>