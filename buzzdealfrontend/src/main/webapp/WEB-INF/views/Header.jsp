<!doctype html>
<html>
<head>
<meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<style>
#headpane
{

 background-color:#4169E1;
 height:40px;
 


}


</style>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
</head>

<body>
<div id="headpane" class="container">
<p align="right">
<a href="https://www.facebook.com/"><img src="<c:url value="/resources/images/Facebook_icon.jpg"/>" width="30" height="30"/></a>
&nbsp;
<a href="https://www.google.com/gmail/about/"><img src="<c:url value="/resources/images/google-plus.jpg"/>" width="40" height="30"/></a>
&nbsp;
<a href="https://github.com/"><img src="<c:url value="/resources/images/image4.png"/>" width="30" height="30"/></a>
</p>
</div>
<br/>

<div class="container">
<nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand" href="#">BuzzDeal</a>
    </div>
    <c:if test="${!sessionScope.loggedIn}">
    <ul class="nav navbar-nav">
      <li><a href="index">Home</a></li>
      <li><a href="login">Login</a></li>
      <li><a href="register">Register</a></li>
      <li><a href="aboutus">AboutUs</a></li>
      <li><a href="contactus">ContactUs</a></li>
     </ul>
    </c:if>
    
    <c:if test="${sessionScope.loggedIn}">
         <c:if test="${sessionScope.role=='ROLE_ADMIN'}">
         <ul class="nav navbar-nav">
         <li><a href="index">Home</a></li>
          <li><a href="category">Category Page</a></li>
          <li><a href="product">Product Page</a></li>
          <li><a href="supplier">Supplier Page</a></li>
         </ul>
         </c:if>
         
         <c:if test="${sessionScope.role=='ROLE_USER'}">
         <ul class="nav navbar-nav">
         <li><a href="index">Home</a></li>
         <li><a href="Cart">${cartsize}<span class="glyphicon glyphicon-shopping-cart"></span></a></li>
         </ul>
         </c:if>
   
   </c:if>
    
    </div>
</nav>
</div>

</body>

</html>
