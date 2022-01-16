<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% int a=0; %>
<p><%= ++a %> </p>

<form action="welcome1.jsp" method="post">
	<input type="text" name="user" />
	<button>submit</button>
</form>
</body>
</html>