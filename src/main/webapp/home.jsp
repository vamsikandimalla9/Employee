<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Home</title>
<style type="text/css">

 #Create{
	text-align:center;
	display: block;
	width: 300px;
	margin:20px auto;
	box-shadow: 0 0 10px rgba(0, 0, 0, .3);
	padding: 20px;
	height: 400px;
	border:1px solid white;
	border-radius:5px;
	
}
hr{
margin-bottom:50px;
}

</style>

</head>
<jsp:include page="header.jsp"></jsp:include>
<body>

	<form id="Create" method="get" >
	<h1>Employee Management</h1>
	<hr>
		<br>
		<a href="employee?action=register">Add Employee</a> <br>
		<a href="employee?action=list">List of Employees</a>
	</form>

</body>
<jsp:include page="footer.jsp"></jsp:include>
</html>