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
<%@ page import="java.sql.*"%>
<%
	String username = request.getParameter("username");
	String pwd = request.getParameter("password");
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection con = DriverManager.getConnection(
		"jdbc:mysql://localhost:3306/buyme", "root",
		"password");
	Statement st = con.createStatement();
	ResultSet rs;
	rs = st.executeQuery("select * from User where username='" + username + "' and password='" + pwd + "'");
	if (rs.next()) {
		session.setAttribute("user", username);
		int id = rs.getInt("user_id");
		rs = st.executeQuery("select * from Representative where user_id='" + id + "'");
		if (rs.next()) {
			response.sendRedirect("custRepDashboard.jsp");
		} else {
			rs = st.executeQuery("select * from Admin where user_id='" + id + "'");
			if (rs.next()) {
				response.sendRedirect("adminDashboard.jsp");
			} else {
				response.sendRedirect("userPage.jsp");
			}
		}
	} else {
		out.println("Invalid password <a href='login.jsp'>try again</a>");
	}
%>
