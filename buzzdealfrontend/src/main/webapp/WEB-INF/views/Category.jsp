<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<%@ page isELIgnored="false" %>
  
<title>Category Page</title>
</head>
<body>
<%@ include file="Header.jsp"%>
	<h1 align="center">Category Page</h1>
	<br><br><br><br>
	<form action="InsertCategory" method="post" modelAttribute="category">
		<table align="center">
			<tr bgcolor="829BD0">
				<td colspan="2"><h1>Insert Category Details</h1></td>
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
<br><br><br><br>
<table align="center">
<tr bgcolor="829BD0">
<td>Category Id</td>
<td>Category Name</td>
<td>Category Desc</td>
<td>Category Operations</td>
</tr>

<c:forEach items="${catlist}"  var="cat">
<tr bgcolor="19AEBD">
<td>${cat.categoryId}</td>
<td>${cat.categoryName}</td>
<td>${cat.categoryDesc}</td>
<td><a href="<c:url value='/updateCategory/${cat.categoryId}' />">UPDATE</a>
&nbsp;<a href="<c:url value='/DeleteCategory/${cat.categoryId}'/>">DELETE</a></td>
</tr>
</c:forEach>
</table>	
<br><br>




<%@ include file="Footer.jsp"%>

</body>
</html>