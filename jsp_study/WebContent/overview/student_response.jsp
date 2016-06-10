<html>
<head>
<meta charset="EUC-KR">
<title>Student Confirmation</title>
</head>
<body>

${param.firstName} ${param.lastName} is confirmed!<br>
<%= request.getParameter("firstName") %> <%= request.getParameter("lastName") %> is confirmed!

</body>
</html>