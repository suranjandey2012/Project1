<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Update Product</title>
<%@ page isELIgnored="false" %>
</head>
<body>
<h1 align="center">Update Category Page</h1>
	<br><br>
	<form action="<c:url value='/UpdateProduct' />"  method="post" >
		<table align="center">
			<tr bgcolor="#BDBDBD">
				<td colspan="2"><h1>Update Product Details</h1></td>
			</tr>
			
			<tr bgcolor="#EAA911">
				<td><h3>Product Id:</h3></td>
				<td><input type="text" name="productId" /></td>
			</tr>

			<tr bgcolor="#EAA911">
				<td><h3>Product Name:</h3></td>
				<td><input type="text" name="productName" /></td>
			</tr>
			
			<tr bgcolor="#EAA911">
				<td><h3>Price:</h3></td>
				<td><input type="text" name="price" /></td>
			</tr>
			
			<tr bgcolor="#EAA911">
				<td><h3>Stock:</h3></td>
				<td><input type="text" name="stock" /></td>
			</tr>
			
			<tr bgcolor="#EAA911">
				<td><h3>CategoryId:</h3></td>
				<td><input type="text" name="categoryId" /></td>
			</tr>
			
			<tr bgcolor="#EAA911">
				<td><h3>SupplierId:</h3></td>
				<td><input type="text" name="supplierId" /></td>
			</tr>

			<tr bgcolor="#EAA911">
				<td><h3>Product Description:</h3></td>
				<td><input type="text" name="productDesc" /></td>
			</tr>

			<tr bgcolor="#EAA911">
				<td colspan="2"><center><input type="submit" value="UPDATE" /></center>
			</tr>
		</table>
	</form>
	
	

</body>
</html>