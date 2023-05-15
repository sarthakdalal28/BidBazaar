<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Create Customer Rep</title>
<%@ include file="./partials/commonCss.jsp"%>
<link rel="stylesheet" href="css/login.css" type="text/css">
</head>
<body>
	<h1>Create Customer Representative Account</h1>
	<div class="card">
	<form action="checkRepDetails.jsp" method="POST">
      		Representative Full Name: <input class="input-form" type="text" name="name"/> <br/>
   	   	Representative Email: <input class="input-form" type="text" name="email"/> <br/>
		Username: <input class="input-form" type="text" name="username"/> <br/>
		Password: <input class="input-form" type="password" name="password"/> <br/>
      		<input class="btn-secondary" type="submit" value="Create Account">
     	</form>
     	</div>
</body>
</html>
