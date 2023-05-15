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
<%@ page import = "java.sql.*" %>
<%
  String name = request.getParameter("name");
  String username = request.getParameter("username");
  String email = request.getParameter("email");
  String password = request.getParameter("password");
  Class.forName("com.mysql.jdbc.Driver");
  try {
	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/buyme", "root", "password");
    	Statement st = con.createStatement();
    	java.sql.Timestamp date = new java.sql.Timestamp(new java.util.Date().getTime());
    	String insertStatement = String.format("INSERT INTO User (created_at, name, password, username, email) VALUES ('%s', '%s', '%s', '%s', '%s');", date.toString(), name, password, username, email);
    	st.executeUpdate(insertStatement);
    	session.setAttribute("user", username);
    	response.sendRedirect("userPage.jsp");
  } catch(SQLException se) {
  	out.println("Error: <a href='register.jsp'>Try again</a>");
      	se.printStackTrace();
      	out.println("Error: " + se.getMessage());
  } catch(Exception e) {
      	e.printStackTrace();
  }
%>
