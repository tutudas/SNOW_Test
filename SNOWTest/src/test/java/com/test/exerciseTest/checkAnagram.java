package com.test.exerciseTest;

import java.lang.reflect.Array;
import java.util.Arrays;

/*

1. An anagram is a word or a phrase that can be created by rearranging the letters of another given word
 or phrase. We ignore white spaces and letter case. The all letters of "Desperation" can be rearranged
  to the phrase "A Rope Ends It". 
Implement a Java program that checks the given Strings to determine whether one is an anagram of the other. 

2. Implement a Java function that finds two neighboring numbers in an array with 
the smallest distance to each other. The function should return the index of the 
first number. 
In the sequence 4 8 6 1 2 9 4 the minimum distance is 1 (between 1 and 2). 
The function should return the index 3 (of number 1). 



*/

public class checkAnagram {
	
	public static void main(String [] args)
	{
		int [] arr1 = {4, 8, 6, 1, 2, 9, 4 };
		checkAnagram  obj = new checkAnagram ();
	//	System.out.println("result.." +obj.isAnagram());
		System.out.println("index is.." +obj.getMinDistanceIndex(arr1));
		
	}
	
	public boolean isAnagram( ) {
		
//		String word1 ="Desperation";
//		String word2= "A Rope Ends It";
		
		String word1 =" i love you";
		String word2= "y oui F vel";
		
		
		boolean result = false;
		String w1 = word1.toLowerCase().trim().replaceAll("\\s","");
		String w2 = word2.toLowerCase().trim().replaceAll("\\s","");
		System.out.println("str1..."+w1);
		System.out.println("str2..."+w2);
		
		if (w1.length() == w2.length()){
			
			char arr1[] = w1.toCharArray();
			char arr2[] = w2.toCharArray();
			Arrays.sort(arr1);
			Arrays.sort(arr2);
			
			System.out.println("str1..."+Arrays.toString(arr1));
			System.out.println("str2..."+Arrays.toString(arr2));
			
			if(Arrays.equals(arr1,arr2)){
				result = true;
			}
			
		else {
			result = false;
		}
	}
		return result;
}
	
public int getMinDistanceIndex(int arry[]){
		
		int minDist = Math.abs(arry[0] - arry[1]);
		System.out.println("min dist" +minDist);
		int index=0;
	
		
		for ( int i=1; i<= arry.length-2; i++){
			
			System.out.println("here..");
			
			int dist = Math.abs(arry[i]-arry[i+1]);
			System.out.println("dist" +dist);
			if (dist < minDist){
				minDist = dist;
				System.out.println("dist" +dist);
				System.out.println("mindist.."+minDist);
				index = i;
				}
			}
		return index;
		
	}
	

}
