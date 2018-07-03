<%@ page language="java" import="com.employee.bean.Employee" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
input[type="text"]{
margin-bottom:20px;
box-shadow: 0 0 10px rgba(0, 0, 0, .3);
 -moz-border-radius: 15px;
 border-radius: 5px;
    border:solid 0.5px grey; 
    padding:5px;
    width:250px
}
 form{
	text-align:center;
	display: block;
	width: 500px;
	margin:20px auto;
	box-shadow: 0 0 10px rgba(0, 0, 0, .3);
	padding: 20px;
	height: 500px;
	border:1px solid white;
	border-radius:5px;
	
}

hr{
margin-bottom:50px;
}

</style>
</head>
<body>
<jsp:include page="header.jsp"></jsp:include>
<form id="Create" action="employee?action=update" method="post">
	<h1> Update</h1>
	<hr>
	<%
	Employee e=(Employee)request.getAttribute("employee");
	
	%>
	<table>
	
		<tr>
		<td>EmployeeId :</td>
		<td><input type="text" name="eid" value="<%=e.getId() %>" readonly></td>
		</tr>
		<tr>
		<td>Name :</td>
		<td><input type="text" name="name" value="<%=e.getName() %>"></td>
		</tr>
		<tr>
		<td>Number :</td>
		<td><input type="text" name="number" value="<%=e.getNumber() %>"></td>
		</tr>
		<tr>
		<td>Address :</td>
		<td><input type="text" name="address" value="<%=e.getAddress() %>"></td>
		</tr>
		<tr>
		<td>Email :</td>
		<td><input type="text" name="email" value="<%=e.getEmail() %>"></td>
		</tr>
		<tr>
		<td>Salary :</td>
		<td><input type="text" name="salary" value="<%=e.getSalary() %>"></td>
		</tr>
		<tr>
		<td><input type="submit" value="Submit"></td>
		<td><a href="employee?action=cancel"> 
		<input type="button" value="Cancel"></a></td>
		
		</tr>
		</table>
	
	</form>
<jsp:include page="footer.jsp"></jsp:include>

</body>
</html>