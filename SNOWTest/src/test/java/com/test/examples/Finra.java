package com.test.examples;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;



// Gson object create code
// remove extra char which stop to make word palindrome
// final method can be override?


public class Finra {
	
	public static void main(String[] args) throws FileNotFoundException {
		
		int[] a1 = {8,6,-5,-7,-3,4,2};
		int[] a2 = {-5,4,2, 9};
		
		int[] a3 = {8,6,2,8};
		int[] a4 = {8,6,2,8,4,2,5,7};
		
		List<Integer> input = Arrays.asList(1, 2, 5, 3, 4,7,4);
				
		System.out.println("dup..." +findDuplicateFromArray(a3));
		System.out.println("multiple dup..." +findMultipleDuplicateFromArray(a4));
		
	//	resetArrayv2(a1);
	//	findLongestPalindrome();
	//	findCommonNumbers(a1,a2);
	//	findCommonNumbersWithDuplicate(a1,a2);
	//	removeCharForPalindrome("abopba");
	//	System.out.println("is palindrome... "+isPalindromev2("abba"));
		
	//	findDuplicate(a1);
	//	findDupAndMissNum(input);
	}
	
	public static void resetArray(int[] input) {
		
		int low = 0;
		int high = input.length -1;
		int tmp = 0;
			
		
		while(low<high) {
			
			int i=0;
			int j=0;
			
			for ( i=low; i<=high; i++) {
				if(input[i] > 0){
					break;
				}
			}
			
			for ( j=high; j>=low; j--) {
				if(input[j]<0){
					break;
				}
			}
			if(i<j) {
					tmp = input[i];
					input[i]=input[j];
					input[j]=tmp;
					low=i;
					high=j;
			}
			else {
				break;
			}
		
		} // end while loop
		
		for ( int i=0; i<input.length; i++) {
			System.out.println("result array... "+input[i]);
		}
		
	} // end resetArray
	
	
public static void resetArrayv2(int[] input) {
		
		int l = 0;
		int h = input.length -1;
		int tmp = 0;
			
		while(l<h) {
			
			while ( input[l]<0) l++;
			while ( input[h]>0) h--;
			
			if(l<h) {
				tmp = input[l];
				input[l]=input[h];
				input[h]=tmp;
			}
			
		} // end while loop
		
		for ( int i=0; i<input.length; i++) {
			System.out.println("result array... "+input[i]);
		}
		
	} // end resetArray
	
public static void findLongestPalindrome() throws FileNotFoundException {
	
	String FileName = "/Users/suparna/git/SNOW_Test/SNOWTest/data/wordCount.txt";
	String target = "";
	int index =0;
	
	Scanner sc = new Scanner(new File(FileName));
	while(sc.hasNext()) {
		String line = sc.nextLine().trim();
		String[] words = line.split("\\s+");
		
		for ( int i =0; i<words.length; i++) {
			if(isPalindromev2(words[i])) {
				if(target.length() < words[i].length()) {
					target = words[i];
					index = i;
				}
			}
		}
		System.out.println("result..."+target+"   "+"index...."+ index);
		}
	}
	
	
	public static boolean isPalindrome(String str) {
		
		int l=0;
		int h = str.length()-1;
		
		while(l< h && str.charAt(l) == str.charAt(h))
		{
			l++;
			h--;
					
		}
		 if ( l >=h) return true;
		 else return false;
	
	}
	
	public static boolean isPalindromev2(String str) {
	
	String rev = "";
	for(int i=str.length()-1; i>=0 ; i--) {
		rev = rev + str.charAt(i);
	}
	if(str.equals(rev))
		return true;
	else 
		return false;
	
	}

// WIP

public static void findDuplicate(int[] input) {
	
	int l = 0;
	int h = 1;
	int index = 0;
	int[] result = new int[input.length];
	
	if(input[l]!=input[h]) {
		l++;
		h++;
	}
	else {
		result[index] = input[l];
		index++;
		l++;
		h--;
		
		}
	for(int i=0; i< result.length; i++) {
		System.out.println("duplicate... "+result[i]);
		}
	}

public static void findCommonNumbers(int[] a1, int[] a2) {
	
	ArrayList out = new ArrayList();
	int index =0;
	
	for(int i=0; i<a1.length; i++) {
		for(int j=0; j<a2.length; j++) {
			if(a1[i] == a2[j]) {
				out.add(a1[i]);
				index++;
			}
			
		}
	}
	System.out.println("result array... "+out.toString());

}

//wip result array... [-5, -7, 2, 2, 4, 2, 2]
public static void findCommonNumbersWithDuplicate(int[] a1, int[] a2) {
	
	ArrayList out = new ArrayList();
	int index =0;
	
	for(int i=0; i<a1.length; i++) {
		for(int j=0; j<a2.length; j++) {
		//	System.out.println("a1... "+a1[i]);
		//	System.out.println("a2... "+a2[j]);
			if(a1[i] == a2[j]) {
				out.add(a1[i]);
				index++;
			}
			
		}
	}
		System.out.println("result array... "+out.toString());

	}

public static void removeCharForPalindrome(String str) {
	
	int l= 0;
	int h = str.length()-1;

		while(l < h ) {
			if( str.charAt(l) == str.charAt(h))
		{
			System.out.println("l char... "+str.charAt(l));
			System.out.println("h char... "+str.charAt(h));
			l++;
			h--;
					
		}
		else {
				if (isPalindromev2 (str.substring(l + 1, h+1))) {
					System.out.println( "remove char..."+ str.charAt(l));
					break;
				}
				if (isPalindromev2  (str.substring(l, h ))) {
					System.out.println( "remove char..."+ str.charAt(h));
					break;
				}
	
			}
		}

	}

// find duplicate and missing number from a random integer list

public static int[] findDupAndMissNum(List<Integer> l1) {
	
	int [] result = new int[2];
	int dup = 0;
	int min = l1.get(0);
	int max = 0;
	int currSum =0;
	int actSum =0;
	int missNum =0;
	
	Set s1 = new HashSet();
	for(int i=0; i<l1.size(); i++) {
		if(!s1.contains(l1.get(i))) {
			s1.add(l1.get(i));
			currSum += l1.get(i);
			
			System.out.println( "row num..."+ l1.get(i));
			if(min > l1.get(i)) {
				min = l1.get(i);
			}
			if(max < l1.get(i)) {
				max = l1.get(i);
			}
		else {
			dup = l1.get(i);
			}
	
		}
	}
	for(int j=min; j<= max ; j++) {
			actSum += j;
		}
	
	result[0] = dup;
	result[1] = missNum;
	missNum = actSum - currSum;
	
	System.out.println( "min..."+ min);
	System.out.println( "max..."+ max);
	System.out.println( "actSum..."+ actSum);
	System.out.println( "currSum..."+ currSum);
	System.out.println( "duplicate..."+ dup);
	System.out.println( "missing..."+ missNum);
	
	return result;
} // end method

public static int findDuplicateFromArray(int[] a) {
	
	int dup=0;
	Set s = new HashSet();
	for ( int i=0; i< a.length; i++) {
		if(!s.contains(a[i])) {
			s.add(a[i]);
		}
		else 
			dup = a[i];
	}
	return dup;
	
}

public static List findMultipleDuplicateFromArray(int[] a) {
	
	List l = new ArrayList();

	Set s = new HashSet();
	for ( int i=0; i< a.length; i++) {
		if(!s.contains(a[i])) {
			s.add(a[i]);
		}
		else 
			l.add(a[i]);
	}
	return l;
	
}

	
} // end class
