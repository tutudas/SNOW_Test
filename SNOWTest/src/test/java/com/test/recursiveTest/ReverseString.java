package com.test.recursiveTest;

import java.util.Scanner;

public class ReverseString {
	
	 public static void main(String[] args) {
		 
		 ReverseString rs = new ReverseString();
		 String original = "";
	      Scanner in = new Scanner(System.in);
	 
	      System.out.println("Enter a string : ");
	      original = in.nextLine();
	      System.out.println("original string is: "+original);
	      System.out.println("original string is: "+ rs.reverse(original));
	 //     System.out.println("original string is: "+ ReverseString.reverse(original));
	      
	      String Str = new String("Welcome to Tutorialspoint.com");

	      System.out.print("Return Value :" );
	      System.out.println(Str.substring(10) );

	      System.out.print("Return Value :" );
	      System.out.println(Str.substring(10, 15) );
	      
	 }

public static String reverse(String str) {
    if ((null == str) || (str.length() <= 1)) {
        return str;
    }
    return reverse(str.substring(1)) + str.charAt(0); // look at explanation down there

	}
}

/*
return reverse(str.substring(1)) + str.charAt(0);

is saying "reverse the last n-1 characters and move the first character to the end" (where the string has length n). This makes sense if you think about it trace the recursive calls through:

reverse("tart") + "S"
(reverse("art") + "t") + "S"
((reverse("rt") + "a") + "t") + "S"
(((reverse("t") + "r") + "a") + "t") + "S"
((((reverse("") + "t") + "r") + "a") + "t") + "S"

Assuming a suitable stopping condition when you are left with an empty string, the method calls now return one by one:

(((("t") + "r") + "a") + "t") + "S"
((("tr") + "a") + "t") + "S"
(("tra") + "t") + "S"
("trat") + "S"
"tratS"


 */

