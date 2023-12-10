package com.test.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Map;

public class JdbcPreparedStatement {
	
	 public static void main(String[] args) throws SQLException {
	   
		 String updateString =
	      "update COFFEES set SALES = ? where COF_NAME = ?";
	    String updateStatement =
	      "update COFFEES set TOTAL = TOTAL + ? where COF_NAME = ?";

	    String JdbcURL = "jdbc:mysql://localhost:3306/test?useSSL=false";
	      String Username = "root";
	      String password = "123456";
	      Connection con = null;
	      try {
	         System.out.println("Connecting to database..............."+JdbcURL);
	         con=DriverManager.getConnection(JdbcURL, Username, password);
	         System.out.println("Connection is successful!!!!!!");
	      }
	      catch(Exception e) {
	         e.printStackTrace();
	      }
	    
	    try (PreparedStatement updateSales = con.prepareStatement(updateString);
	         PreparedStatement updateTotal = con.prepareStatement(updateStatement))
	    
	    {
	      con.setAutoCommit(false);
	      for (Map.Entry<String, Integer> e : salesForWeek.entrySet()) {
	        updateSales.setInt(1, e.getValue().intValue());
	        updateSales.setString(2, e.getKey());
	        updateSales.executeUpdate();

	        updateTotal.setInt(1, e.getValue().intValue());
	        updateTotal.setString(2, e.getKey());
	        updateTotal.executeUpdate();
	        con.commit();
	      }
	    } catch (SQLException e) {
	      JDBCTutorialUtilities.printSQLException(e);
	      if (con != null) {
	        try {
	          System.err.print("Transaction is being rolled back");
	          con.rollback();
	        } catch (SQLException excep) {
	          JDBCTutorialUtilities.printSQLException(excep);
	        }
	      }
	    }
	  }


}
