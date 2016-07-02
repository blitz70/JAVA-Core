<%@page import="java.sql.*"%>
<%@page import="kr.co.iamtek.*"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%
	//DB
	Connection myConn = null;
	Statement myStmt = null;
	ResultSet myRs = null;
	String sql;
	
	//member data
	String name = null, id = null, pw = null, phone = null, gender = null;
	String[] phoneSplit = null;;
	
	try {
		id = session.getAttribute("id").toString();

		Class.forName(DB.DRIVER);
		myConn = DriverManager.getConnection(DB.URL, DB.USER, DB.PASSWORD);
		myStmt = myConn.createStatement();
		
		sql = "SELECT * FROM members WHERE id='" + id + "'";
		myRs = myStmt.executeQuery(sql);
		while(myRs.next()) {
			name = myRs.getString("name");
			pw = myRs.getString("pw");
			phone = myRs.getString("phone");
			phoneSplit = phone.split("-");
			gender = myRs.getString("gender");
		}
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<form action="CheckModify" method="post">
		이름 : <input type="text" name="name" value="<%= name %>" /><br>
		아이디 : <input type="text" readonly="readonly" name="id" value="<%= id %>" /><br>
		암호 : <input type="password" name="pw" value="<%= pw %>"/><br>
		전화번호 : <select name="phone1" >
			<option value="016">016</option>
			<option value="017">017</option>
			<option value="018">018</option>
			<option value="019">019</option>
			<option value="011">011</option>
		<%
		switch (phoneSplit[0]) {
		case "010":
		%>
			<option value="010" selected="selected">010</option>
		<%
			break;
		case "016":
		%>
			<option value="016" selected="selected">016</option>
		<%
			break;
		case "017":
		%>
			<option value="017" selected="selected">017</option>
		<%
			break;
		case "018":
		%>
			<option value="018" selected="selected">018</option>
		<%
			break;
		case "019":
		%>
			<option value="019" selected="selected">019</option>
		<%
			break;
		case "011":
		%>
			<option value="011" selected="selected">011</option>
		<%
			break;
		default:
			break;
		}
		%>
		</select>
		<input type="text" name="phone2" value="<%= phoneSplit[1] %>" size="5">
		<input type="text" name="phone3" value="<%= phoneSplit[2] %>" size="5"><br>
		<%
			if (gender.equals("male")) {
		%>
				성별 : <input type="radio" name="gender" value="male" checked="checked">남
				<input type="radio" name="gender" value="female" >여<br>
		<%
			} else {
		%>
				성별 : <input type="radio" name="gender" value="male">남
				<input type="radio" name="gender" value="female" checked="checked">여<br>
		<%
			}
		%>
		<input type="submit" value="회원수정">
		<input type="reset" value="취소">
	</form>

</body>
</html>
<%
	} catch (Exception e) {
		response.sendRedirect("gate.html");
		e.printStackTrace();
	} finally {
		try {
			if (!myRs.isClosed()) myRs.close();
			if (!myStmt.isClosed()) myStmt.close();
			if (!myConn.isClosed()) myConn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
%>