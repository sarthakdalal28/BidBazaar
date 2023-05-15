<nav class="navbar">
	<a class="nav-btn" href="market.jsp">Buy Me</a>
 	<% if(session.getAttribute("users")!=null) { 
		String username = (String)session.getAttribute("users"); %>
		<a class="nav-btn" href="userPage.jsp">Profile</a>
		<a class="nav-btn-right" href="logout.jsp">Logout</a>		
	<% } else { %>
		<a class="nav-btn" href="login.jsp">Login</a>
		<a class="nav-btn" href="register.jsp">Register</a>
	<% } %>
</nav>