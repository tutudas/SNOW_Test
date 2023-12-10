package com.test.singletonTest;

import java.util.HashSet;

import com.myorg1.product1.singletonTest.Singleton;

public class SingletonDemo {
	   public static void main(String[] args) {
		   
		   int y = 56;
	      Singleton tmp1 = Singleton.getInstance( );
	      tmp1.demoMethod( );
	      
	      Singleton tmp2 = Singleton.getInstance( );
	      tmp2.demoMethod( );
	      
	      if (tmp1==(tmp2)) 
	      {
	    	  System.out.println("both objects are equal");   
	      }
	      else
	    	  System.out.println("not equal..."); 
	      
	   HashSet s1 = new HashSet();
	   HashSet s2 = s1; //new HashSet();
	   
	   
	      if (s1==s2)
	      {
	    	  System.out.println("both hashsets are equal");   
	      }
	      else
	    	  System.out.println("not equal..."); 
	      }
	   
	   }
	