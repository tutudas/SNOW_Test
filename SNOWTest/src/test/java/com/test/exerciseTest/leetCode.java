package com.test.exerciseTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class leetCode {
	
	public static void main(String[] args) throws Exception {
		char[] s = {'h','e','i','l','o'};
		int[] a1={2, 1, 7, 6, 4, 2, 9};
		int[] a2={2, 1, 7, 6, 4};
		
		leetCode obj = new leetCode();
	//	System.out.println("word is: "+obj.reverseVowels("heilo"));
	//	obj.reverseString(s);
	//	System.out.println("is equal: "+obj.isEqualArrays(a1, a2));
		
		System.out.println("result: "+obj.countLetter("hhhttt"));
	}
	
	public int[] shuffleArray(int[] nums, int n ){
		int[] result = new int [2*n];
		for(int i=0; i<n; i++){
			result[2*i]=nums[i];
			result[2*i+1]= nums[n+i];
		}
		return result;
	}
	
	public String reverseVowels(String s){
		
		ArrayList vowelarr = new ArrayList();
		for(int i=0; i< s.length(); i++){
			if(s.charAt(i) == 'a'|| s.charAt(i) == 'e'|| s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u'||s.charAt(i) == 'A'||s.charAt(i) == 'E'
					||s.charAt(i) == 'I'||s.charAt(i) == 'O'||s.charAt(i) == 'U'){
					vowelarr.add(s.charAt(i));
				}
		}
		String res = "";
		for(int k=0; k< s.length(); k++){	
			if(s.charAt(k) == 'a'|| s.charAt(k) == 'e'|| s.charAt(k) == 'i' || s.charAt(k) == 'o' || s.charAt(k) == 'u'||s.charAt(k) == 'A'||s.charAt(k) == 'E'
					||s.charAt(k) == 'I'||s.charAt(k) == 'O'||s.charAt(k) == 'U'){
						res += vowelarr.remove(vowelarr.size() - 1);
			}
			else{
				
				res += s.charAt(k);
			}
							
		}				
		return res;	
	}
	
	 public char[] reverseString(char[] s) {
		 
		 String str = String.valueOf(s);
		 System.out.println("str...."+str); 
		 
		 String reverse = new StringBuffer(str).reverse().toString();
		 System.out.println(reverse);  
	       return reverse.toCharArray();
	 }
	 
	 public boolean isEqualArrays(int[] a1, int[] a2){
		 boolean flag;
		 Arrays.sort(a1);
		 Arrays.sort(a2);
		 
		 System.out.println(Arrays.toString(a1)); 
		 
		 if(Arrays.equals(a1, a2)){
			 flag = true;
		 }
		 else{
			 flag = false;
		 }
		 return flag;
	 }
	 
	 public String countLetter(String s ){
		 String result = new String();
		 HashMap hmap = new HashMap();
		 
		 for (int i=0; i<=s.length() -1; i++){
			 Object hVal = hmap.get(s.charAt(i));
			 
			 if (hVal != null) { // testid exist in the hmap
					Integer count = (Integer) hVal;
					count ++;
					hmap.put(s.charAt(i), count);
			 }
			 else { // testid does not exist in hmap 
					hmap.put(s.charAt(i), 1);
			 	}
			 }
			
		 Set keySet = hmap.keySet();
		 Object [] arry2 = keySet.toArray(); 
		 for (int x = 0; x < arry2.length;x++) 
		  { 
			  System.out.println("Key , Val  ="  + arry2[x] + " , "  +  hmap.get(arry2[x]) );
			  result = arry2.toString();
		  }	
		 
		 return result;
	 }

	} // end class leetCode
