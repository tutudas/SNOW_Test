package com.test.leetcode;

import java.security.KeyStore.Entry;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Set.*;

import javax.swing.text.html.HTMLDocument.Iterator;

// merge 2 sorted list in sorted way
// find kth largest element


// missing number - done
// duplicate string - use hashset and hashmap
// largest/smallest integer
// https://www.youtube.com/watch?v=PaUwqAzom2Y&list=PLFGoYjJG_fqr84PKCp88iPkQDWJSfzaqz&index=7&ab_channel=NaveenAutomationLabs



public class Test2 {

	public static void main(String[] args){
		
		//int a = 10/0;
		
	//	System.out.println("value of a..."+a);
	
//		 int [] a1 = {2,6,7,8}; // working
//		 int [] a2 = {1,3,5,9}; // working
		 
		 int [] a1 = {2,6,7,12};
		 int [] a2 = {1,3,5,9};
		 
		 String[] arr = {"abc","def","abc"};
		 
		 	Test2 obj = new Test2();
		// 	obj.findMissingNum(a1);
		// 	System.out.println("missing num..."+obj.findMissingNum(a1));
	   //   System.out.println("missing num..."+obj.leftRigthDifference(a1));
	    //  System.out.println("missing num..."+obj.divisibilityArray("9986", 3));
		 //	System.out.println("duplicate..."+obj.findDuplicate(arr));
		 	obj.mergeTwoSortedArray(a1, a2);
		 //	obj.mergeTwoSortedArrayv2(a1, a2);
		 	
	     }
	 	 
	 public int[] leftRigthDifference(int[] nums) {
	        int [] result = new int[nums.length];
	        int [] lSum = new int[nums.length];
	        int [] rSum = new int[nums.length];
	     	lSum [0] = 0;
	     	rSum [rSum.length -1] = 0;     
	        
	    for ( int i=1; i<nums.length; i++)  {
	    	
	    		lSum[i]=nums[i-1]+lSum[i-1];
	    	
	    		rSum[rSum.length -i-1]=nums[nums.length-i]+rSum[rSum.length -i];
	    }
		 for ( int l=0; l<lSum.length; l++) {
					 result[l]= Math.abs(lSum[l] - rSum[l]);
				 } 
		 return result;
	    }

	 public int[] divisibilityArray(String word, int m) {
	       int[] result = new int[word.length()];
	       int l = word.length();
	        
	       int foo = Integer.parseInt(word);
	        
	       for ( int i=0; i<=l; i++){
	    	   
	    	 		int div = (int) (foo / Math.pow(10, l-i));
	    	   		if( (div/m) == 0 ) {
	    	   				result[i] = 0;
	    	   			}
	    	   		else {
	    	   			result[i] = 1;
	    	   		}
	        }        
	        return result;
	    }

	 
	 public int findMissingNum(int [] a1) {
		 
		 Arrays.sort(a1);
		 int first = a1[0];
		 int last = a1[a1.length -1];
		 
		 int sum =0;
		 int originalSum =0;
		 
		 for ( int i=0; i<a1.length; i++){
			 sum = sum +a1[i];
		 }
		 for ( int i=first; i<=last; i++){
			 originalSum = originalSum +i;
		 }
		 
		 
		 return (originalSum - sum);
	 }
	 
	 public String[] findDuplicate(String[] a1) {
		 
		 String[] result = new String[a1.length];
		 HashMap hmap = new HashMap();
		 
		 for(int i=0; i<a1.length; i++) {
			 Integer count = (Integer) hmap.get(a1[i]);
			 
			 if(count==null) {
				 hmap.put(a1[i], 1);
				 System.out.printf("array..."+a1[i]+" ");
			 }
			 else {
				 hmap.put(a1[i], ++count);
				 System.out.printf("array2..."+a1[i]+" ");
			 }
		 }
		 
		 Set<String> keys = hmap.keySet(); 
		 for(String key: keys){
			   Integer value = (Integer) hmap.get(key);	
			   if(value >1) {
				   System.out.printf("duplicate..."+hmap.get(key));
				 //System.out.printf("duplicate..."+hmap.getValue()));
			   }
		 }
		 return result;
	 }
	 
	 public static void mergeTwoSortedArray(int[] a1, int[] a2) {
		 
	//	 int [] a1 = {2,6,7,12};
	//	 int [] a2 = {1,3,5,9};
			
		//	int fIndex = 0;
			int sIndex = 0;
			int k = 0;
			int[] result = new int[a1.length + a2.length];
			
			for(int fIndex=0; fIndex<a1.length; fIndex++) {
				while(a1[fIndex] > a2[sIndex] && sIndex<a2.length) {
					result[k]= a2[sIndex] ;
					sIndex++;
					k++;
					
					if(sIndex==a2.length) break;
				}
				result[k]= a1[fIndex] ;
				k++;
			}
				if (sIndex<a2.length) {
					result[k]= a2[sIndex] ;
					sIndex++;
					k++;
				}
			
			for(int j=0; j<result.length; j++) {
					System.out.println(" mergeTwoSortedArray Result..." +result[j]);
					
				}
			} 
	 
	 
	 public static void mergeTwoSortedArrayv2(int[] a1, int[] a2) {
		 
			//	 int [] a1 = {2,6,7,12};
			//	 int [] a2 = {1,3,5,9};
					
					int i = 0;
					int j = 0;
					int k = 0;
					int[] a3 = new int[a1.length + a2.length];
					
					for(k=0; k<a3.length; k++) {
						if(a1[i] > a2[j]) {
							a3[k] = a2[j];
							j++;
						}
						else {
							a3[k] = a1[i];
							i++;
						}
						
					if(i>= a1.length) break;
					if(j>= a2.length) break;
					}
					
					if(i<a1.length) {
						a3[++k] = a1[i];
				}
					if(j<a2.length) {
						a3[++k] = a2[j];
				}
					for(int l=0; l<a3.length; l++) {
						System.out.println(" mergeTwoSortedArray Result..." +a3[l]);
						
					}
	 }	 

} // end class
	 
