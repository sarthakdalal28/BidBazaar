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
<%@ page import ="java.sql.*" %>
<%@ page import="java.io.*,java.util.*,java.sql.*"%>
<%
	try {
  	String user = (String)session.getAttribute("user");//request.getParameter("user"); 
	//String threadid = request.getParameter(threadid);//SQL does this automatically??...
    //String title = request.getParameter("title");
	//String desc = request.getParameter("description");
    Class.forName("com.mysql.jdbc.Driver");
    String url = "jdbc:mysql://localhost:3306/buyme";
	Connection con = DriverManager.getConnection(url, "root", "password");
    Statement st = con.createStatement();

    	//just incase, a double check
		if(user == null || user.equals("null")){//all the post data will be lost, they weren't logged in :/, this case shouldn't happen
			response.sendRedirect("login.jsp");
		}
	
    	String title = request.getParameter("title");
    	String body = request.getParameter("body");
    
    	String user_id = "";
    	//TO DO: get userID from username
    	ResultSet rs;
    	rs = st.executeQuery("SELECT * FROM User u WHERE u.username = '" + user + "'");
    	if (rs.next()) {
    		user_id = rs.getString("user_id");
    	} else {
    		//they're logged in but not registered??, this is not a case (no username changes)
    	}
    	
	 	java.sql.Timestamp date = new java.sql.Timestamp(new java.util.Date().getTime());
		String topost = String.format("INSERT INTO `Thread` (threadid, user_id, timecreated, title, description, solved) VALUES (null, '%s', '%s', '%s', '%s', 0);", user_id, date.toString(), title, body);//insert 0 (its BIT type, only 0,1,or null)
		out.println(topost);
		st.executeUpdate(topost);

		response.sendRedirect("questions.jsp");
		con.close();
		
	} catch(SQLException se) {
    	se.printStackTrace();
	}
	catch (Exception ex){
		out.println(ex);
	}
    
    
    
%>
