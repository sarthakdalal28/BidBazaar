/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/10.1.5
 * Generated at: 2023-05-01 20:20:41 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.jsp.*;
import buyme.User;
import java.sql.*;
import java.util.*;
import java.text.*;

public final class createAuctionPage_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports,
                 org.apache.jasper.runtime.JspSourceDirectives {

  private static final jakarta.servlet.jsp.JspFactory _jspxFactory =
          jakarta.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(3);
    _jspx_dependants.put("/./partials/commonScripts.jsp", Long.valueOf(1679859051736L));
    _jspx_dependants.put("/./partials/navbar.jsp", Long.valueOf(1682896004491L));
    _jspx_dependants.put("/./partials/commonCss.jsp", Long.valueOf(1682895919291L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("java.sql");
    _jspx_imports_packages.add("java.util");
    _jspx_imports_packages.add("java.text");
    _jspx_imports_packages.add("jakarta.servlet");
    _jspx_imports_packages.add("jakarta.servlet.http");
    _jspx_imports_packages.add("jakarta.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("buyme.User");
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
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>Buy Me</title>\r\n");
      out.write("<!-- Fonts and Icons -->\r\n");
      out.write("<link href=\"https://fonts.googleapis.com/css?family=Dosis:200,300,400,700|Cormorant:400,500,600,700\" rel=\"stylesheet\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"https://use.fontawesome.com/releases/v5.8.1/css/all.css\" integrity=\"sha384-50oBUHEmvpQ+1lW4y57PTFmhCaXp0ML5d60M1M7uH2+nqUivzIebhndOJK28anvf\" crossorigin=\"anonymous\">\r\n");
      out.write("<!-- jQuery Modal css -->\r\n");
      out.write("<link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/jquery-modal/0.9.1/jquery.modal.min.css\" type=\"text/css\">\r\n");
      out.write("<!--  Pretty Checkboxes -->\r\n");
      out.write("<link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/pretty-checkbox@3.0/dist/pretty-checkbox.min.css\" type=\"text/css\">\r\n");
      out.write("<!-- Common css imports -->\r\n");
      out.write("<link rel=\"stylesheet\" href=\"css/common.css\" type=\"text/css\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"css/navbar.css\" type=\"text/css\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"css/footer.css\" type=\"text/css\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"css/searchBar.css\" type=\"text/css\">");
      out.write("\r\n");
      out.write("<link rel=\"stylesheet\" href=\"css/login.css\" type=\"text/css\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("	");
      out.write("<nav class=\"navbar\">\r\n");
      out.write("	<a class=\"nav-btn\" href=\"index.jsp\">Buy Me</a>\r\n");
      out.write("	<a class=\"nav-btn\" href=\"market.jsp\">Shop</a>\r\n");
      out.write("	<a class=\"nav-btn\" href=\"questions.jsp\">Ask</a>\r\n");
      out.write(" 	");
 if(session.getAttribute("user")!=null) { 
		String username = (String)session.getAttribute("user"); 
      out.write("\r\n");
      out.write("		\r\n");
      out.write("		<a class=\"nav-btn\" href=\"logout.jsp\">Logout</a>\r\n");
      out.write("		<a class=\"nav-btn\" href=\"userPage.jsp\">Profile</a>\r\n");
      out.write("		<a class=\"nav-btn\" href=\"createAuctionPage.jsp\">New Auction</a>		\r\n");
      out.write("	");
 } else { 
      out.write("\r\n");
      out.write("		<a class=\"nav-btn\" href=\"login.jsp\">Login</a>\r\n");
      out.write("		<a class=\"nav-btn\" href=\"register.jsp\">Register</a>\r\n");
      out.write("	");
 } 
      out.write("\r\n");
      out.write("</nav>");
      out.write("\r\n");
      out.write("	<div class=\"content\">\r\n");
      out.write("\r\n");
      out.write("	");

		if ((session.getAttribute("user") == null)) {
	
      out.write("\r\n");
      out.write("	You must be logged in to sell an item. Please login or create an account.\r\n");
      out.write("	<br />\r\n");
      out.write("	<a href=\"login.jsp\">Login</a>\r\n");
      out.write("	<a href=\"register.jsp\">Register</a>\r\n");
      out.write("	\r\n");
      out.write("	");

		} else { 
      out.write("\r\n");
      out.write("			\r\n");
      out.write("			<div class=\"card\">\r\n");
      out.write("				<form action='createAuctionHandler.jsp' method='POST'>\r\n");
      out.write("					Item Name <input class=\"input-form\" type='text' name='item_name' required><br>\r\n");
      out.write("					Image Url <input class=\"input-form\" type='text' name='pic_link'><br/>\r\n");
      out.write("					Initial Price <input class=\"input-form\" type='number' name='initial_price' required><br>\r\n");
      out.write("					Minimum Sell Price <input class=\"input-form\" type='number' name='min_sell_price' required><br>\r\n");
      out.write("					Increment <input class=\"input-form\" type='number' name='increment' required><br/>\r\n");
      out.write("					Item Description <textarea class=\"input-form\" name='item_description' required></textarea><br>\r\n");
      out.write("					Category Name <input class=\"input-form\" type='text' name='category_name' required><br>\r\n");
      out.write("					Subcategory Name <input class=\"input-form\" type='text' name='subcategory_name' required><br>\r\n");
      out.write("					End Date <input class=\"input-form\" type='datetime-local' name='end_date' required><br>\r\n");
      out.write("					\r\n");
      out.write("					<input class=\"btn-secondary\" type='submit' value='Post Auction'>\r\n");
      out.write("				</form>\r\n");
      out.write("			</div>\r\n");
      out.write("			\r\n");
      out.write("	\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("	");

		}
	
      out.write("\r\n");
      out.write("	</div>\r\n");
      out.write("	");
      out.write("<!-- common scripts -->\r\n");
      out.write("<script src=\"https://cdnjs.cloudflare.com/ajax/libs/jquery/3.3.1/jquery.js\"></script>\r\n");
      out.write("<!-- jQuery Modal script -->\r\n");
      out.write("<script  src=\"https://cdnjs.cloudflare.com/ajax/libs/jquery-modal/0.9.1/jquery.modal.min.js\"></script>");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
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
