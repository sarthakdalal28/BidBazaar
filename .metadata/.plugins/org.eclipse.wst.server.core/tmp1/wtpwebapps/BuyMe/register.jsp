<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Register Form</title>
<%@ include file="./partials/commonCss.jsp" %>
<link rel="stylesheet" href="css/register.css" type="text/css">

</head>
  <body>
  	<div class="content">
  		<header>
        	<%@ include file="./partials/navbar.jsp" %>
	  	</header>
	  	<div class="register-card-container">
	  		<div class="card register-card">
				<p class="register-title hdr-med">BidBazaar</p>	
	  			<form action="checkRegisterDetails.jsp" method="POST">
		  			<div>
						<label class="input-label" for="name">Full Name</label>
		  				<input class="input-form" id="name" type="text" name="name" required/>
		  			</div>
		  			<div>
						<label class="input-label" for="username">Username</label>
		  				<input class="input-form" id="username" type="text" name="username" required/>
		  			</div>
		  			<div>
						<label class="input-label" for="email">Email</label>
		  				<input class="input-form" id="email" type=email name="email" required/>
		  			</div>
		  			<div>
						<label class="input-label" for="password">Password</label>
		  				<input class="input-form" id="password" type=password name="password" required/>
		  			</div>
		  			<div class="register-button-container">
						<button class="btn-secondary" type="submit">Register</button>
					</div>
	      		</form>
				<a class="link" href="login.jsp">Already have an account?</a>
	  		</div>
	  	</div>
	    
  	</div>
 	<%@ include file="./partials/footer.jsp" %>
  </body>
</html>
