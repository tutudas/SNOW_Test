package com.test.exerciseTest;

import java.util.Scanner;

public class GetInputFromUser {
	
	public static void main(String args[])
	   {
	      int a;
	      int b;
	      int c;
	      int s;
	 
	      Scanner in = new Scanner(System.in);
	 
	      System.out.println("Enter first integer....");
	      a = in.nextInt();
	      System.out.println("You entered "+a);
	 
	      System.out.println("Enter second integer");
	      b = in.nextInt();
	      System.out.println("You entered integer "+b);
	 
	      System.out.println("Enter third integer");
	      c = in.nextInt();
	      System.out.println("You entered float "+c); 
	      
	      s= a+b;
	      
	      if (((a+b)>c)|| ((b+c)>a) || ((c+a)>b))
	    	  
	    	  System.out.println("this is a triangle.... "); 
	   }
	}

