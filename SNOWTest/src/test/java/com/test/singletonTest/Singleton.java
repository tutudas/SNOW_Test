package com.test.singletonTest;

public class Singleton {

	   private static Singleton singleton = null; //= new Singleton( );
	   
	   /* A private Constructor prevents any other 
	    * class from instantiating.
	    */
	   private Singleton(){ }
	   
	   /* Static 'instance' method */
	   public static Singleton getInstance( ) {
		   
		   int y = 7;
		   if (singleton == null)
		   {
			   System.out.println("creating in getInstance method");
			    singleton = new Singleton( );
		   }
	      return singleton;
	   }
	   /* Other methods protected by singleton-ness */
	   protected static void demoMethod( ) {
	      System.out.println("demoMethod for singleton"); 
	   }
	}