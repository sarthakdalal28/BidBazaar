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
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>
<%@ page import="java.util.*" %>
<%@ page import="java.text.*" %>
<%@ page import="buyme.Auction" %>
<%@ page import="buyme.Bid" %>



<%

	double price = Double.parseDouble(request.getParameter("bid_amount"));
	int auction_id = Integer.parseInt(request.getParameter("auction_id"));
	int user_id = Integer.parseInt(request.getParameter("user_id"));
	
	
	try { 
		
		Bid.createBid(auction_id, user_id, price);
		response.sendRedirect(request.getContextPath() + "/item.jsp?auctionID=" + Integer.toString(auction_id));

		
		
	
		
	} catch(Exception e){
		System.out.println(e);
		out.println(e);
		//out.println("There was an error. Your bid must be at least greater than the previous bid by the increment specified. Please go back and try again.");
		
	}
	
			
	
%>