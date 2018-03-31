<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Update Supplier Page</title>
<%@ page isELIgnored="false" %>
</head>
<body>

<br><br>
	<form action="updatedSupplier"  method="post" >
		<table align="center">
			<tr bgcolor="829BD0">
				<td colspan="2"><h1>Update Supplier Details</h1></td>
			</tr>
			
			<tr bgcolor="829BD0">
				<td><h3>Supplier Id:</h3></td>
				<td><input type="text" name="suppid" /></td>
			</tr>

			<tr bgcolor="829BD0">
				<td><h3>Supplier Name:</h3></td>
				<td><input type="text" name="suppname" /></td>
			</tr>

			<tr bgcolor="829BD0">
				<td><h3>Supplier Description:</h3></td>
				<td><input type="text" name="suppdesc" /></td>
			</tr>

			<tr bgcolor="829BD0">
				<td colspan="2"><center><input type="submit" value="UPDATE" /></center>
			</tr>
		</table>
	</form>
</body>
</html>