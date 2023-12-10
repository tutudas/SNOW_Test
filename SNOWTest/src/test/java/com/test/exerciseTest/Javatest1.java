package com.test.exerciseTest;

import java.io.*;

public class Javatest1 {
	
	public static void  main(String [] args) throws Exception {
		
		print();
		
		String z = 378 + "hello";
		System.out.println("string is..." +z);
		String str = "hi" + 467787;
		System.out.println("string is..." +str);
		
		for(int i=0;i<args.length; i++)
			System.out.println("args are...." +args[i]);
		
		System.out.println("Hello this is my test ...");
		Javatest1 test2 = new Javatest1();
		
	//	System.out.println("sum of x + y =" + test2.sum(2, 3) );	
	//	System.out.println("factorial of x=" + test2.Factoril(8) );
		String s1 = "mY  nAme I  s TUT U";
		String s2 = s1.toLowerCase();
		String s3 = s1.replaceAll(" ","");
		
		System.out.println("s1 ....." +s1 );
		System.out.println("s2 ....." + s2 );
		System.out.println("s3..." + s3 );
		System.out.println("s4..." + s1.toLowerCase() );
		System.out.println("s5..." + s3.toLowerCase() );
		System.out.println("s1 ....." +s1 );
		
		String fName1 = "C:/Suparna/JavaTest/file1.txt";
		String fName2 = "C:\\Suparna\\JavaTest\\file2.txt";
		
	//	test2.writeToFile(fName1);
		
	//	test2.writeToFilePrintWriter(fName2);	
		
	}

	
	
	public int sum(int x, int y) {
		int z = x +y;
		return z;	
	}
	
	public static void print() {
		System.out.println("Testing for static method call...." );
		
	}
public void writeToFile(String filename) throws Exception{
		
FileWriter fstream = new FileWriter(filename, true);
BufferedWriter out = new BufferedWriter(fstream);

out.write("Hello Java\n");
//out.newLine();
   
//Close the output stream
out.close();
    
}

public void writeToFilePrintWriter(String filename) throws Exception{
	
FileWriter fstream = new FileWriter(filename, true);
PrintWriter pw = new PrintWriter(fstream);

pw.write("Hello Java");
String line = "Testing  to write this liner to file\n";
pw.println( line);

   
pw.print("\n");
//Close the output stream
pw.close();
    
}
	
	
	public int Factoril(int x) {
		int result =0;
		if( x <= 0) {
			result = 1;
		}
		else {
			result = x  *  Factoril( x-1);
		}
		
		return result;
	}
	
	
}
