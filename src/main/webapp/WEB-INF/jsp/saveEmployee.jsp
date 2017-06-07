<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Employee Form</title>
</head>
<body>

	Welcome to Employee Form
	
	<spring:form method="post" action="saveEmployee.spring" commandName="employeeModel">
	
		<table>
			<tr>
				<td>First Name:</td>
				<td><spring:input path="firstname"/></td>
			</tr>
			<tr>
				<td>Last Name:</td>
				<td><spring:input path="lastName"/></td>
			</tr>
			<tr>
				<td>Salary:</td>
				<td><spring:input path="salary"/></td>
			</tr>
			<tr>
				<td></td>
				<td><input type="submit" value="Submit"/></td>
			</tr>
		</table>
	
	</spring:form>

</body>
</html>