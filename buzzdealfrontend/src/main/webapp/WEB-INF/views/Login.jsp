<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login Page</title>


</head>
<body>

<%@ include file="Header.jsp"%>
<h2 align="center">Sign In Here </h2>

<form action="perform_login" method="post">
 <table align="center">
  <tr> 
    <td colspan="2"><center>Login Credential</center></td>
  </tr>
   
   <tr>
     <td>Username:</td>
     <td><input type="text" name="username"/></td>
   </tr>
  
  <tr>
     <td>Password:</td>
     <td><input type="password" name="password"/></td>
   </tr>
  
  <tr>
    <td colspan="2"><input type="submit" value="Submit"/></td>
  </tr>
  
 </table>
</form>
<br><br><br><br><br><br><br>
<%@ include file="Footer.jsp"%>

</body>


</html>