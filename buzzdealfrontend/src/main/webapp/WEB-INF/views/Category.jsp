<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Category Page</title>
</head>
<body>
<%@ include file="Header.jsp"%>
	<h1 align="center">Category Page</h1>
	<br><br><br><br>
	<form action="InsertCategory" method="post">
		<table align="center">
			<tr bgcolor="829BD0">
				<td colspan="2"><h1>Category Details</h1></td>
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
				<td colspan="2"><center><input type="submit" value="INSERT" /></center>
			</tr>
		</table>
	</form>



</body>
</html>