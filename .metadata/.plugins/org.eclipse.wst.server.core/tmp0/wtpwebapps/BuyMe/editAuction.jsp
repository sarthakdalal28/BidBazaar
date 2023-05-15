<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ page import="buyme.Auction" %>
<%@ page import="java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
<title>Edit Auction</title>
<%@ include file="./partials/commonCss.jsp"%>
<link rel="stylesheet" href="css/login.css" type="text/css">
</head>
<body>
<%
	Auction a=new Auction();
	ResultSet rs=a.showEdit(Integer.parseInt(request.getParameter("aid")));
	ResultSet rs2 = a.show();
	if(rs.next()){
%>	
<div class="card">
<form action='editAuctionDetails.jsp' method='POST'>
	Item Name <input class="input-form" type='text' name='itemName' value=<%=rs.getString("item_name")%>><br>
	Buy At Price <input class="input-form" type='number' value=<%=rs.getDouble("buy_at_price")%> name='buyAtPrice'><br>
	Increment <input class="input-form" type='number' name='increment' value=<%=rs.getDouble("increment") %>><br>
	Item Description <textarea class="input-form" name='itemDescription'><%=rs.getString("item_description")%></textarea><br>
	Category Name <input class="input-form" type='text' name='categoryName' value=<%=rs.getString("category_name")%>><br>
	Subcategory Name <input class="input-form" type='text' name='subcategoryName' value=<%=rs.getString("subcategory_name")%>><br>
	End Date <input class="input-form" type='datetime' name='endDate' value=<%=rs.getTimestamp("end_date")%>><br>
	<input type='hidden' value=<%=rs.getInt("auction_id")%> name='aid'>
	<%-- <input type='hidden' name='aid' value='<%= request.getParameter("aid") %>'> --%>
	<input class="btn-secondary" type='submit' value='Save Changes'>
</form>
</div>
<%
	}
%>
<br>
<form action="bidManager.jsp" method="POST">
	<input class="btn-secondary" type="submit" value="Edit Bids">
	<input type="hidden" name="aid" value=<%=request.getParameter("aid")%>>
</form>

</body>
</html>