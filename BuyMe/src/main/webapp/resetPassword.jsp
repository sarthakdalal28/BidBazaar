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
<%@ page import ="java.sql.*" %>
<%
String usn=request.getParameter("usn");
try{
	Class.forName("com.mysql.jdbc.Driver");
	Connection con = DriverManager.getConnection("jdbc:mysql://cs336.c7mvfesixgy7.us-east-2.rds.amazonaws.com:3306/buyme", "cs336", "thisisareallysecurepassword551");
	Statement st = con.createStatement();
	PreparedStatement update = con.prepareStatement("UPDATE User SET password = 'password' WHERE username = ?");
	update.setString(1,usn);
	int res=update.executeUpdate();
	if(res>=0){
		out.println("Password has been reset.");
	}
}
catch(SQLException se){
	se.printStackTrace();
}
catch(Exception e){
	e.printStackTrace();
}
%>
<!DOCTYPE html>
<html>
<head>
<title>Reset Password</title>
</head>
<body>
	<p></p>
</body>
</html>