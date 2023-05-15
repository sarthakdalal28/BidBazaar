<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ page import ="java.sql.*" %>
<%@ page import = "buyme.Item"%>

<!DOCTYPE html>
<html>
<head>
<title>Delete User</title>
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
</head>
<body>
<%
try{
	Class.forName("com.mysql.jdbc.Driver");
	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/buyme", "root",
			"password");
	Statement st = con.createStatement();
	String uid=request.getParameter("uid");
	Item i=new Item();
	int res2 = st.executeUpdate("DELETE FROM representative WHERE user_id = '"+uid+"'");
	int res=st.executeUpdate("DELETE FROM User WHERE user_id='"+uid+"'");
	if(res>0){
		out.println("Representative deleted");
		out.println("<a href='adminDashboard.jsp'>Return to dashboard.</a>");
	}
	else{
		out.println("Error deleting.");
		out.println("<a href='adminDashboard.jsp'>Return to dashboard.</a>");
	}

}
catch (SQLException se){
	out.println("Error.");
	out.println("<a href='adminDashboard.jsp'>Return to dashboard.</a>");
	se.printStackTrace();
	out.println("Error: " + se.getMessage());
}
catch (Exception e){
	e.printStackTrace();
	out.println("Error: " + e.getMessage());
}
%>
</body>
</html>
