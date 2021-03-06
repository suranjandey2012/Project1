<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login Page</title>
<style>
@import "bourbon";

body {
	background: #eee !important;	
}

.wrapper {	
	margin-top: 80px;
  margin-bottom: 80px;
  
}

.form-signin {
  max-width: 380px;
  padding: 15px 35px 45px;
  margin: 0 auto;
  background-color: #aed6f1;
  border: 1px solid rgba(0,0,0,0.1);  

  .form-signin-heading,
	.checkbox {
	  margin-bottom: 30px;
	}

	.checkbox {
	  font-weight: normal;
	}

	.form-control {
	  position: relative;
	  font-size: 16px;
	  height: auto;
	  padding: 10px;
		@include box-sizing(border-box);

		&:focus {
		  z-index: 2;
		}
	}

	input[type="text"] {
	  margin-bottom: -1px;
	  border-bottom-left-radius: 0;
	  border-bottom-right-radius: 0;
	}

	input[type="password"] {
	  margin-bottom: 20px;
	  border-top-left-radius: 0;
	  border-top-right-radius: 0;
	}
}

</style>
</head>
<body>

<%@ include file="Header.jsp"%>

<div class="wrapper">
    <form class="form-signin" action="perform_login" method="post">       
      <h2 class="form-signin-heading"><center>Sign In</center></h2>
      <input type="text" class="form-control" name="username" placeholder="Username" required="" autofocus="" />
      <br><br>
      <input type="password" class="form-control" name="password" placeholder="Password" required=""/>  
      <br><br>    
            <button class="btn btn-lg btn-primary btn-block" type="submit">Login</button>   
    </form>
  </div>
<br><br><br><br><br><br><br>
<%@ include file="Footer.jsp"%>

</body>


</html>