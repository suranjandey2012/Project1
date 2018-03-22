<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
  
<title>Product Description</title>
</head>
<body>
	<%@ include file="Header.jsp"%>
	
	<div class="container">
		<table class="table">
			<tr>
				<td rowspan="9">
				<img src="<c:url value="/resources/images/${product.productId}.jpg"/>" height="600px" width="600px"/></td>
			</tr>
              
             <tr>
               <td>Product Id</td>
               <td>${product.productId}</td>
             </tr>  
             
             <tr>
               <td>Product Name</td>
               <td>${product.productName}</td>
             </tr>  
             
             <tr>
               <td>Product Description</td>
               <td>${product.productDesc}</td>
             </tr>  
             
             <tr>
               <td>Product Price</td>
               <td>${product.price}</td>
             </tr>  
             
             <tr>
               <td>Category Id</td>
               <td>${product.categoryId}</td>
             </tr>  
             
             <tr>
               <td>Supplier Id</td>
               <td>${product.supplierId}</td>
             </tr>
             
             <tr>
               <td>Stock</td>
               <td>${product.stock}</td>
             </tr>  
             
             <tr>
               <td>Quantity</td>
               <td><select name="quantity" class="form-control btn-block">
               <option value="1">1</option>
               <option value="2">2</option>
               <option value="3">3</option>
               <option value="4">4</option>
               <option value="5">5</option>
               <option value="6">6</option>
               </select></td>
             </tr> 
             
             <tr colspan="1">
               <td><input type="submit" value="AddToCart" class="btn btn-danger btn-block"/></td>
             </tr>    


		</table>
	</div>
	<br>
	<br>
	<br>
	<br>
	<br>
	<br>
	<br>
	<br>
	<br>
	<br>
	<%@ include file="Footer.jsp"%>
</body>
</html>