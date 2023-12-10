package com.test.examples;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class Tesla {

	public static void main(String[] args) throws FileNotFoundException {
		
		int[] a1 = {-7,-1,8,-6,5,9};
		
		List l1 = Arrays.asList(2,4,7,9);
		List l2 = Arrays.asList(5,4,8,3,9);
		
	//	resetArray(a1);
	//	setArrayAlternateOrder(a1);
	//	checkRepeatCharv2("Satyis");
		addDelimiterInString("Satyis");
	//	checkRepeatCharUsingHashMap("Satyis");
		
	//	findCommonNumbers(l1, l2);
	//	removeDuplicate("tyssmnt");
	//	removeDuplicatev2("ppgtt");
		
	}
	
// 1 pass - using same array


public static void resetArray(int[] input) {
	
	int l = 0;
	int h = l+1;
	int tmp = 0;
	int size = input.length;

	while(l<input.length -1)	{
		if(input[l] < 0) {
			while (input[h] < 0 && h<size -1) h++;
			tmp = input[h];
			input[h] = input[l+1];
			input[l+1] = tmp;
			l++;
			h = l+1;
		}
	
		else if(input[l] >0) {
			while (input[h] >= 0 &&  h<size -1) h++;
			tmp = input[h];
			input[h] = input[l+1];
			input[l+1] = tmp;
			l++;
			h = l+1;
	
		}
	}
	
	for ( int i=0; i<input.length; i++) {
		System.out.println("result ... "+input[i]);
		}
	
} // end resetArray

/*
// WIP - using set
public static void setArrayAlternateOrder(int[] input) {
	
	Set pos = new HashSet();
	Set neg = new HashSet();
	int[] result = new int[input.length];
	
	for(int i=0; i<input.length; i++) {
		if(input[i] < 0) {
			if(!neg.contains(input[i])){
				neg.add(input[i]);
			}
		}
		else {
			if(!pos.contains(input[i])){
				pos.add(input[i]);
			}
		}
	}
	
	for(int i=0; i<result.length; i++) {
		int j = 0;
	      for (Integer i: hashSet) {
	         array[j++] = i;
	      }
	}
}
*/
// return int [] by adding a1 and a2 alternative position 

public static void setArrayAlternateOrder(int[] input) {
	
	int posIndex = 0;
	int negIndex = 0;
	ArrayList pos = new ArrayList();
	ArrayList neg = new ArrayList();
	int[] result = new int[input.length];

	for(int i=0; i<input.length; i++) {
		
		if(input[i] < 0) {
			pos.add(input[i]);
		}
		else {
			neg.add(input[i]);
		}
	}
	for(int i=0; i<result.length; i++) {
		
		if(i%2 == 0) {
			result[i] = (int) pos.get(posIndex);
			posIndex++;
		}
		else {
			result[i] = (int) neg.get(negIndex);
			negIndex++;
		}
	}
	
	for(int j=0; j<result.length; j++) {
			System.out.println(" setArrayAlternateOrder Result..." +result[j]);
			
		}
	}


// pass - find duplicate char

public static void checkRepeatChar(String s) {
	
	int count = 0;
	char dup ='0';
	s = s.toLowerCase();
	
	for(int i=0; i< s.length(); i++) {
		for(int j=i+1; j< s.length(); j++) {
			if(s.charAt(i) == s.charAt(j)) {
				count++;
				dup = s.charAt(i);
			}
		}		
	}
	System.out.println("duplicate char..." +dup);
}
// WIP
public static void checkRepeatCharUsingHashMap(String s) {
	
	Map m = new HashMap();
	char[] str = s.toCharArray();
	
	for(int i=0; i< str.length; i++) {
		if( m.containsKey(str[i])) {
			m.put(s.charAt(i), (int)m.get(str[i])+1);
		}
		else {
			m.put(s.charAt(i), 1);
		}
	}
	
	 System.out.println(m.toString());
}	


public static void addDelimiterInString(String s) {
	
	StringBuffer sb = new StringBuffer();
	for(int i=0; i< s.length(); i++) {
		sb.append(s.charAt(i));
//		while(i<= s.length()-1) {
		if(i< s.length()-1)
			sb.append(',');
//		}
	}
	System.out.println("rearrange array..." +sb.toString());
}

public static List findCommonNumbers(List l1, List l2) {
	
	List out = new ArrayList();
	
	if(l1.size() ==0 || l2.size() == 0) {
		System.out.println("No common number....");
	}
	else {
		for(int i=0; i<l1.size(); i++) {
			for(int j=0; j<l2.size(); j++) {
				if(l1.get(i).equals(l2.get(j))) {
					out.add(l1.get(i));
				}
			}
		}
	}
//	for(int i=0; i<out.size(); i++) {
//		System.out.println("common number...." + out.get(i));
//	}
	System.out.println("common number...." + out.toString()); // print list using toString method
	return out;
	
}

// using set
public static void removeDuplicate(String str) {
	
	StringBuffer sb = new StringBuffer();
	StringBuffer remove = new StringBuffer();
	//char[] removeChar = new char[str.length()];
	
	Set s = new HashSet();
	//s.add(str);
	for(int i=0; i<str.length(); i++) {
		if(!s.contains(str.charAt(i))){
			s.add(str.charAt(i));
			sb.append(str.charAt(i));
		}
		else {
			remove.append(str.charAt(i));
			remove.append(',');
		}
	}
	
	System.out.println(" duplicate char...." + remove.toString()); 
	System.out.println("string after remove duplicate ...." + sb.toString()); 
	
}

// using 2 loops
public static void removeDuplicatev2(String str) {
	
	StringBuffer sb =  new StringBuffer();
	StringBuffer remove =  new StringBuffer();
	char[] s2 = str.toCharArray();
	
	for(int i=0; i<s2.length-1; i++) {
		for(int j=i+1; j<s2.length; j++) {
//			System.out.println("i...." + str.charAt(i));
//			System.out.println("j...." + str.charAt(j));
		if(s2[i] != s2[j]){
			sb.append(s2[i]);
		}
		else {
			remove.append(s2[i]);
			remove.append(',');
			}
		}
	}
	
	System.out.println("string after remove duplicate ...." + sb.toString());
	System.out.println(" duplicate char...." + remove.toString()); 	
}



} // end class
