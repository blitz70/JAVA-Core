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

	<!-- variable simple -->
	<% String varName1 = "varValue1"; %>
	varName1 : ${varName1}
	<br>
	varName1 : <%=varName1%>
	<br><br>
	<c:set var="varName2" value="varValue2" />
	varName2 : ${varName2}
	<br>
	varName2 : <c:out value="${varName2}" />
	<br>
	<c:remove var="varName2"/>
	varName2 : <c:out value="${varName2}" />
	<hr>
	<!-- variable object -->
	<jsp:useBean id="student1" class="kr.co.iamtek.Student" />
	<%
		student1.setName("김성규");
		student1.setGrade("A");
		student1.setRank("4");
	%>
	student1 : ${student1.getName()}
	<br>
	<%
		Student student2 = new Student();
	%>
	<c:set target="<%= student2 %>" property="name" value="오지은"/>
	student2 : <c:out value="${student2.name}" />
	
	<!--
	<c:set var="student3" value="student4" />
	<c:set var="student3" target=""  property="name" value="오지은"/>
	student2 : ${student2}
	  -->
	<br>

</body>
</html>