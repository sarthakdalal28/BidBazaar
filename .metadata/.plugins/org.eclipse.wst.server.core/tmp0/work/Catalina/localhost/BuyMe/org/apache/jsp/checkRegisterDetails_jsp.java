/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/10.1.5
 * Generated at: 2023-05-02 01:22:04 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.jsp.*;
import java.sql.*;

public final class checkRegisterDetails_jsp extends org.apache.jasper.runtime.HttpJspBase
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
    _jspx_imports_packages.add("jakarta.servlet");
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

      out.write("<link rel=\"stylesheet\" href=\"css/login.css\" type=\"text/css\">\r\n");
      out.write("<style>\r\n");
      out.write("	body {\r\n");
      out.write("		display: flex;\r\n");
      out.write("		flex-direction: column;\r\n");
      out.write("		align-items: center;\r\n");
      out.write("		justify-content: center;\r\n");
      out.write("		height: 100vh;\r\n");
      out.write("		margin: 0;\r\n");
      out.write("	}\r\n");
      out.write("\r\n");
      out.write("	h1 {\r\n");
      out.write("		font-size: 3em;\r\n");
      out.write("		font-weight: bold;\r\n");
      out.write("		color: #1a1a1a;\r\n");
      out.write("		text-align: center;\r\n");
      out.write("		text-shadow: 2px 2px 4px #888888;\r\n");
      out.write("		margin-bottom: 1em;\r\n");
      out.write("	}\r\n");
      out.write("\r\n");
      out.write("	h2 {\r\n");
      out.write("	font-size: 1 em;\r\n");
      out.write("	color: #333;\r\n");
      out.write("	margin-bottom: 0.5em;\r\n");
      out.write("	}\r\n");
      out.write("\r\n");
      out.write("	/* Link Styles */\r\n");
      out.write("	a {\r\n");
      out.write("	color: #d02323;\r\n");
      out.write("	text-decoration: none;\r\n");
      out.write("	border-bottom: 2px solid #d02323;\r\n");
      out.write("	transition: border-bottom-color 0.3s ease-in-out;\r\n");
      out.write("	}\r\n");
      out.write("\r\n");
      out.write("	a:hover {\r\n");
      out.write("	color: black;\r\n");
      out.write("	}\r\n");
      out.write("</style>\r\n");
      out.write("\r\n");

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

      out.write('\r');
      out.write('\n');
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
