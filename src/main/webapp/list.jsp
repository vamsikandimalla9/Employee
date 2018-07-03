<%@ page language="java" import = "java.util.Set,com.employee.bean.Employee" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>List Of Students</title>
<style type="text/css">
form{
	text-align:center;
	display: block;
	width: 100%;
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
a {
    text-decoration: none !important;
}
table, th, td {
    border: 1px solid black;
    border-collapse: collapse;
    box-shadow: 0 0 10px rgba(0, 0, 0, .3);
    margin-bottom:20px;
}
th, td {
   padding: 5px;
}
th {
    text-align: left;
}
</style>
</head>
<body>
	<jsp:include page="header.jsp"></jsp:include>
	<form >
		<h1>List Of Employee</h1>
		<hr>
		<br>
		<table style="width: 100%">
			<tr>
				<th>EmployeeId</th>
				<th>Name</th>
				<th>Number</th>
				<th>Address</th>
				<th>Email</th>
				<th>Salary</th>
				<th>Update</th>
				<th>Remove</th>
			</tr>
			<%
				ServletContext context = getServletContext();
				Set<Employee> employee=(Set<Employee>)context.getAttribute("data");
				for(Employee e:employee){
			%>
			<tr>
				<td>
				<%= e.getId() %>
				</td>
				<td>
				<%= e.getName() %>
				</td>
				<td>
				<%= e.getNumber() %>
				</td>
				<td>
				<%= e.getAddress() %>
				</td>
				<td>
				<%= e.getEmail() %>
				</td>
				<td>
				<%= e.getSalary() %>
				</td>
				<td>
				<a href="employee?action=edit&id=<%=e.getId() %>">Update</a>
				</td>
				<td>
				<a href="employee?action=delete&id=<%=e.getId() %>">Delete</a>
				</td>
			</tr>
			<%
			}
			%>
		</table>
		
		<button><a href="home.jsp">Home</a></button>
	</form>

	<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>