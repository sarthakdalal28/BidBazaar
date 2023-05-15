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
	String threadid = request.getParameter("threadid");//SQL does this automatically??...
    	//String title = request.getParameter("title");
	//String desc = request.getParameter("description");
    	Class.forName("com.mysql.jdbc.Driver");
    	String url = "jdbc:mysql://cs336.c7mvfesixgy7.us-east-2.rds.amazonaws.com:3306/buyme";
	Connection con = DriverManager.getConnection(url, "cs336", "thisisareallysecurepassword551");
    

    	//just incase, a double check
		if(user == null || user.equals("null")){//all the post data will be lost, they weren't logged in :/, this case shouldn't happen
			response.sendRedirect("login.jsp");
		}
	
    	String title = request.getParameter("title");
    	String body = request.getParameter("body");
    	String solved = request.getParameter("solved");//this needs to be 0, 1, or null for the database
    	//convert the solved input into terms we can put in the database
    	/*
    	String s = "";
    	if(solved==null){
    		s = "0";//not checked, a.k.a unsolved
    	}else{
    		s = "1";//its checked so mark it solved
    	}
    	*/
    	
    	
    	String user_id = "";
    	//get the user_id from the username to show who posted the thread
	String get_user_id = "SELECT * FROM User u WHERE u.username = '" + user + "' ";
	Statement st = con.createStatement();
		ResultSet result_username = st.executeQuery(get_user_id);
		if(result_username.next()){
			user_id = result_username.getString("user_id");
		}
		java.sql.Timestamp date = new java.sql.Timestamp(new java.util.Date().getTime());
		String topost = "";
		
		if(solved== null){
			//topost = String.format("INSERT INTO `Thread` (threadid, user_id, timecreated, title, description, solved) VALUES (null, '%s', '%s', '%s', '%s', 0);", user_id, date.toString(), title, body);//insert 0 (its BIT type, only 0,1,or null)
			topost = "UPDATE Thread SET title='" + title +  "', description='" + body + "', solved=0 WHERE threadid= " + threadid;
		}else{
			//topost = String.format("INSERT INTO `Thread` (threadid, user_id, timecreated, title, description, solved) VALUES (null, '%s', '%s', '%s', '%s', 1);", user_id, date.toString(), title, body);//insert 0 (its BIT type, only 0,1,or null)
			topost = "UPDATE Thread SET title='" + title +  "', description='" + body + "', solved=1 WHERE threadid= " + threadid;
		}
		
		out.println(topost);
		st.executeUpdate(topost);

		response.sendRedirect("questions.jsp");
		con.close();
		
	} catch(SQLException se) {
   		se.printStackTrace();
	} catch (Exception ex){
		out.println(ex);
	}
    
    
    
%>
