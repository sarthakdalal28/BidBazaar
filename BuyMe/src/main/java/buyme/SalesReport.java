package buyme;

import java.sql.*;

public class SalesReport {

	public String generate(String report) throws SQLException, Exception{
	    ResultSet rs=null;
	    String output="";
		try{
	        if(report.equals("Earnings")){
				rs = totalEarnings();
				output="Total Earnings: $";
				if(rs.next()){
					if (rs.getString(1) == null) {
						output+= "0";
					} else {
						output+=rs.getString(1);	
					}
				}
			}
			else if(report.equals("earnPerItem")){
				rs= itemEarnings();	
				output="<h3>Earnings Per Item</h3>";
				output+="<table>";
				output+="<tr><th>Total</th><th>Item</th></tr>";
				while(rs.next()){
					output+="<tr>";
					output+="<td>"+rs.getString(1)+"</td>";
					output+="<td>"+rs.getString(2)+"</td>";
					output+="</tr>";
				}
				output+="</table>";
			}
			else if(report.equals("earnPerIT")){
				rs = itemtypeEarnings();
				output="<h3>Earnings Per Item Type</h3>";
				output+="<table>";
				output+="<tr><th>Total</th><th>Item Type</th></tr>";
				while(rs.next()){
					output+="<tr>";
					output+="<td>"+rs.getString(1)+"</td>";
					output+="<td>"+rs.getString(2)+"</td>";
					output+="</tr>";
				}
				output+="</table>";
			}
			else if(report.equals("earnPerUser")){
				rs = userEarnings();
				output="<h3>Earnings Per User</h3>";
				output+="<table>";
				output+="<tr><th>Total</th><th>User</th></tr>";
				while(rs.next()){
					output+="<tr>";
					output+="<td>"+rs.getString(1)+"</td>";
					output+="<td>"+rs.getString(2)+"</td>";
					output+="</tr>";
				}
				output+="</table>";
			}
			else if(report.equals("bestItem")){
				rs = bestItems();
				output="<h3>Best Selling Items</h3>";
				output+="<table>";
				output+="<tr><th>Item</th><th>Total Sells</th></tr>";
				while(rs.next()){
					output+="<tr>";
					output+="<td>"+rs.getString(1)+"</td>";
					output+="<td>"+rs.getString(2)+"</td>";
					output+="</tr>";
				}
				output+="</table>";
			}
			else if(report.equals("bestBuyer")){
				rs = bestBuyers();
				output="<h3>Best Buyers</h3>";
				output+="<table>";
				output+="<tr><th>User</th><th>Total Buys</th></tr>";
				while(rs.next()){
					output+="<tr>";
					output+="<td>"+rs.getString(2)+"</td>";
					output+="<td>"+rs.getString(3)+"</td>";
					output+="</tr>";
				}
				output+="</table>";
			}
			else{
				return "Error: <a href='adminDashboard'>Return to dashboard.</a>";
			}
	        return output;
	    }
	    catch(SQLException se){
	    	throw se;
	    }
	    catch(Exception e){
	    	throw e;
	    }
	}
	
	public static ResultSet totalEarnings()throws SQLException, Exception{
		Connection con=null;
	    Statement st=null;
	    ResultSet rs=null;
		try{
	    	Class.forName("com.mysql.jdbc.Driver");
	    	con = DriverManager.getConnection("jdbc:mysql://localhost:3306/buyme", "root",
					"password");
	    	st = con.createStatement();	
	    	java.sql.Timestamp date = new java.sql.Timestamp(new java.util.Date().getTime());
	    	String query="SELECT SUM(current_bid) FROM Auction WHERE TIMESTAMP(end_date)<'"+date+"' AND current_bid > min_sell_price";
	    	rs = st.executeQuery(query);
	    	return rs;
		}
		catch(SQLException se){
			throw se;
	    }
	    catch(Exception e){
	    	throw e;
	    }
	}
	
	public static ResultSet itemEarnings()throws SQLException, Exception{
		Connection con=null;
	    Statement st=null;
	    ResultSet rs=null;
		try{
	    	Class.forName("com.mysql.jdbc.Driver");
	    	con = DriverManager.getConnection("jdbc:mysql://localhost:3306/buyme", "root",
					"password");
	    	st = con.createStatement();	
	    	java.sql.Timestamp date = new java.sql.Timestamp(new java.util.Date().getTime());
	    	String query = "SELECT SUM(current_bid), item_name FROM Auction WHERE TIMESTAMP(end_date) < '" + date + "' AND current_bid > buy_at_price GROUP BY item_name";
	    	rs = st.executeQuery(query);
	    	return rs;
		}
		catch(SQLException se){
			throw se;
	    }
	    catch(Exception e){
	    	throw e;
	    }
	}
	
	public static ResultSet itemtypeEarnings()throws SQLException, Exception{
		Connection con=null;
	    Statement st=null;
	    ResultSet rs=null;
		try{
	    	Class.forName("com.mysql.jdbc.Driver");
	    	con = DriverManager.getConnection("jdbc:mysql://localhost:3306/buyme", "root",
					"password");
	    	st = con.createStatement();	
	    	java.sql.Timestamp date = new java.sql.Timestamp(new java.util.Date().getTime());
	    	String query="SELECT SUM(current_bid), subcategory_name FROM Auction WHERE TIMESTAMP(end_date)<'"+date+"' AND current_bid>buy_at_price GROUP BY subcategory_name";
	    	rs = st.executeQuery(query);
	    	return rs;
		}
		catch(SQLException se){
			throw se;
	    }
	    catch(Exception e){
	    	throw e;
	    }
	}
	
	public static ResultSet userEarnings()throws SQLException, Exception{
		Connection con=null;
	    Statement st=null;
	    ResultSet rs=null;
		try{
	    	Class.forName("com.mysql.jdbc.Driver");
	    	con = DriverManager.getConnection("jdbc:mysql://localhost:3306/buyme", "root",
					"password");
	    	st = con.createStatement();	
	    	java.sql.Timestamp date = new java.sql.Timestamp(new java.util.Date().getTime());
	    	String query="SELECT SUM(current_bid), seller, user_id FROM Auction WHERE TIMESTAMP(end_date)<'"+date+"' AND current_bid>buy_at_price GROUP BY user_id";
	    	rs = st.executeQuery(query);
	    	return rs;
		}
		catch(SQLException se){
			throw se;
	    }
	    catch(Exception e){
	    	throw e;
	    }
	}

	public static ResultSet bestItems()throws SQLException, Exception{
		Connection con=null;
	    Statement st=null;
	    ResultSet rs=null;
		try{
	    	Class.forName("com.mysql.jdbc.Driver");
	    	con = DriverManager.getConnection("jdbc:mysql://localhost:3306/buyme", "root",
					"password");
	    	st = con.createStatement();	
	    	java.sql.Timestamp date = new java.sql.Timestamp(new java.util.Date().getTime());
	    	String query="SELECT item_name, COUNT(item_name) FROM Auction WHERE TIMESTAMP(end_date)<'"+date+"' AND current_bid>buy_at_price ORDER BY COUNT(item_name) DESC";
	    	rs = st.executeQuery(query);
	    	return rs;
		}
		catch(SQLException se){
			throw se;
	    }
	    catch(Exception e){
	    	throw e;
	    }
	}

	public static ResultSet bestBuyers()throws SQLException, Exception{
		Connection con=null;
	    Statement st=null;
	    ResultSet rs=null;
		try{
	    	Class.forName("com.mysql.jdbc.Driver");
	    	con = DriverManager.getConnection("jdbc:mysql://localhost:3306/buyme", "root",
					"password");
	    	st = con.createStatement();	
	    	java.sql.Timestamp date = new java.sql.Timestamp(new java.util.Date().getTime());
	    	String query="SELECT Bid.user_id, COUNT(Bid.user_id) FROM Bid INNER JOIN Auction ON Auction.auction_id=Bid.auction_id WHERE TIMESTAMP(end_date)<'"+date+"'AND Auction.current_bid>Auction.buy_at_price AND Auction.current_bid=Bid.price GROUP BY Bid.user_id ORDER BY COUNT(Bid.user_id) DESC" ;
	    	rs = st.executeQuery(query);
	    	return rs;
		}
		catch(SQLException se){
			throw se;
	    }
	    catch(Exception e){
	    	throw e;
	    }
	}

}
