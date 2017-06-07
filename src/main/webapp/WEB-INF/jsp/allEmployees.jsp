<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>All Employees</title>
</head>
<body>
	<table>
		<tr>
			<th>First Name:</th>
			<th>Last Name:</th>
			<th>Salary:</th>
			<th>Department Name:</th>
		</tr>
		
		<c:forEach items="${employees}" var="employee">
			<tr>
				<td>${employee.firstName}</td>
				<td>${employee.lastName}</td>
				<td>${employee.salary}</td>
				<td>${employee.department.deptName}</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>