package com.test.exerciseTest;

public class MyMainProgram {

	public static void  main(String [] args) throws Exception {
		System.out.println("Hello this is my program test ...");
		
		MathUtil  mObj = new MathUtil();   // default constructor
		FileUtil  fObj = new FileUtil();
		PrintUtil pObj = new PrintUtil();
		
		//  sum of  2 + 3
		int z = mObj.sum( 2,  3);
		System.out.println("\nsum of x + y =" + z );
		pObj.pLine("\nsum of x + y =" + z );
		
		// Factorial of  5
		int f = mObj.Factorial(5);
		System.out.println("factorial of x=" + 5 );
		
		
		String fName1 = "C:/Suparna/JavaTest/file1.txt";
		String fName2 = "C:\\Suparna\\JavaTest\\file2.txt";
		
		// write to file1
		fObj.writeToFile(fName1);
		
		// write to another file2
		fObj.writeToFilePrintWriter(fName2);
		
		
		
		
	}

	
}
