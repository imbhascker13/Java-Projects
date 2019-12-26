<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
         
<script src="https://code.jquery.com/jquery-1.11.1.min.js"></script>
<script src="https://cdn.jsdelivr.net/jquery.validation/1.16.0/jquery.validate.min.js"></script>
<script src="https://cdn.jsdelivr.net/jquery.validation/1.16.0/additional-methods.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/jquery-validate/1.19.1/additional-methods.min.js"
integrity="sha256-vb+6VObiUIaoRuSusdLRWtXs/ewuz62LgVXg2f1ZXGo=" 
crossorigin="anonymous"></script>
    
 
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
      <form action="/adddish" method="post">
      
      
      
       
<select id="shopName" name="shopName"> 
<c:forEach var="shop" items="${shopDto}">
   <option value="${shop.shopName}">${shop.shopName}</option>
</c:forEach>
   </select>

      
      
      <div class="form-group">
          <label for="dishName">DishName</label>
            <input type="text" class="form-control" id="dishName" placeholder="Enter Dish Name" name="dishName">
     
      </div>
      
      
      <div class="form-group">
          <label for="dishPrice">DishPrice</label>
            <input type="text" class="form-control" id="dishPrice" placeholder="Enter Dish price" name="dishPrice">
     
      </div> 
      
      <div class="form-group">
          <label for="dishType">DishType</label>
            <input type="text" class="form-control" id="dishType" placeholder="Enter dish type" name="dishType">
     
      </div> 
      
      <div class="button">
           <button type="submit" class="btn btn-primary" value="submit">Submit</button>
      
      </div>
      </form>
      </div>

     <script>
$('form').validate({
	
	rules:{
		
		dishName:{
			required:true,
            lettersonly:true,
             minlength:6
		},
		
		dishPrice:{

			required:true,
			digits:true,
		},
		dishType:{
			required:true,
            lettersonly:true,
             minlength:4
		}
		
	}
	});
</script>

      

</body>
</html>