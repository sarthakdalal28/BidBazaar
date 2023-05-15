<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ page import = "java.sql.*" %>
<%@ page import = "buyme.Bid" %>
<!DOCTYPE html>
<html>
<head>
<title>Manage Bids</title>
<link rel="stylesheet" href="css/login.css" type="text/css">
<style>
	body {
		display: flex;
		flex-direction: column;
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
</head>
<body>
<h2>All Bids</h2>

<table>
	<tr><th>Bid ID</th><th>Bidder ID</th><th>Price</th><th>Bid Time</th></tr>
<% 
	ResultSet rs= Bid.showBids(Integer.parseInt(request.getParameter("aid")));
	while(rs.next()){
%>
	<tr>
	<td><%=rs.getInt("bid_id")%></td>	
	<td><%=rs.getDouble("user_id")%></td>		
	<td><%=rs.getInt("price")%></td>		
	<td><%=rs.getTimestamp("time_create")%></td>
	<td><form action='editBid.jsp' method='POST'>
	<input type='submit' value='Edit'>
	<input type='hidden' name='aid' value=<%=rs.getInt("auction_id")%>>
	<input type='hidden' name='bid' value=<%=rs.getInt("bid_id")%>>
	</form></td>
	<td><form action='deleteBid.jsp' method='POST'>
	<input type='submit' value='Delete'>"
	<input type='hidden' name='bid' value=<%=rs.getInt("bid_id")%>></form></td>
	</tr>
<% 
	}
%>
</table>

</body>
</html>