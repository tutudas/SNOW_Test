package com.test.serializationTest;

public class Employee implements java.io.Serializable
{
   public String name;
   public String address;
   public transient long SSN;
   public int number;
   public static int phNo;
   
   public void mailCheck()
   {
      System.out.println("Mailing a CHECK to " + name
                           + " " + address);
   }
}
