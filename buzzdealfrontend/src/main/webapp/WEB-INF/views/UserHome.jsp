<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
  
 <style>
 
 #myCarousel
{

  height:200px;
 width:1000px;
 

}

body{
background-color: "cyan";
}
 
 </style> 
<title>User Page</title>
</head>
<body>
	
<%@ include file="Header.jsp"%>
    
    <div align="right">
    <a href="logout">
	<img src="<c:url value="/resources/images/Logout2.jpg"/>"  width="70" height="70" alt="logoutimg"/>
	</a>
	</div>

	

	<!-- Carousel -->
	
	<div class="container" align="center">
    <div id="myCarousel" class="carousel slide"  data-ride="carousel">
    <!-- Indicators -->
    <ol class="carousel-indicators">
      <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
      <li data-target="#myCarousel" data-slide-to="1"></li>
      <li data-target="#myCarousel" data-slide-to="2"></li>
      <li data-target="#myCarousel" data-slide-to="3"></li>
      <li data-target="#myCarousel" data-slide-to="4"></li>
      <li data-target="#myCarousel" data-slide-to="5"></li>
      <li data-target="#myCarousel" data-slide-to="6"></li>
    </ol>
    <!-- Wrapper for slides -->
    <div class="carousel-inner">
      <div class="item active">
        <img src="<c:url value="/resources/images/Carousel3.jpg"/>" alt="Carousel1" style="width:100%;height:300px">
      </div>
      
       <div class="item">
        <img src="<c:url value="/resources/images/maincar1.jpg"/>" alt="Carousel1" style="width:100%;height:300px">
      </div>

      <div class="item">
        <img src="<c:url value="/resources/images/maincar2.png"/>" alt="Carousel2" style="width:100%;height:300px">
      </div>
    
      <div class="item">
        <img src="<c:url value="/resources/images/maincar3.jpg"/>" alt="Carousel3" style="width:100%; height:300px">
      </div>
      
      <div class="item">
        <img src="<c:url value="/resources/images/maincar4.png"/>" alt="Carousel3" style="width:100%; height:300px">
      </div>
      
      <div class="item">
        <img src="<c:url value="/resources/images/maincar5.png"/>" alt="Carousel3" style="width:100%; height:300px">
      </div>
    
      <div class="item">
        <img src="<c:url value="/resources/images/Micarousel.jpg"/>" alt="Carousel3" style="width:100%; height:300px">
      </div>
    </div>
    <!-- Left and right controls -->
    <a class="left carousel-control" href="#myCarousel" data-slide="prev">
      <span class="glyphicon glyphicon-chevron-left"></span>
      <span class="sr-only">Previous</span>
    </a>
    <a class="right carousel-control" href="#myCarousel" data-slide="next">
      <span class="glyphicon glyphicon-chevron-right"></span>
      <span class="sr-only">Next</span>
    </a>
    
  </div>
</div>


<br>
<br>
<br>
<br>
<br>
<br>
<br>



	<!-- Product Viewing Code -->
	
	<div class="container">
		<div class="row">
			<c:forEach items="${listProducts}" var="prod">
             <div class="col-sm-4 col-md-4">
              <a href="productDesc/${prod.productId}" class="thumbnail">
              <img src="<c:url value="/resources/images/${prod.productId}.jpg"/>" width="100" height="150" alt="Generic thumbnail">
            
             </a>
             
             <p>
             ${{prod.productName}}
             </p>
             
             </div>
             </c:forEach>
		</div>
	</div>
	
	
	<br><br><br><br><br>
	<%@ include file="Footer.jsp"%>

</body>
</html>