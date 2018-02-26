<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<%@ page isELIgnored="false" %>
<title>Product Page</title>
</head>
<body>
 <%@ include file="Header.jsp"%>
	<form:form action="InsertProduct" modelAttribute="product" method="post">
		<br>
		<br>
		<br>
		<br>
		<table align="center">
		<tr bgcolor="#BDBDBD">
				<td colspan="2"><center><h2>Insert Product</h2></center></td>
			</tr>
            <tr bgcolor="#EAA911">		
				<td>Product Name</td>
				<td><form:input path="productName" /></td>
			</tr>
			<tr bgcolor="#EAA911"> 
				<td>Price</td>
				<td><form:input path="price" /></td>
			</tr>
			<tr bgcolor="#EAA911">
				<td>Stock</td>
				<td><form:input path="stock" /></td>
			</tr>
			<tr bgcolor="#EAA911">
				<td>CategoryId</td>
				<td><form:input path="categoryId" /></td>
			</tr>
			<tr bgcolor="#EAA911">
				<td>SupplierId</td>
				<td><form:input path="supplierId" /></td>
			</tr>
			<tr bgcolor="#EAA911">
				<td>Product Description</td>
				<td><form:input path="productDesc" /></td>
			</tr>
			<tr bgcolor="#EAA911">
				<td colspan=2><center>
						<input type="submit" value="Insert">
					</center></td>
			</tr>

		</table>
	</form:form>
	
<br><br><br><br>
<table align="center">
<tr bgcolor="#BDBDBD">
<td>Product Id</td>
<td>Product Name</td>
<td>Product Desc</td>
<td>Category Id</td>
<td>Supplier Id</td>
<td>Stock</td>
<td>Price</td>
<td>Category Operations</td>
</tr>

<c:forEach items="${listProducts}"  var="prod">
<tr bgcolor="#EAA911">
<td>${prod.productId}</td>
<td>${prod.productName}</td>
<td>${prod.productDesc}</td>
<td>${prod.categoryId}</td>
<td>${prod.supplierId}</td>
<td>${prod.stock}</td>
<td>${prod.price}</td>
<td><a href="<c:url value='/updateProduct/${prod.productId}'/>">UPDATE</a>
&nbsp;<a href="<c:url value='/deleteProduct/${prod.productId}'/>">DELETE</a></td>
</tr>
</c:forEach>
</table>	
<br><br>


	
	
	
	
</body>
</html>