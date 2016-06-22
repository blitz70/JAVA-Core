<html>
<head>
<meta charset="EUC-KR">
<title>Student Confirmation</title>
</head>
<body>

Student ${param.firstName} ${param.lastName} from ${param.country} is confirmed!<br>
Student <%= request.getParameter("firstName") %> <%= request.getParameter("lastName") %> from <%= request.getParameter("country") %> is confirmed!

</body>
</html>