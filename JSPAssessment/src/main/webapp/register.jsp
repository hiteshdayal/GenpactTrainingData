<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
	tr{
		padding:10px;
		margin-bottom:15px;
		font-family:cursive;
	}
	.btn{
		font-family: cursive;
    background: chocolate;
    border: none;
    border-radius: 5px;
    padding: 5px 10px;
	}
	body{
	background: linear-gradient(
45deg
, #00000042, transparent,#00000042,#00000042,#00000042,transparent);

	}
</style>
</head>
<body>
 <div>
 
 <form action="register" method="post">
 <table>
 <tr><h3 style="font-family:cursive">Employee Register Form</h3></tr>
 <tr><td>First Name</td>  <td><input type="text" name="fname" placeholder="Enter firstname" > </td></tr>
 <tr><td>Last Name</td>  <td><input type="text" name="lname" placeholder="Enter lastname" > </td></tr>
 <tr><td>User Name</td>  <td><input type="text" name="uname" placeholder="Enter username" ><td> </tr>
 <tr><td>Password</td>  <td><input type="password" name="password" placeholder="Enter password" ></td> </tr>
 <tr><td>Address</td>  <td><input type="text" name="address" placeholder="Enter address" ><td> </tr>
 <tr><td>Contact</td>  <td><input type="text" name="contact" placeholder="Enter contact" ></td> </tr>
 <tr><td></td><td><button class="btn">submit</button><td></tr>
 
 
 <input type="hidden" name="Hitesh">
 </table>
 </form>
 </div>
 
 
</body>
</html>