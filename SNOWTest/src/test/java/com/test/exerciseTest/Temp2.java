package com.test.exerciseTest;

import com.test.exerciseTest.Temp1;

public class Temp2 extends Temp1{
	
	public static void  main(String [] args) throws Exception {
		/*
		//TempJavaTest.A(); //test1 = new TempJavaTest();
		Temp1 test1 = new Temp1();
		
		test1.checkOverload();
		test1.checkOverload(5676);
		//test1.C();
		//test1.A();
		Temp2 test2 = new Temp2();
		Temp2 tmp = null;
		Temp1 test3 = new Temp2();
		//test2.A();
		//test3.A();
		//tmp.A();
		
		Temp1 t2 = new Temp2();
	//super.show();   // cann't use super in static context
		t2.show();
	
		Temp1 t2 = new Temp2();
		Temp2 t4 = new Temp2();
		System.out.println("................" +t4.Temp2());
	//	t2.A();
		t4.A();
		
		System.out.println("value...." + t4.display(5.7, 9.7));
		t4.display(4, 7.5);
		*/
		Temp1 t2 = new Temp1();
		t2.A();
		
		/*
		int i; 
		for(i = 1; i < 6; i++) {
			if (i > 3) 
				continue ; 
			else
			break;
			} 
		System.out.println(i); 
		
		char k = 'A' ;
		char k2 = (char)(k*k);
		byte s2 = (byte)(k*k);
		System.out.println((char)( k * k )) ;
		System.out.println((int)( k * k )) ;
		System.out.println((int)k2 ) ;
		System.out.println(s2) ;
		
		
		int Integer = 34 ;
		char String = 'S' ;
		System.out.println( Integer ) ;
		System.out.println( String ) ;
		float x = 99;
		int y = 100;
		System.out.println(x/y);
	
		char[] c = new char[];
		int intarray[] = new int[]{ 10, 20, 30 };
		System.out.println(intarray[1]);
	
		int intarray[] = { 5, 10, 15 }; 
		System.out.println(intarray[0]);
		intarray[0] += 2;
		System.out.println(intarray[0]);
		
		int rates[] = {10, 20, 30 };
		System.out.println(rates.length);
		
		/*
		String s1 = "RAMA\nKRISHNA";
		System.out.println(s1); 
		
	
		String s1 = new String("Hello");
		String s2 = new String("Hellow");
		System.out.println(s1 = s2); 
		
		String s1 = "JAVA";
				String s2 = "java";
				System.out.println(s1.equals(s2));
				System.out.println(s1 == s2); 
		
		String s1 = "SITHA" ;
		String s2 = "RAMA";
		System.out.println(s1.charAt(0) > s2.charAt(0));
		
		String str1 = "abcde";
		System.out.println(str1.substring(1, 3));
		String x = "hellow";
		int y = 9;
		System.out.println(x += y); //http://way2java.com/java-questions/test-your-java-3
		
	} // main end
	
	 public void A(){
		 System.out.println("child method....."); 
		 
	 }
	 
	void show() {
		// super(); //constructor of parent method should be called in constructor section
		//this.show(); // stack overflowERROR
		 super.show();
		 System.out.println("YYY") ; 
		 
		 } 
	int Temp2() {
		
		 System.out.println("I am not constructor....") ; 
		 return 1;
		 } 
	
	public void display(int x, double y) {
		System.out.println(x+y); 
		} 
	
	public double display(double p, double q) { 
		return (p+q); 
		} 
	*/
	}
	public Temp2(){
		 System.out.println("value....."); 
		 
	 }
	 
	 public void A(){
		 System.out.println("child method....."); 
		 
	 }
	
}
