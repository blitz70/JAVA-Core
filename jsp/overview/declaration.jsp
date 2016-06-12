<html>
<body>

<h3>Hello World of Java</h3>

<%!
	String makeItLower(String data) {
		return data.toLowerCase();
	};
%>

Lower case of "Hello World of Java" is <%= makeItLower("Hello World of Java") %>
<br>
Lower case of "Hello World of Java" is <% out.println(makeItLower("Hello World of Java")); %>

</body>
</html>