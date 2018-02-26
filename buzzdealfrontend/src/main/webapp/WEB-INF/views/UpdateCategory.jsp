<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Update Category</title>
<%@ page isELIgnored="false" %>
</head>
<body>

<h1 align="center">Update Category Page</h1>
	<br><br>
	<form action="<c:url value='/UpdateCategory' />"  method="post" >
		<table align="center">
			<tr bgcolor="829BD0">
				<td colspan="2"><h1>Update Category Details</h1></td>
			</tr>
			
			<tr bgcolor="829BD0">
				<td><h3>Category Id:</h3></td>
				<td><input type="text" name="catid" /></td>
			</tr>

			<tr bgcolor="829BD0">
				<td><h3>Category Name:</h3></td>
				<td><input type="text" name="catname" /></td>
			</tr>

			<tr bgcolor="829BD0">
				<td><h3>Category Description:</h3></td>
				<td><input type="text" name="catdesc" /></td>
			</tr>

			<tr bgcolor="829BD0">
				<td colspan="2"><center><input type="submit" value="UPDATE" /></center>
			</tr>
		</table>
	</form>
	
	

</body>
</html>