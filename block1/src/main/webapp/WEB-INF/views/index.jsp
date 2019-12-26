<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
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
<h1>Block Details</h1>


  <div class="container text" style="border:1px solid black">
      <form action="/addblock" method="post">
      
      <div class="form-group">
          <label for="blockName">BlockName</label>
            <input type="text" class="form-control" id="blockName" placeholder="Enter Block Name" name="blockName">
     
      </div> 
      
      <div class="button">
           <button type="submit" class="btn btn-primary" value="submit">Submit</button>
      
      </div>
      
      </form>
  </div> 
</body>
</html>