<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
     
     
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">

<link rel="stylesheet"
    href="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
<script
    src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script
    src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
<script
    src="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"></script>

<title>Insert title here</title>
</head>
<body>


  <div class="container text" style="border:1px solid black">
      <form action="/addshop" method="post">
            
      <select id="blockName" name="blockName"> 
<c:forEach var="block" items="${blockDto}">
   <option value="${block.blockName}">${block.blockName}</option>
</c:forEach>
   </select>
      
      
      <div class="form-group">
          <label for="shopName">ShopName</label>
            <input type="text" class="form-control" id="shopName" placeholder="Enter Shop Name" name="shopName">
     
      </div>
      
      
      <div class="form-group">
          <label for="shopType">ShopType</label>
            <input type="text" class="form-control" id="shopType" placeholder="Enter Shop Type" name="shopType">
     
      </div> 
      
      <div class="form-group">
          <label for="shopRating">ShopRating</label>
            <input type="text" class="form-control" id="shopRating" placeholder="Enter Shop Rating" name="shopRating">
     
      </div> 
      
      <div class="button">
           <button type="submit" class="btn btn-primary" value="submit">Submit</button>
      
      </div>
      
      </form>
      </div>
      
 


</body>
</html>