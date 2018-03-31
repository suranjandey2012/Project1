<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<%@ page isELIgnored="false" %>

<title>Supplier Page</title>
</head>
<body>
<%@ include file="Header.jsp"%>
	
	<br><br><br><br>
	<form action="InsertSupplier" method="post"  modelAttribute="Supplier">
		<table align="center">
			<tr bgcolor="829BD0">
				<td colspan="2"><h1>Insert Supplier Details</h1></td>
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
				<td colspan="2"><center><input type="submit" value="INSERT" /></center>
			</tr>
		</table>
	</form>
	
<br><br><br><br>
<table align="center">
<tr bgcolor="829BD0">
<td>Supplier Id</td>
<td>Supplier Name</td>
<td>Supplier Desc</td>
<td>Supplier Operations</td>
</tr>

<c:forEach items="${supplist}" var="supp">
<tr bgcolor="19AEBD">
<td>${supp.supplierId}</td>
<td>${supp.supplierName}</td>
<td>${supp.supplierDesc}</td>
<td><a href="<c:url value='/updateSupplier'/>">UPDATE</a>
&nbsp;<a href="<c:url value='/DeleteSupplier/${supp.supplierId}'/>">DELETE</a></td>
</tr>
</c:forEach>
</table>	
<br><br>




<%@ include file="Footer.jsp"%>
	
	
	
	
	
	
</body>
</html>