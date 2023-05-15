<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ page import ="java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
<title>Manage Users</title>
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
	<a href="custRepDashboard.jsp">Return to dashboard.</a>
	<h3>Manage Customer Accounts</h3>
	<form>
      <input type="text" name="search" placeholder="Username">
      <button type="submit">Search</button>
    </form>
    <table>
    	<tr>
    		<th>Username</th>
    		<th>Full Name</th>
    		<th>Email</th>
    	</tr>
<% 	try{
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/buyme", "root",
				"password");
    	Statement st = con.createStatement();
    	ResultSet rs;
    	String name = request.getParameter("search");
    	if (name != null && name.length() > 0) {
    	    rs = st.executeQuery("SELECT * FROM User WHERE username LIKE'%"+name+"%' AND user_id NOT IN (SELECT user_id FROM Admin) AND user_id NOT IN(SELECT user_id FROM Representative)");
    	} else {
    	    rs = st.executeQuery("SELECT * FROM User WHERE user_id NOT IN (SELECT user_id FROM Admin) AND user_id NOT IN(SELECT user_id FROM Representative)");
    	}
    	while(rs.next()) {
%>
		<tr>
			<td><%=rs.getString("username")%></td>
			<td><%=rs.getString("name")%></td>
			<td><%=rs.getString("email")%></td>
			<td>
			<form action="editUser.jsp" method="POST">
      			<input type="submit" value="Edit">
      			<input type="hidden" value=<%=rs.getString("username")%> name="username">
      			<input type="hidden" value=<%=rs.getString("name")%> name="name">
       			<input type="hidden" value=<%=rs.getString("email")%> name="email">
   			</form>
   			</td>
   			<td>
  			<form method="POST">
   				<input type="submit" value="Delete" onclick="if(confirm('Are you sure? This action cannot be undone.')){form.action='deleteUser.jsp'}">
  				<input type="hidden" name="usn" value=<%=rs.getString("username")%>> 
  			</form>
   			</td>
			
		</tr>     
<%    
		}
	}
	catch(SQLException se){
		se.printStackTrace();
	}
	catch(Exception e){
		e.printStackTrace();
	}
%>
	</table>
</body>
</html>
