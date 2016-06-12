<html>
<head>
<meta charset="EUC-KR">
<title>Student Confirmation</title>
</head>
<body>
	Student confirmed!
	<br> Name : ${param.firstName} ${param.lastName}
	<br> Language
	<ul>
		<%
			String[] langList = request.getParameterValues("language");
			for (String lang : langList) {
				out.println("<li>" + lang + "</li>");
			}
		%>
	</ul>
</body>
</html>