<%@ page import="java.sql.*"%>
<%
	String username = request.getParameter("username");
	String pwd = request.getParameter("password");
	Class.forName("com.mysql.jdbc.Driver");
	Connection con = DriverManager.getConnection(
			"jdbc:mysql://localhost:3306/buyme", "root",
			"password");
	Statement st = con.createStatement();
	ResultSet rs;
	rs = st.executeQuery("select * from User where username='" + username + "' and password='" + pwd + "'");
	if (rs.next()) {
		session.setAttribute("user", username);
		response.sendRedirect("userPage.jsp");
		}
	else {
		out.println("Invalid password <a href='login.jsp'>try again</a>");
	}
%>
