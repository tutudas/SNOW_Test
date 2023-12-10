package com.test.examples;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;
import java.util.Stack;

import javax.net.ssl.SSLContext;
//import javax.xml.stream.events.Characters;

public class FinraMdas {

	public FinraMdas() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws FileNotFoundException {
		
		isPalindrome(123216);
		
//		String str = new String ("Stanford  ");
//	     str += "Lost!!";
//	     
//	     StringBuffer str = new StringBuffer ("Stanford ");
//	     str.append("Lost!!");
//
//
//	     System.out.println("New String   is " +str); 
		
//	        String str = "Flexton";
//	        System.out.println("New String   is \'"+newString(str)+"\'");  
		
	//	SortRBG("RGBGBGBRRBGRRBBGR".toCharArray());  // pass
		
	//	Fibonacciseries(4);
		
		//System.out.println("Max palindrom in file = " + longestPalindromFromBookFile("./data/palindromfile.txt"));
		
		
	//	System.out.println("2nd highest = " + secondHighest(new int [] {10,100, 50, 90,20,30, 78, 89, 5, 100}));
	// System.out.println("2nd highest = " + secondHighest(new int [] {100,100,100}));

	//	findSecondHighest(new int [] {10,100, 50, 90,20,30,100});
	//	findSecondHighest(new int [] {100,100,100});
		
		
	//	findSecondLowest(new int [] {100,100, 100});
	//	findSecondLowest(new int [] {100,10,20, 50, 10, 5});
//		
//		System.out.println("2nd low = " + secondLowest(new int [] {10,100, 50, 90,20,30, 78, 89, 5, 100}));
//		System.out.println("2nd low = " + secondLowest(new int [] {100,100,  100}));


	//	System.out.println("Non dup chars: " +  nondupCharsOfAString(null));
/*		System.out.println("Non dup chars: " +  nondupCharsOfAString(""));
		System.out.println("Non dup chars: " +  nondupCharsOfAString("abcabxybzmz"));
		System.out.println("Non dup chars: " +  nondupCharsOfAString("lakabcabxybzmz"));
		
		//
		
		get2ndLowestNumber(null ) ;
		get2ndLowestNumber(new int [0] ) ;
		get2ndLowestNumber(new int [] {10} ) ;
		get2ndLowestNumber(new int [] {10, 10,} ) ;
		get2ndLowestNumber(new int [] {10,10,10} ) ;
		get2ndLowestNumberV2(new int [] {10,10,10} ) ;
		get2ndLowestNumber(new int [] {10,100, 50, 1,20,30, 78, 89, 5, 10} ) ;
		get2ndLowestNumberV2(new int [] {10,100, 50, 1,20,30, 78, 89, 5, 10} ) ;
*/		
		
	//	findMaxFrequentChars("aabbbvccccasgggffffxxxxmxxxxnxx");		
		
	}
	
	
	
	
	public static  String revrseStr(String s) {
		if ( s == null || s.length() <=1 )
			return s;
		else
			return s.charAt(s.length() -1) +  revrseStr( s.substring(1));
	}
	

	public static  String revrseStrV1(String s) {
		if ( s == null || s.length() <=1 )
			return s;
		StringBuilder sb = new StringBuilder();
		for(int i =0; i < s.length(); i++)
			sb.append(s.charAt(i));
		
		return sb.toString();
	}
	
	//Segregate even & odds
	
	public static void randomNumbersArrayOrderByEvenAndOdd() {
		Random r = new Random();
		int size = r.nextInt(100) + 1;
		int [] nums = new int [size];
		for(int i =0; i < size; i++)
			nums[i] = r.nextInt(1000);
		
		
	}	
	
	public static void Fibonacciseries(int n) {
		int a=0;
		int b =1;
		int t =0;
		if (n <=0) {
			System.out.println("Invalid input n = " + n);
		}
		System.out.print("" + a); // when n ==1
		for(int i =2; i <= n; i++) {
			t = a+b;
			a = b;
			b = t;
			System.out.print(", " + b); // print i-th term, i>=2
		}
			
		System.out.println("");
		
	}
	

	public static String removeDuplicatCharactersFromString(String s) {
		
		// char count map
		// 2nd pass on s and  - check if the char is on map , take 1st time & remove from map
		
		
		// Better do in 1 pass  with set
		Set set = new HashSet();
		StringBuilder sb = new StringBuilder();
		
		for(int i =0; i < s.length(); i++) 
		if (! set.contains(s.charAt(i)) ) {
			set.add(s.charAt(i));
			sb.append( s.charAt(i));		
		}
		
		// reverse a string
		
		StringBuffer s2 = new StringBuffer();
		s2.append(s);
		s2.reverse();
			
		return sb.toString();

	}
	
	
	
	
/*
Input:  R G B G B G B R R B G R R B B G R
Output: R R R R R R B B B B B B G G G G G

have to sort in a single pass

 */

public static void SortRBG(char [] chars) {
		
	System.out.println(""+ new String(chars));
		int l =0;
		int h = chars.length -1;
		int m =0;
		
		while( m <= h) {
			
			char x = Character.toUpperCase(chars[m]);
			char t;
			
			switch (x) {
			
			
			case 'R':
				t = chars[l];
				chars[l] = chars[m];
				chars[m] = t;
				l++;
				m++;
				break;
				
			case 'B':
				m++;
				break;
				
				
			case 'G':
				t = chars[h];
				chars[h] = chars[m];
				chars[m] = t;
				h--;
				break;
				
			}

		}
		
		System.out.println(""+ new String(chars));	

	}
	 
	
	public static  String longestPalindromFromBookFile(String filename) throws FileNotFoundException {
		Scanner sc = new Scanner(new File(filename));
		int tlen =0;
		int maxLen =0;
		String maxPal ="";
		
		while (sc.hasNextLine()) {
			String l = sc.nextLine();
			String [] tokens = l.split(" ");
			for( int i=0 ; i < tokens.length; i++) {
				
				int wlen = tokens[i].trim().length();
				String word = tokens[i].trim();
				
				if( tokens[i].trim().length() < 1)
					continue;
				
				if( wlen == 1 ||  isPalindrom(word ) )  {
					if ( wlen  > maxLen) {
						maxLen =wlen;
						maxPal = word;
					}
				}
				
			}
			
		}
		
		
		return maxPal;
	}
	


public static boolean isPalindrom(String s)
{
	int l =0;
    int h = s.length() -1; 
    while ( l <h &&  s.charAt(l) == s.charAt(h)) {
      l++;
      h--;
    }
    if ( l >=h) return true;
    else return false;
}
	


	
	
	public static  Set<Character> nondupCharsOfAString(String s) {
		Set<Character> s1 = new HashSet<Character>();
		if (s == null || s.length() ==0)
			return s1;
		Set<Character> s2 = new HashSet<Character>();   // s2 - to  keep the non dup chars
		for(int i =0; i < s.length(); i++) {
			if(s1.contains(s.charAt(i))) {
				s2.remove(s.charAt(i));
			}else {
				s1.add(s.charAt(i));
				s2.add(s.charAt(i));
			}
		}
		return  s2;
	}
	
	
	
public 	static int secondHighest(int [] nums) {
	    int high1 = Integer.MIN_VALUE;
	    int high2 = Integer.MIN_VALUE;
	    for (int num : nums) {
	      if (num > high1) {
	        high2 = high1;
	        high1 = num;
	      } else if (num > high2 & num != high1) {
	        high2 = num;
	      }
	    }
	    if ( high2 == Integer.MIN_VALUE) {
	    	System.out.println("No 2nd highest present  .. ");
	    }
	    	
	    return high2;
	 }
	



public 	static int secondLowest(int [] nums) {
    int l1 = Integer.MAX_VALUE;
    int l2 = Integer.MAX_VALUE;
    for (int num : nums) {
      if (num < l1) {
        l2 = l1;
        l1 = num;
      } else if (l1 < num  && num <  l2) {
        l2 = num;
      }
    }
    if ( l2 == Integer.MAX_VALUE) {
    	System.out.println("No 2nd low present  .. ");
    }
    	
    return l2;
 }

	
//  2nd distinct lowest in the array, that is not necessary 2nd in the sorted array   
	public static int get2ndLowestNumber(int [] nums)  
	{  
	    if (nums == null || nums.length < 2)  
	    {  
	        System.out.println("Input array invalid, expected array size atleats 2"); 
	        return  Integer.MIN_VALUE;  
	    }  
	  
	    int min1 = nums[0];
	    int min2 = Integer.MAX_VALUE;
	    
	    for (int i = 1; i < nums.length ; i ++)  
	    {  
	        // If num[i] is smaller than m1  -  then update both m1, m2
	        if (nums[i] < min1)  
	        {  
	            min2 = min1;  
	            min1 = nums[i];  
	        }  
	  
	        // If   min1  <  num[i] < min2  -  then update second 
	        else if (nums[i] < min2 && nums[i] != min1)  
	            min2 = nums[i];  
	    }  
	    if (min2 == Integer.MAX_VALUE) { 
	    	System.out.println("The is no 2nd lowest in the given input nums");
	    	 return  Integer.MIN_VALUE;
	    }
	    else
	    	System.out.println("2nd lowest num is: " + min2);
	    	return min2;
	} 
	
	
	
	//  2nd lowest in the array, that is 2nd in the sorted array - not distinct 2nd low  
	public static int get2ndLowestNumberV2(int [] nums)  
	{  
	    if (nums == null || nums.length < 2)  
	    {  
	        System.out.println("Input array invalid, expected array size atleats 2"); 
	        return  Integer.MIN_VALUE;  
	    }  
	  
	  
	    int seclow =0;
	//    PriorityQueue<Integer>  q = new PriorityQueue<Integer>((x,y) -> y.compareTo(x));
	    PriorityQueue<Integer>  q = new PriorityQueue<Integer>( Collections.reverseOrder());
	    
	    for (int i = 0; i < nums.length ; i ++)  
	    {  
	    	if (q.size() == 2)
	    		q.remove();
	    	q.offer(nums[i]);
	    	//q.add(nums[i]);
	    	
	       
	    }  
	    if(q.size()==2) {
	    	System.out.println("2nd lowest num-V2 is: " + q.peek());
	    	return q.peek();
	    }
	    return  Integer.MIN_VALUE; 
	    
	}
	
	
	public static void findMaxFrequentChars(String s) {
		
		// if null or size 0 return
		Map<Character, Integer> m = new HashMap<Character, Integer>();
		for (int i =0; i < s.length(); i++) {
			m.put(s.charAt(i), m.getOrDefault(s.charAt(i), 0) +1);
		}
		
		Set<Entry<Character, Integer>>  set  = m.entrySet();
		List < Entry<Character, Integer> > l = new ArrayList<Entry<Character, Integer>>(set);
	//	Collections.sort(l, (e1,e2)-> e2.getValue().compareTo(e1.getValue()));
	//	Collections.sort(l, Comparator.comparing(Entry::getValue));
		
		ArrayList<Integer> l2 = new ArrayList<Integer>();
		//
		Collections.sort(l2, Collections.reverseOrder());
		
		Collections.sort(l, Collections.reverseOrder( Comparator.comparing(Entry::getValue)) );
		Comparator<Entry<Character, Integer>> c = Comparator.comparing(Entry::getValue);
		
		Collections.sort(l,Comparator.comparing(Entry::getValue)) ;
		
		Collections.sort(l, c.reversed() );
		
		for(int i =0; i < l.size(); i ++) {
			System.out.println(" " + l.get(i).getKey()  + " count = " + l.get(i).getValue()  );
		}		
		
	}
	
	public static void findSecondHighest(int[] input)
	{ 
		int high = 0;
		int highest = input[0];
		
		for(int i=1; i<input.length; i++) {
			if(input[i] >highest) {
				high= highest;
				highest = input[i];
			}
			else if(input[i] > high && input[i] !=highest) { // avoid duplicate number
				high = input[i];
			}
		}
		if ( high ==0) {
			System.out.println("No second highest...");
		}
		else {
			System.out.println("second high..."+high);
		}
		
		System.out.println("highest..."+highest);
		
	} 
	
	public static void findSecondLowest(int[] input)
	{ 
		int low = 0;
		int lowest = input[0];
		
		for(int i=1; i<input.length; i++) {
			if(input[i] < lowest) {
				low = lowest;
				lowest = input[i];
			}
			else if(input[i] < low && input[i] !=lowest) {
				low = input[i];
			}
		}
		
		if ( low == 0) {
			System.out.println("No second lowest...");
		}
		else {
			System.out.println("second low..."+low);
		}
		System.out.println("lowest..."+lowest);
		
	} 
	
	   public static String newString(String str) 
	    {     
	        if ((str==null)||(str.length() <= 1) )
	            return str;
	        return newString(str.substring(0,str.length()-2)) + str.charAt(str.length()-1);
	    }
	
	   public static void isPalindrome(int input) {
		   
		   int num =input;
		   int rev = 0;
		   while(num > 0) {
			   rev = rev*10 + num%10;
			   num = num/10;
		   }
		   if(input == rev) {
			   
			   System.out.println("palindrome..."+input);
		   }
		   else {
			   System.out.println("NOT palindrome..."+input);
		   }
			   
	   }
	   
	   
}
