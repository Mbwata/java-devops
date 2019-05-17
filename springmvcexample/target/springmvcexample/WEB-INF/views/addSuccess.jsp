<%@ page contentType="text/html;charset=UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<html>
<head>
<title>Spring MVC Form Handling</title>
</head>
<body>

	<h2>Submitted Employee Information</h2>
	<table>
		<tr>
			<td>F Name :</td>
			<td>${employee.firstName}</td>
                        <td>${employee}</td>
		</tr>
		<tr>
			<td>ID :</td>
			<td>${lastName}</td>
		</tr>
		<tr>
			<td>Contact Number :</td>
			<td>${email}</td>
		</tr>
                <tr>
			<td>Test :</td>
			<td><spring:message  text="email" /></td>
                        <td><input type="text" name="email" value="email" /></td>
		</tr>
	</table>
</body>
</html>