<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Buy Me</title>
<%@ include file="./partials/commonCss.jsp"%>
<link rel="stylesheet" href="css/index.css" type="text/css">

</head>
<body>
	<%@ include file="./partials/navbar.jsp"%>
	<div class="content">
		<%@ include file="./partials/searchBar.jsp"%>
		<header>
			<div class="heading">
				<p class="hdr-lrg title">Welcome To BidBazaar</p>
				<p class="hdr-med subtitle">Find the perfect bid, win the perfect deal</p>
			</div>
			<div class="reg-login">
			
				<a class="btn-primary" href="login.jsp">Login</a> <a
					class="btn-primary" href="register.jsp">Register</a> <a
					class="btn-primary" href="market.jsp">Let's Shop</a>
			</div>
		</header>
	</div>
	<%@ include file="./partials/commonScripts.jsp"%>
</body>
</html>