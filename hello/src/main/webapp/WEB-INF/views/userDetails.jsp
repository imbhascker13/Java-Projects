<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<!-- Static content -->
<link rel="stylesheet" href="/resources/css/style.css">
<script type="text/javascript"></script>

<title>Spring Boot</title>
</head>
<body>
	<h1>Spring Boot - MVC web application example</h1>
	<hr>
	<table>
	<tr>
		<th>Name</th>
		<th>Mid</th>
		<th>Salary</th>
	</tr>
	<c:forEach var="employee" items="${employee}">
	<tr>
		<td>${employee.name}</td>
		<td>${employee.mid}</td>
		<td>${employee.salary}</td>
	</tr>
		</c:forEach>
	</table>
</body>
</html>