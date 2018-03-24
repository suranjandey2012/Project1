<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Cart Page</title>
</head>


<body>

<%@ include file="Header.jsp"%>

<div class="container">
<table align="center"  class="table">
<tr bgcolor="#0F900E">
<td>Product Id</td>
<td>Product Name</td>
<td>Quantity</td>
<td>Price</td>
<td>Total Price</td>
<td>Operation</td>
</tr>


<c:forEach items="${cartItems}"  var="cartItem">
<tr bgcolor="#61E9F6">
    <form action="<c:url value='/updateCartItem/${cartItem.cartItemId}'/>" method="get">
    <td>${cartItem.productId}</td>
     <td>${cartItem.productName}</td>
     <td><input type="text" value="${cartItem.quantity}" name="quantity"></td>
     <td>${cartItem.price}</td>
     <td>${cartItem.price*cartItem.quantity}</td>
    <td>
         <input type="submit" value="Update" class="btn btn-success btn-block"/>
         <a href="<c:url value='/deleteCartItem/${cartItem.cartItemId}'/>" class="btn btn-danger btn-block">Delete</a>
    </td>
 </form>
 </tr>
 </c:forEach>
<tr bgcolor="#0F900E">
   <td colspan="4">TotalAmount</td>
   <td colspan="2">${totalAmount}</td>
</tr bgcolor="#0F900E">

<tr bgcolor="#0F900E">
<td colspan="4"><a href="<c:url value='/UserHome'/>" class="btn btn-danger btn-block">BuyMore</a></td>
<td colspan="2"><a href="<c:url value='/CheckOut'/>" class="btn btn-danger btn-block">CheckOut</a></td>
</tr>
</table>
</div>

<br>
<br>
<br>
<br>
<br>
<br>

<%@ include file="Footer.jsp"%>
</body>
</html>