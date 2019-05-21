<%@ page contentType="text/html;charset=UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %><%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
<title>Spring MVC Form Handling</title>
</head>
<body>

	<h2>Submitted Employee Information</h2>
	<table>
		<tr>
			<td>Name :</td>
			<td>${employee.firstName} ${employee.lastName}</td>
		</tr>
		<tr>
			<td>Email :</td>
			<td>${employee.email} </td>
		</tr>
	</table>
</body>
</html>