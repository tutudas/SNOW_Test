package com.test.serializationTest;

import java.io.*;

import com.myorg1.product1.serializationTest.Employee;

public class serializeDemo
{
   public static void main(String [] args)
   {
      Employee e = new Employee();
      e.name = "Reyan Ali";
      e.address = "Phokka Kuan, Ambehta Peer";
      e.SSN = 11122333;
      e.number = 101;
      e.phNo = 408;
      try
      {
         FileOutputStream fileOut = new FileOutputStream("data/employee.ser");
         ObjectOutputStream out = new ObjectOutputStream(fileOut);
         out.writeObject(e);
         out.close();
         fileOut.close();
         System.out.printf("Serialized data is saved in C:/tmp/employee.ser");
      }catch(IOException i)
      {
          i.printStackTrace();
      }
   }
}
