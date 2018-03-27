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


<form action="perform_login" method="post">
 <table align="center" width=400px>
  <tr bgcolor="#8EF331" height="60px"> 
    <td colspan="2"><center><h3><b>SIGN IN</b></h3></center></td>
  </tr>
   
   <tr bgcolor="#A0A09E" height="100px">
     <td><b>Username</b></td>
     <td><input type="text" name="username" placeholder="Username"/></td>
   </tr>
  <tr bgcolor="#A0A09E" height="100px">
     <td><b>Password</b></td>
     <td><input type="password" name="password" placeholder="Password"/></td>
   </tr>
  
  <tr bgcolor="#A0A09E" height="30px">
    <td colspan="2"><center><input type="submit" value="Login" class="btn btn-danger btn-block"/></center></td>
  </tr>
  
 </table>
</form>
<br><br><br><br><br><br><br>
<%@ include file="Footer.jsp"%>

</body>


</html>