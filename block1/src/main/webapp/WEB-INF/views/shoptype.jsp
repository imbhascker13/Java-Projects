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

 <form action="getshopdetails" method="get">
       
            
<select id="shopType" name="shopType"> 
   <option value="north">north</option>
   <option value="south">south</option>

   </select>
   <br>
   
     <button type="submit"  value="submit">Submit</button>
     

 </form>
 
 <h1>SHOPDETAILS</h1>
	

		<table  border="1" width="70%" cellpadding="2">
		
		
		
		
		<tr>
		<td>ShopName</td>
		<td>ShopType</td>
		<td>ShopRating</td>
		</tr>
		  <c:forEach var="shop" items="${shopDto}">
				<tr>
					<td>${shop.shopName}</td> 
					 <td>${shop.shopType}</td> 
					<td>${shop.shopRating}</td>
					
				</tr>
				</c:forEach>
			

		</table>
      
    

</body>
</html>