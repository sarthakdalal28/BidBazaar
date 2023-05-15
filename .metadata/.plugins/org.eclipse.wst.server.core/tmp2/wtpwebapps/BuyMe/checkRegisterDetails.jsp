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
    	String insertStatement = String.format("INSERT INTO users (created_at, name, username, email, password) VALUES ('%s', '%s', '%s', '%s', '%s');", date.toString(), name, username, email, password);
    	st.executeUpdate(insertStatement);
    	session.setAttribute("users", username);
    	response.sendRedirect("userPage.jsp");
  } catch(SQLException se) {
  	out.println("Error: <a href='register.jsp'>Try again</a>");
      	se.printStackTrace();
  } catch(Exception e) {
      	e.printStackTrace();
  }
%>
