<%@ page language="java" %>
<%
    // Invalidate the current session
    session.invalidate();

    // Redirect to the login page
    response.sendRedirect("login.jsp");
%>