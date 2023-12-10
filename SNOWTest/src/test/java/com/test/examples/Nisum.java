package com.test.examples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

// https://www.youtube.com/watch?v=_3AtEzW03OA&ab_channel=IngeniousTechHub

public class Nisum {
	
public static void main(String[] args) {
	
	splitString("abdas"); 
		
}
			

// input - suparna saha; output - sprnsh  	uaaaa

// POM, login page, validate title, click to go another window, 
// validate title, come back parent window

// post call in rest assured

// write xpath for www.safeway.com > nutrition - clear

// write code for get method to extract success and valid employee name

// amazon link , find how many headers and display names

// input - abc output - abc, acb, bca, bac, cab, cba

public static void splitString(String str) {
	
	List l = Arrays.asList("a", "e", "i", "o","u", "A", "E", "I", "O", "U");
	
	Character [] ch = {'a', 'e', 'i', 'o','u'};
	                //   , "A", "E", "I", "O", "U"]
	
	Set<Character> s = new HashSet<Character>();
	
	s.addAll(Arrays.asList(ch));
	Arrays.asList(ch);
	
	str.toLowerCase();
	StringBuffer vowel = new StringBuffer();
	StringBuffer con = new StringBuffer();
	
	for ( int i= 0; i< str.length(); i++) {
		
		System.out.println("set....: "+s);
		
		if(s.contains(str.charAt(i))){
			System.out.println("here....: ");
			vowel.append(str.charAt(i));
			System.out.println("vowel....: "+s.contains(str.charAt(i)));
		}
		else {
			con.append(str.charAt(i));
			System.out.println("con....: "+con);
		}
	}
	
	System.out.println("output....: "+con +" "+vowel);
}

} // end class
