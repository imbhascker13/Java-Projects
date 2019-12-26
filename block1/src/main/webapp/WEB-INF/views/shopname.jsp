<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="/getdish" method="get">


		<select id="shopName" name="shopName">
			<c:forEach var="shop" items="${shopDto}">
				<option value="${shop.shopName}">${shop.shopName}</option>
			</c:forEach>
		</select>

		<button type="submit" value="submit">Submit</button>
	</form>



	<h1>DISHESINASCENDINGORDER</h1>

	<form action="/getdetails" method="get">


		<table border="1" width="70%" cellpadding="2">


			<tr>
				<td>DishName</td>
				<td>DishPrice</td>
				<td>DishType</td>
			</tr>

			<c:forEach var="dish1" items="${dish}">

				<tr>
					<td>${dish1.dishName}</td>
					<td>${dish1.dishPrice}</td>
					<td>${dish1.dishType}</td>

				</tr>
			</c:forEach>

		</table>
	</form>

<a href="getshopname">back</a>


</body>
</html>