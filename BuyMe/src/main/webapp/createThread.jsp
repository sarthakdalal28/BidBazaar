<%@ page import="java.io.*,java.util.*,java.sql.*"%>
<!DOCTYPE html>
<html>
   <head>
      <title>Create Thread Form</title>
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
     	<h1>Create a thread</h1>
	<% 
   	 if ((session.getAttribute("user") == null)) {
	%>
    	You are not logged in<br/>
    	<a href="login.jsp">Please Login</a>
    	<%
   	 }else{
		//String action = "createThreadDetails.jsp";	
		//out.println("<form method='post' action='" + action + "'>");
	%>
	<form action="createThreadDetails.jsp" method="POST">
		
		<label>Title</label>
		<input type="text" name="title" required></input>

		<label>Description</label>
		<textarea name="body" placeholder="My question is..."  required></textarea>

		<input type="submit" value="Submit"></input>


	</form>
     
     <%
   	 }
     %>
     
   </body>
</html>
