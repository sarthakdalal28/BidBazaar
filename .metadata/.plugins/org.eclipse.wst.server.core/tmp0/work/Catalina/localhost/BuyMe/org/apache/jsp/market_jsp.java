/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/10.1.5
 * Generated at: 2023-05-01 05:12:14 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.jsp.*;
import buyme.Item;
import java.sql.*;
import java.time.*;
import buyme.Category;
import buyme.Subcategory;
import java.sql.*;

public final class market_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports,
                 org.apache.jasper.runtime.JspSourceDirectives {

  private static final jakarta.servlet.jsp.JspFactory _jspxFactory =
          jakarta.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(4);
    _jspx_dependants.put("/./partials/commonScripts.jsp", Long.valueOf(1679859051736L));
    _jspx_dependants.put("/./partials/navbar.jsp", Long.valueOf(1682896004491L));
    _jspx_dependants.put("/./partials/commonCss.jsp", Long.valueOf(1682895919291L));
    _jspx_dependants.put("/./partials/searchBar.jsp", Long.valueOf(1682915017115L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("java.sql");
    _jspx_imports_packages.add("java.time");
    _jspx_imports_packages.add("jakarta.servlet");
    _jspx_imports_packages.add("jakarta.servlet.http");
    _jspx_imports_packages.add("jakarta.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("buyme.Subcategory");
    _jspx_imports_classes.add("buyme.Item");
    _jspx_imports_classes.add("buyme.Category");
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

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta charset=\"UTF-8\">\n");
      out.write("<title>Marketplace</title>\n");
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
      out.write("\n");
      out.write("<link rel=\"stylesheet\" href=\"css/market.css\" type=\"text/css\">\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("	<div class=\"content\">\n");
      out.write("		");
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
      out.write('\n');
      out.write('	');
      out.write('	');
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<section>\r\n");
      out.write("	<div class=\"top-bar\">\r\n");
      out.write("		<a class=\"btn-primary\" href=\"#categories\" rel=\"modal:open\"> View Categories</a>\r\n");
      out.write("		<form name=\"search\" action=");
      out.print( request.getContextPath() +  "/partials/handleSearchBar.jsp" );
      out.write(" method=\"POST\">\r\n");
      out.write("			<span class=\"search-bar\">\r\n");
      out.write("				<input name=\"search-query\" class=\"search-form search-bar-form\" type=\"text\" placeholder=\"Search for anything...\">\r\n");
      out.write("				<button type=\"submit\" class=\"search-btn\"><i class=\"fas fa-search\"></i></button>\r\n");
      out.write("			</span>\r\n");
      out.write("			<select name=subcategory class=\"btn-primary\" name=\"category-list\">\r\n");
      out.write("				<option value=\"all\" selected=\"selected\">All</option>\r\n");
      out.write("				");

					Category searchBarCategory = new Category();
					Subcategory searchBarSubcategory = new Subcategory();
					ResultSet allCategories = searchBarCategory.getAll();
					while(allCategories.next()) {
						String currentCategory = allCategories.getString("category_name");
						
      out.write("\r\n");
      out.write("						<optgroup label=\"");
      out.print( currentCategory );
      out.write("\">\r\n");
      out.write("						");

						ResultSet allSubcatsFromCat = searchBarSubcategory.getByCategory(currentCategory);
						while(allSubcatsFromCat.next()) {
							String currentSubcategory = allSubcatsFromCat.getString("subcategory_name");
							
      out.write("\r\n");
      out.write("							<option value=");
      out.print( currentSubcategory );
      out.write('>');
      out.print( currentSubcategory );
      out.write("</option>\r\n");
      out.write("							");

						}
						
      out.write("\r\n");
      out.write("						</optgroup>\r\n");
      out.write("						");

					}
				
      out.write("\r\n");
      out.write("			</select>\r\n");
      out.write("		</form>\r\n");
      out.write("	</div>\r\n");
      out.write("</section>\r\n");
      out.write("<!-- Modal for list of categories -->\r\n");
      out.write("<div id=\"categories\" class=\"modal categories-modal\">\r\n");
      out.write("	<div class=\"categories-wrapper\">\r\n");
      out.write("		");
 
			try {
				ResultSet rsSearchBarCats = searchBarCategory.getAll();
				
				while(rsSearchBarCats.next()) {
			
      out.write("\r\n");
      out.write("				<div class=\"card category-card\">\r\n");
      out.write("					<a href=\"#\" class=\"hdr-sml category-hdr\">");
      out.print( rsSearchBarCats.getString("category_name") );
      out.write("</a>\r\n");
      out.write("				</div>\r\n");
      out.write("			");

				}
			} catch (SQLException se) {
				se.printStackTrace();
				//response.sendRedirect("../500.jsp");
			} catch (Exception e) {
				e.printStackTrace();
				//response.sendRedirect("../500.jsp");
			}
 		
      out.write("\r\n");
      out.write("	</div>\r\n");
      out.write("	<a class=\"link\" href=\"#\" rel=\"modal:close\">Close</a>\r\n");
      out.write("</div>\r\n");
      out.write("\n");
      out.write("		<div class=\"section-header\">\n");
      out.write("			<p class=\"hdr-med\">Marketplace</p>\n");
      out.write("		</div>\n");
      out.write("		<section>\n");
      out.write("\n");
      out.write("			<div class=\"card item-container\">\n");
      out.write("				<p class=\"category-heading hdr-sml\">Hot <i class=\"fas fa-fire\"></i></p>\n");
      out.write("				<div class=\"flex-container\">\n");
      out.write("				\n");
      out.write("					");
 
						// get list of auctions/items sorted by number of bids
						try {
							// System.out.println("Search-Query2: " + sq);
							Item.changeSQLMode();
							ResultSet rsHotItems = Item.getHotItems();
							// print out the items
							if (!rsHotItems.isBeforeFirst()) { // check to see if search is empty
					
      out.write("\n");
      out.write("							<p class=\"body-lrg\">No items to show...</p>\n");
      out.write("					");

								
							} else {
								while(rsHotItems.next()) {
									// list out the results
									System.out.println("Item Name: " + rsHotItems.getString("item_name"));
									// grays out card if expired
									Instant currentTime = Instant.now();
									Instant endTime = rsHotItems.getTimestamp("end_date").toInstant();
									
									if (currentTime.compareTo(endTime) > 1) { // expired
										
      out.write("\n");
      out.write("									<div class=\"item-card featured-item expired-item\">\n");
      out.write("										");

									} else {
										
      out.write("\n");
      out.write("									<div class=\"item-card featured-item\">\n");
      out.write("										");

									}
					
      out.write("\n");
      out.write("										<div class=\"item-card-image-container\">\n");
      out.write("											<img class=\"item-card-image\"\n");
      out.write("												src=\"");
      out.print( rsHotItems.getString("image") );
      out.write("\"\n");
      out.write("												alt=\"item picture\">\n");
      out.write("										</div>\n");
      out.write("										<div class=\"item-card-info\">\n");
      out.write("											<div class=\"item-card-title-container\">\n");
      out.write("												<p class=\"item-card-title hdr-sml\">");
      out.print( rsHotItems.getString("item_name") );
      out.write("</p>\n");
      out.write("											</div>\n");
      out.write("											<div class=\"item-card-details-container\">\n");
      out.write("												<p class=\"item-card-details body-sml\">\n");
      out.write("												");
      out.print( rsHotItems.getString("item_description") );
      out.write("\n");
      out.write("												</p>\n");
      out.write("											</div>\n");
      out.write("											<div class=\"item-card-price-container\">\n");
      out.write("												<p class=\"hdr-med item-card-price\">$");
      out.print( rsHotItems.getString("current_bid") );
      out.write("</p>\n");
      out.write("											</div>\n");
      out.write("											<div class=\"item-card-btn-container\">\n");
      out.write("												<a class=\"btn-details btn-secondary\" href=\"");
      out.print( request.getContextPath() + "/item.jsp?auctionID=" + rsHotItems.getString("auction_id") );
      out.write("\">More Details</a>\n");
      out.write("											</div>\n");
      out.write("										</div>\n");
      out.write("									</div>\n");
      out.write("						");

								}
							}
							
						} catch (SQLException se) {
							se.printStackTrace();
							//response.sendRedirect("../500.jsp");
							out.println("Error: " + se.getMessage());

						} catch (Exception e) {
							e.printStackTrace();
							//response.sendRedirect("../500.jsp");
						}
					
      out.write("\n");
      out.write("					\n");
      out.write("					</div>\n");
      out.write("				</div>\n");
      out.write("			</div>\n");
      out.write("			\n");
      out.write("			<div class=\"card item-container\">\n");
      out.write("				<p class=\"category-heading hdr-sml\">New <i class=\"fas fa-haykal\"></i></p>\n");
      out.write("				<div class=\"flex-container\">\n");
      out.write("					\n");
      out.write("					");
 
						try {
							// System.out.println("Search-Query2: " + sq);
							ResultSet rsNewItems = Item.search("", "", "", 0, 0, 1, false);
							// print out the items
							if (!rsNewItems.isBeforeFirst()) { // check to see if search is empty
					
      out.write("\n");
      out.write("							<p class=\"body-lrg\">No items to show...</p>\n");
      out.write("					");

								
							} else {
								while(rsNewItems.next()) {
									// list out the results
									
									// grays out card if expired
									Instant currentTime = Instant.now();
									Instant endTime = rsNewItems.getTimestamp("end_date").toInstant();
									
									if (currentTime.compareTo(endTime) > 1) { // expired
										
      out.write("\n");
      out.write("									<div class=\"item-card featured-item expired-item\">\n");
      out.write("										");

									} else {
										
      out.write("\n");
      out.write("									<div class=\"item-card featured-item\">\n");
      out.write("										");

									}
					
      out.write("\n");
      out.write("										<div class=\"item-card-image-container\">\n");
      out.write("											<img class=\"item-card-image\"\n");
      out.write("												src=\"");
      out.print( rsNewItems.getString("image") );
      out.write("\"\n");
      out.write("												alt=\"item picture\">\n");
      out.write("										</div>\n");
      out.write("										<div class=\"item-card-info\">\n");
      out.write("											<div class=\"item-card-title-container\">\n");
      out.write("												<p class=\"item-card-title hdr-sml\">");
      out.print( rsNewItems.getString("item_name") );
      out.write("</p>\n");
      out.write("											</div>\n");
      out.write("											<div class=\"item-card-details-container\">\n");
      out.write("												<p class=\"item-card-details body-sml\">\n");
      out.write("												");
      out.print( rsNewItems.getString("item_description") );
      out.write("\n");
      out.write("												</p>\n");
      out.write("											</div>\n");
      out.write("											<div class=\"item-card-price-container\">\n");
      out.write("												<p class=\"hdr-med item-card-price\">$");
      out.print( rsNewItems.getString("current_bid") );
      out.write("</p>\n");
      out.write("											</div>\n");
      out.write("											<div class=\"item-card-btn-container\">\n");
      out.write("												<a class=\"btn-details btn-secondary\" href=\"");
      out.print( request.getContextPath() + "/item.jsp?auctionID=" + rsNewItems.getString("auction_id") );
      out.write("\">More Details</a>\n");
      out.write("											</div>\n");
      out.write("										</div>\n");
      out.write("									</div>\n");
      out.write("						");

								}
							}
							
						} catch (SQLException se) {
							se.printStackTrace();
							//response.sendRedirect("../500.jsp");
						} catch (Exception e) {
							e.printStackTrace();
							//response.sendRedirect("../500.jsp");
						}
					
      out.write("\n");
      out.write("					\n");
      out.write("					</div>\n");
      out.write("				</div>\n");
      out.write("			</div>\n");
      out.write("			\n");
      out.write("			<div class=\"card item-container\">\n");
      out.write("				<p class=\"category-heading hdr-sml\">Last Chance <i class=\"far fa-clock\"></i></p>\n");
      out.write("				<div class=\"flex-container\">\n");
      out.write("					\n");
      out.write("					");
 
						try {
							// System.out.println("Search-Query2: " + sq);
							ResultSet rsExpiringItems = Item.search("", "", "", 0, 0, -1, false);
							// print out the items
							if (!rsExpiringItems.isBeforeFirst()) { // check to see if search is empty
					
      out.write("\n");
      out.write("							<p class=\"body-lrg\">No items to show...</p>\n");
      out.write("					");

								
							} else {
								while(rsExpiringItems.next()) {
									// list out the results
									
									// grays out card if expired
									Instant currentTime = Instant.now();
									Instant endTime = rsExpiringItems.getTimestamp("end_date").toInstant();
									
									if (currentTime.compareTo(endTime) > 1) { // expired
										
      out.write("\n");
      out.write("									<div class=\"item-card featured-item expired-item\">\n");
      out.write("										");

									} else {
										
      out.write("\n");
      out.write("									<div class=\"item-card featured-item\">\n");
      out.write("										");

									}
					
      out.write("\n");
      out.write("										<div class=\"item-card-image-container\">\n");
      out.write("											<img class=\"item-card-image\"\n");
      out.write("												src=\"");
      out.print( rsExpiringItems.getString("image") );
      out.write("\"\n");
      out.write("												alt=\"item picture\">\n");
      out.write("										</div>\n");
      out.write("										<div class=\"item-card-info\">\n");
      out.write("											<div class=\"item-card-title-container\">\n");
      out.write("												<p class=\"item-card-title hdr-sml\">");
      out.print( rsExpiringItems.getString("item_name") );
      out.write("</p>\n");
      out.write("											</div>\n");
      out.write("											<div class=\"item-card-details-container\">\n");
      out.write("												<p class=\"item-card-details body-sml\">\n");
      out.write("												");
      out.print( rsExpiringItems.getString("item_description") );
      out.write("\n");
      out.write("												</p>\n");
      out.write("											</div>\n");
      out.write("											<div class=\"item-card-price-container\">\n");
      out.write("												<p class=\"hdr-med item-card-price\">$");
      out.print( rsExpiringItems.getString("current_bid") );
      out.write("</p>\n");
      out.write("											</div>\n");
      out.write("											<div class=\"item-card-btn-container\">\n");
      out.write("												<a class=\"btn-details btn-secondary\" href=\"");
      out.print( request.getContextPath() + "/item.jsp?auctionID=" + rsExpiringItems.getString("auction_id") );
      out.write("\">More Details</a>\n");
      out.write("											</div>\n");
      out.write("										</div>\n");
      out.write("									</div>\n");
      out.write("						");

								}
							}
							
						} catch (SQLException se) {
							se.printStackTrace();
							//response.sendRedirect("../500.jsp");
						} catch (Exception e) {
							e.printStackTrace();
							//response.sendRedirect("../500.jsp");
						}
					
      out.write("\n");
      out.write("					</div>\n");
      out.write("				</div>\n");
      out.write("			</div>\n");
      out.write("			\n");
      out.write("		</section>\n");
      out.write("	</div>\n");
      out.write("	");
      out.write("<!-- common scripts -->\r\n");
      out.write("<script src=\"https://cdnjs.cloudflare.com/ajax/libs/jquery/3.3.1/jquery.js\"></script>\r\n");
      out.write("<!-- jQuery Modal script -->\r\n");
      out.write("<script  src=\"https://cdnjs.cloudflare.com/ajax/libs/jquery-modal/0.9.1/jquery.modal.min.js\"></script>");
      out.write("\n");
      out.write("</body>\n");
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