package com.qa.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;


public class JdbcConnectionDemo {
   public static void main(String[] args) {
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
   }
}