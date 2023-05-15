<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Buy Me</title>
<%@ include file="./partials/commonCss.jsp"%>

<%@page import="buyme.users"%>
<%@page import="java.sql.*"%>
<%@page import="java.util.*"%>
<%@page import="java.text.*"%>




<link rel="stylesheet" href="css/index.css" type="text/css">

</head>
<body>
	<%@ include file="./partials/navbar.jsp"%>
	<div class="content">

	<%
		if ((session.getAttribute("user") == null)) {
	%>
	You must be logged in to sell an item. Please login or create an account.
	<br />
	<a href="login.jsp">Login</a>
	<a href="register.jsp">Register</a>
	
	<%
		} else { %>
			
			<div class="card">
				<form action='createAuctionHandler.jsp' method='POST'>
					Item Name <input class="input-form" type='text' name='item_name' required><br>
					Image Url <input class="input-form" type='text' name='pic_link'><br/>
					Initial Price <input class="input-form" type='number' name='initial_price' required><br>
					Minimum Sell Price <input class="input-form" type='number' name='min_sell_price' required><br>
					Increment <input class="input-form" type='number' name='increment' required><br/>
					Item Description <textarea class="input-form" name='item_description' required></textarea><br>
					Category Name <input class="input-form" type='text' name='category_name' required><br>
					Subcategory Name <input class="input-form" type='text' name='subcategory_name' required><br>
					End Date <input class="input-form" type='date' name='end_date' required><br>
					
					<input class="btn-secondary" type='submit' value='Post Auction'>
				</form>
			</div>
			
	


	<%
		}
	%>
	</div>


	<%@ include file="./partials/footer.jsp"%>
	<%@ include file="./partials/commonScripts.jsp"%>
</body>
</html>