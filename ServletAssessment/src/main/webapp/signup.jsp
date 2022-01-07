<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div class="row">
<div class="col-lg-4"></div>
<div class="col-lg-4">
<form action="signup" method="get">
	
  <div class="form-group">
    <label for="">Name</label>
    <input type="text" class="form-control" name="name" id="">
    
  </div>
  <div class="form-group">
    <label for="">City</label>
    <input type="text" class="form-control" name="city" id="" >
  </div>
  <div class="form-group">
    <label for="">Country</label>
    <input type="text" class="form-control" name="country" id="" >
  </div>
  <div class="form-group">
    <label for="">Username</label>
    <input type="text" class="form-control" name="uname" id="" >
  </div>
  <div class="form-group">
    <label for="">Password</label>
    <input type="password" class="form-control" name="password" id="" >
  </div>
  <button type="submit" class="btn btn-primary">Submit</button>
  
  
  
</form>
</div>

</body>
</html>