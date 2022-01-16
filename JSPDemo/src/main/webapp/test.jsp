<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@ include file="header.jsp" %> <br>
Today is : <%= java.util.Calendar.getInstance().getTime() %>

<%@ include file="footer.jsp" %>

<%@ taglib uri="" %>



</body>
</html>