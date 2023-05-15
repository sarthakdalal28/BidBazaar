<!DOCTYPE html>
<html>
   <head>
      <title>Questions Forum: </title>
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
     
	<h1>Create a post!</h1>
	<% 
	String threadid = request.getParameter("threadid");
	String user = (String)session.getAttribute("user");//actually don't even need to pass this, cause they're logged in
	String action = "createPostDetails.jsp?threadid=" + threadid + "&user=" + user;	
	%>
	
	<form method="post" action="<%=action%>">
	
		<label>Body</label>
		<textarea name="body" placeholder="What do you want to say"  required></textarea>
		<input type="submit" name="po_submit" value="Submit"></input>

		</form>
     
   </body>
</html>