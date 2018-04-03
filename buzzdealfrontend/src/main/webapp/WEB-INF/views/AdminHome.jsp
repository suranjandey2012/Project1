<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Admin Page</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
  
 <style>
 
 #myCarousel
{

 height:200px;
 width:1000px;
 

}
 
 </style> 

</head>
<body>

<%@ include file="Header.jsp"%>

<div align="right">
	
	<a href="logout">
	<img src="<c:url value="/resources/images/Logout2.jpg"/>"  width="70" height="70" alt="logoutimg"/>
	</a>
</div>

<!-- Carousel -->
	<div bgcolor="#a3e4d7">
	<div class="container" align="center">
    <div id="myCarousel" class="carousel slide"  data-ride="carousel">
    <!-- Indicators -->
    <ol class="carousel-indicators">
      <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
      <li data-target="#myCarousel" data-slide-to="1"></li>
      <li data-target="#myCarousel" data-slide-to="2"></li>
      <li data-target="#myCarousel" data-slide-to="3"></li>
      <li data-target="#myCarousel" data-slide-to="4"></li>
    </ol>
    <!-- Wrapper for slides -->
    <div class="carousel-inner">
      <div class="item active">
        <img src="<c:url value="/resources/images/maincar1.jpg"/>" alt="Carousel1" style="width:100%;height:300px">
      </div>

      <div class="item">
        <img src="<c:url value="/resources/images/feat3.jpg"/>" alt="Carousel2" style="width:100%;height:300px">
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
</div>
<br><br><br><br><br><br>
<div style="padding-left:100px;">
&nbsp;&nbsp;&nbsp;<h4>Featured Brands</h4>
 <img src="<c:url value="/resources/images/feat1.jpg"/>" alt="Carousel3" style="width:30%; height:200px">
&nbsp;&nbsp;<img src="<c:url value="/resources/images/feat4.jpg"/>" alt="Carousel3" style="width:30%; height:200px">
&nbsp;&nbsp;<img src="<c:url value="/resources/images/feat3.jpg"/>" alt="Carousel3" style="width:30%; height:200px">

</div>

<br><br><br>
<div style="padding-left:100px;">
&nbsp;&nbsp;&nbsp;<h4>Trending Offer</h4>
 <img src="<c:url value="/resources/images/offer1.jpg"/>" alt="Carousel3" style="width:30%; height:200px">
&nbsp;&nbsp;<img src="<c:url value="/resources/images/offer2.jpg"/>" alt="Carousel3" style="width:30%; height:200px">
&nbsp;&nbsp;<img src="<c:url value="/resources/images/offer3.jpg"/>" alt="Carousel3" style="width:30%; height:200px">

</div>

<br><br><br>
<div style="padding-left:100px;">
&nbsp;&nbsp;&nbsp;<h4>Mobiles</h4>
 <img src="<c:url value="/resources/images/Mob1.jpeg"/>" alt="Carousel3" style="width:20%; height:200px">
&nbsp;&nbsp;<img src="<c:url value="/resources/images/Mob2.jpg"/>" alt="Carousel3" style="width:20%; height:200px">
&nbsp;&nbsp;<img src="<c:url value="/resources/images/Mob3.jpg"/>" alt="Carousel3" style="width:20%; height:200px">
&nbsp;&nbsp;<img src="<c:url value="/resources/images/Mob5.jpeg"/>" alt="Carousel3" style="width:20%; height:200px">
</div>

<br><br><br>
<div style="padding-left:100px;">
&nbsp;&nbsp;&nbsp;<h4>Laptops</h4>
 <img src="<c:url value="/resources/images/Lap4.jpg"/>" alt="Carousel3" style="width:20%; height:200px">
&nbsp;&nbsp;&nbsp;<img src="<c:url value="/resources/images/Lap1.jpg"/>" alt="Carousel3" style="width:20%; height:200px">
&nbsp;&nbsp;&nbsp;<img src="<c:url value="/resources/images/Lap2.jpg"/>" alt="Carousel3" style="width:20%; height:200px">
&nbsp;&nbsp;&nbsp;<img src="<c:url value="/resources/images/Lap3.jpeg"/>" alt="Carousel3" style="width:20%; height:200px">
</div>


<br><br><br>
<div style="padding-left:100px;">
&nbsp;&nbsp;&nbsp;<h4>Bags</h4>
 <img src="<c:url value="/resources/images/bag1.jpg"/>" alt="Carousel3" style="width:20%; height:300px">
&nbsp;&nbsp;<img src="<c:url value="/resources/images/bag2.jpg"/>" alt="Carousel3" style="width:20%; height:300px">
&nbsp;&nbsp;&nbsp;<img src="<c:url value="/resources/images/bag3.jpg"/>" alt="Carousel3" style="width:20%; height:300px">
&nbsp;&nbsp;&nbsp;<img src="<c:url value="/resources/images/bag4.png"/>" alt="Carousel3" style="width:20%; height:270px">
</div>



<br><br><br><br><br><br><br><br>
<div>
<%@ include file="Footer.jsp"%>
</div>
</body>
</html>