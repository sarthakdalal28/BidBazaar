/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/10.1.5
 * Generated at: 2023-05-02 02:44:19 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.jsp.*;
import java.io.*;
import java.util.*;
import java.sql.*;
import javax.servlet.http.*;
import javax.servlet.*;

public final class editThread_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports,
                 org.apache.jasper.runtime.JspSourceDirectives {

  private static final jakarta.servlet.jsp.JspFactory _jspxFactory =
          jakarta.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("java.sql");
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("java.util");
    _jspx_imports_packages.add("jakarta.servlet");
    _jspx_imports_packages.add("java.io");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("jakarta.servlet.http");
    _jspx_imports_packages.add("jakarta.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile jakarta.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public boolean getErrorOnELNotFound() {
    return false;
  }

  public jakarta.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final jakarta.servlet.http.HttpServletRequest request, final jakarta.servlet.http.HttpServletResponse response)
      throws java.io.IOException, jakarta.servlet.ServletException {

    if (!jakarta.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

    final jakarta.servlet.jsp.PageContext pageContext;
    jakarta.servlet.http.HttpSession session = null;
    final jakarta.servlet.ServletContext application;
    final jakarta.servlet.ServletConfig config;
    jakarta.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    jakarta.servlet.jsp.JspWriter _jspx_out = null;
    jakarta.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write(" \n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("   <head>\n");
      out.write("      <title>Edit Your thread</title>\n");
      out.write("      <link rel=\"stylesheet\" href=\"css/login.css\" type=\"text/css\">\n");
      out.write("<style>\n");
      out.write("	body {\n");
      out.write("		display: flex;\n");
      out.write("		flex-direction: column;\n");
      out.write("		align-items: center;\n");
      out.write("		justify-content: center;\n");
      out.write("		height: 100vh;\n");
      out.write("		margin: 0;\n");
      out.write("	}\n");
      out.write("\n");
      out.write("	h1 {\n");
      out.write("		font-size: 3em;\n");
      out.write("		font-weight: bold;\n");
      out.write("		color: #1a1a1a;\n");
      out.write("		text-align: center;\n");
      out.write("		text-shadow: 2px 2px 4px #888888;\n");
      out.write("		margin-bottom: 1em;\n");
      out.write("	}\n");
      out.write("\n");
      out.write("	h2 {\n");
      out.write("	font-size: 1 em;\n");
      out.write("	color: #333;\n");
      out.write("	margin-bottom: 0.5em;\n");
      out.write("	}\n");
      out.write("\n");
      out.write("	/* Link Styles */\n");
      out.write("	a {\n");
      out.write("	color: #d02323;\n");
      out.write("	text-decoration: none;\n");
      out.write("	border-bottom: 2px solid #d02323;\n");
      out.write("	transition: border-bottom-color 0.3s ease-in-out;\n");
      out.write("	}\n");
      out.write("\n");
      out.write("	a:hover {\n");
      out.write("	color: black;\n");
      out.write("	}\n");
      out.write("</style>\n");
      out.write("   </head>\n");
      out.write("   <body>\n");
      out.write("	<h1>Here!</h1>\n");
      out.write("	");
 
	String threadid = request.getParameter("threadid");
	String username = (String)session.getAttribute("user");
	String userid = "";//get the userid from the username in the database
	
	//get the username from the user_id to show who posted the thread
	String get_username = "SELECT * FROM User u WHERE u.username = '" + username + "' ";
	String url = "jdbc:mysql://cs336.c7mvfesixgy7.us-east-2.rds.amazonaws.com:3306/buyme";
	Class.forName("com.mysql.jdbc.Driver");
	Connection con = DriverManager.getConnection(url, "cs336", "thisisareallysecurepassword551");
	Statement st = con.createStatement();
	st = con.createStatement();
	ResultSet result_username = st.executeQuery(get_username);
	String th_username = "";
	if(result_username.next()){
		userid= result_username.getString("user_id");
	}	
	String get_thuserid = "SELECT * FROM Thread t WHERE t.threadid = '" + threadid + "'";//get the userid of the threads poster
	result_username = st.executeQuery(get_thuserid);
	String th_userid = "";
	String title = "";
	String description = "";
	if(result_username.next()){
		th_userid = result_username.getString("user_id");
		title = result_username.getString("title");
		description = result_username.getString("description");
	}
	
	//String euserid = request.getParameter("userid");//get userid from user parameter

	if(!th_userid.equals(userid)){//do I need to take this out of the 'out.print' form too?
		out.print("You may not edit a thread that you haven't posted");
	}//end of if error
	else{//TO DO: can I make the placeholder for title and description the old stuff?
		String action = "editThreadDetails.jsp?threadid=" + threadid;
		
      out.write("\n");
      out.write("		\n");
      out.write("		<form method=\"post\" action=\"");
      out.print(action);
      out.write("\">\n");
      out.write("		\n");
      out.write("			<label>Title</label>\n");
      out.write("			<input type=\"text\" name=\"title\" placeholder=\"");
      out.print(title);
      out.write("\" required></input>\n");
      out.write("\n");
      out.write("			<label>Description</label>\n");
      out.write("			<textarea name=\"body\" placeholder=\"");
      out.print(description);
      out.write("\"  required></textarea>\n");
      out.write("			\n");
      out.write("			<label>Solved?</label>\n");
      out.write("			<input type=\"checkbox\" name=\"solved\" value=\"Solved\"> \n");
      out.write("\n");
      out.write("			<input type=\"submit\" value=\"Submit\"></input>\n");
      out.write("\n");
      out.write("\n");
      out.write("		</form>\n");
      out.write("\n");
      out.write("	");
 } //end of else 
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof jakarta.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
