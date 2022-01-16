<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="java.util.Date" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% String user = request.getParameter("user"); %>
<h2>Hello <%= user %></h2>
<%! int age=18; %>
<% if(age==18){ %>
	<h3><% out.println("user registered"); %></h3>
<% } %>

<table border="2">
	<% for(int i=1;i<=10;i++){ %>
	<tr>
		<td>Number</td>
		<td><%= 5*i %></td>
	</tr>
	<% } %>
</table>

<%! int add(int x, int y){return x+y; } %>

<h3> <%= "Addition = " +  add(4,3) %></h3>

<h3> <%= new Date() %> </h3>

<%@ page info = "java.util.*" %>

<%@ page errorPage="welcome.jsp" %>
<%= 250/0 %>

</body>
</html>