package com.test.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class JdbcConnectionDemo {
	
   public static void main(String[] args) throws SQLException {
	   
	  String query = "select COF_NAME, SUP_ID, PRICE, SALES, TOTAL from COFFEES";
	  String updateQuery = "Update COFFEES set Price = 60"; 
	  
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
   
      Statement stmt = con.createStatement();
    	  ResultSet rs = stmt.executeQuery(query);
     while (rs.next()) {
       String coffeeName = rs.getString("COF_NAME");
       int supplierID = rs.getInt("SUP_ID");
       float price = rs.getFloat("PRICE");
       int sales = rs.getInt("SALES");
       int total = rs.getInt("TOTAL");
       System.out.println(coffeeName + ", " + supplierID + ", " + price +
                          ", " + sales + ", " + total);
     }
     try {
    	 int val = stmt.executeUpdate("updateQuery");
     } catch ( Exception e) {
    	 	con.rollback();
    	 	System.out.println("error ....");
     }
   
   } // end main
} // end class