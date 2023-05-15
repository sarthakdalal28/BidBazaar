<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ page import = "java.sql.*" %>
<%@ page import = "buyme.Auction" %>
<!DOCTYPE html>
<html>
<head>
<title>Manage Auctions</title>
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
<h2>Active Auctions</h2>

<table>
	<tr><th>Auction ID</th><th>Item Name</th><th>Start Date</th><th>End Date</th></tr>
<% 
	Auction a=new Auction();
	ResultSet rs=a.show();
	while(rs.next()){
%>
	<tr>
		<td><%=rs.getInt("auction_id")%></td>	
	    <td><%=rs.getString("item_name")%></td>		
	    <td><%=rs.getTimestamp("start_date")%></td>		
	    <td><%=rs.getTimestamp("end_date")%></td>
	    <td>
	    <form action='editAuction.jsp' method='POST'>
	    <input type='submit' value='Edit'>
	    <input type='hidden' name='aid' value=<%=rs.getInt("auction_id")%>>
	    </form>
	    </td>
	    <td>
	    <form method='POST'>
	    <input type='submit' value='Delete' onclick="if(confirm('Are you sure? This action cannot be undone.')){form.action='deleteAuction.jsp'}">
	    <input type='hidden' name='aid' value=<%=rs.getInt("auction_id")%>>
	    </form>
	    </td>
	</tr>

<%
}
%>
</table>

</body>
</html>