<%@page import="java.util.Enumeration"%>
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
		String sessionValue1 = session.getAttribute("mySessionName1").toString();
		String sessionValue2 = session.getAttribute("mySessionName2").toString();
		out.println("name : mySessionName1,  value: "+sessionValue1+"<br>");
		out.println("name : mySessionName2,  value: "+sessionValue2+"<br>");
		out.println("================== <br>");
	%>
	<%
		Enumeration names1 = session.getAttributeNames();
		while (names1.hasMoreElements()) {
			String name = (String)names1.nextElement();
			String value = session.getAttribute(name).toString();
			out.println("name : " + name + ", value : " + value + "<br>");
		}
		out.println("================== <br>");
	%>
	<%
		String sessionID = session.getId();
		//String sessionInterval = String.valueOf(session.getMaxInactiveInterval());
		int sessionInterval = session.getMaxInactiveInterval();		//web.xml
		out.println("sessionID : " + sessionID + "<br>");
		out.println("sessionInterval : " + sessionInterval + "<br>");
		out.println("================== <br>");
	%>
	<%
		session.removeAttribute("mySessionName1");
		Enumeration<String> names2 = session.getAttributeNames();
		while (names2.hasMoreElements()) {
			String name = (String)names2.nextElement();
			String value = session.getAttribute(name).toString();
			out.println("name : " + name + ", value : " + value + "<br>");
		}
		session.invalidate();
		/*
		try{
			out.println(session.getCreationTime());
			out.println("session is valid");
		} catch (Exception e) {
			out.println("session is invalid");
		}
		*/
		if (request.isRequestedSessionIdValid()) {
			out.println("session is valid<br>");
		} else {
			out.println("session is invalid<br>");
		}
		out.println("================== <br>");
	%>

</body>
</html>