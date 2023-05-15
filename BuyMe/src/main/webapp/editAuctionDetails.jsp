<link rel="stylesheet" href="css/login.css" type="text/css">
<style>
	body {
		display: flex;
		flex-direction: column;
		align-items: center;
		justify-content: center;
		height: 100vh;
		margin: 0;
	}

	h1 {
		font-size: 3em;
		font-weight: bold;
		color: #1a1a1a;
		text-align: center;
		text-shadow: 2px 2px 4px #888888;
		margin-bottom: 1em;
	}

	h2 {
	font-size: 1 em;
	color: #333;
	margin-bottom: 0.5em;
	}

	/* Link Styles */
	a {
	color: #d02323;
	text-decoration: none;
	border-bottom: 2px solid #d02323;
	transition: border-bottom-color 0.3s ease-in-out;
	}

	a:hover {
	color: black;
	}
</style>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ page import="buyme.Auction" %>
<%@ page import="java.sql.*" %>

<% 
Auction.edit(Integer.parseInt(request.getParameter("aid")), 
		request.getParameter("item_name"), 
		Double.parseDouble(request.getParameter("buyAtPrice")), 
		Double.parseDouble(request.getParameter("increment")), 
		request.getParameter("item_description"), request.getParameter("category_name"), 
		request.getParameter("subcategory_name"), 
		java.sql.Timestamp.valueOf(request.getParameter("endDate")));
out.println("Changes saved.");
out.println("<a href='custRepDashboard.jsp'>Return to dashboard.</a>");
%>

