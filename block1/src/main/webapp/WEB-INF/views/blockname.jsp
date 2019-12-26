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
<form action="/getall" method="get">
            
      <select id="blockName" name="blockName"> 
<c:forEach var="block" items="${blockDto}">
   <option value="${block.blockName}">${block.blockName}</option>
</c:forEach>
   </select>
   
   <button type="submit" value="submit">Submit</button>
      </form>
      

	<h1>ALLDETAILS</h1>

	<form action="/getdetails" method="get">


		<table border="1" width="70%" cellpadding="2">


			<tr>
			    <td>ShopName</td>
			    <td>ShopType</td>
			    <td>ShopRating</td>
				<td>DishName</td>
				<td>DishPrice</td>
				<td>DishType</td>
			</tr>

			<c:forEach var="shop" items="${shopDto}">
			
			<c:forEach var="dish" items="${shop.getDishDto()}"> 

				<tr>
				    <td>${shop.shopName}</td>
				    <td>${shop.shopType}</td>
				    <td>${shop.shopRating}</td>
					<td>${dish.dishName}</td>
					<td>${dish.dishPrice}</td>
					<td>${dish.dishType}</td>

				</tr>
			</c:forEach>
			</c:forEach>

		</table>
	</form>

<a href="getblockname">back</a>

</body>
</html>