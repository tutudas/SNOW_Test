package com.test.exerciseTest;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class javaPractise2 {
	
	public HashMap hmap = new HashMap();
	public HashMap hCountMap = new HashMap();
	public int z = 4;
	static int x = 10;
	
	private int y = 5;
	
	public static void main(String[] args) throws Exception {
		javaPractise2 obj = new javaPractise2();
		javaPractise2 obj2 = new javaPractise2();
		//obj.ArrayListDemo();
	//	obj.isPalindrome();
	//	obj.anagramCheck();
	//	obj.readFromFile();
		
//		obj.x = 20;
//		 obj.y = 35;
//		obj2.x = 50; 
//		javaPractise2.x = 100;
//		 System.out.println("value of x: " +x);
//		 System.out.println("value of y: " +obj.y);
//		 
		int[] arr1 = { 1,2,3,4,5};
		int[] arr2 = { 1,2,6,4,5};
		int[] arr3 = {5,3,2,4,1};
		
		System.out.println("Is Monotonic: "+obj.isMonotonic(arr1));
		System.out.println("Is Monotonic: "+obj.isMonotonic(arr2));
		System.out.println("Is Monotonic: "+obj.isMonotonic(arr3));
	}
	
	
	public void isPalindrome( ) {
		String original, reverse = "";
	      Scanner in = new Scanner(System.in);
	      System.out.println("value of x: " +x);
	      System.out.println("Enter a string to check palindrome: ");
	      original = in.nextLine();
	      System.out.println("original string is: "+original);
	      
	      int length = original.length();
	 
	      for ( int i = length - 1 ; i >= 0 ; i-- )
	         reverse = reverse + original.charAt(i);
	 
	      System.out.println("Reverse of entered string is: "+reverse);
	      if (original.equals(reverse))
	    	  System.out.println("String is palindrome ");
	      else
	    	  System.out.println("String is not palindrome... ");
	}
	
	
	public void anagramCheck( ) {
		String word1, word2 = "";
	      Scanner in = new Scanner(System.in);
	 
	      System.out.println("Enter first word: ");
	      word1 = in.nextLine();
	      System.out.println("first word is: "+word1);
	      
	      System.out.println("Enter second word: ");
	      word2 = in.nextLine();
	      System.out.println("second word is: "+word2);
	      
	      word1 = (word1.toLowerCase()).trim();
	      char[] arr1 = word1.toCharArray();
	       Arrays.sort(arr1);
	       String sWord1 = new String (arr1);
	       System.out.println("after sorting first word is: "+sWord1);
	       
	      word2 = (word2.toLowerCase()).trim();
	      char[] arr2 = word2.toCharArray();
	      Arrays.sort(arr2);
	      String sWord2 = new String (arr2);
	      System.out.println("after sorting second word is: "+sWord2);
	      
	     if (sWord1.equals (sWord2))
	    	 
	    	 System.out.print("words are  anagram .");
	     else
	    	 System.out.print("There is no anagram present.");
	 
	     /*
	     if (word1.length() != word2.length()) 
	      {
	          System.out.print("There is no anagram present.");
	      } 
	      else 
	      {
	          boolean isFound = true;
	          for (int i=0; i<arr1.length; i++)
	          {  
	              for(int j = 0; j < arr2.length; j++) 
	              {
	                  if(arr1[i] != arr2[j])
	                  {
	                      System.out.print("NOT ANAGRAM.\n");
	                      
	                  }
	              }
	             
	          }
	          System.out.printf("%s is an anagram of %s", word1, word2);
	      }
	}
	
	*/
	} //end of anagramCheck method
	
	private void readFromFile()
	{

		String fName = "C:/Suparna/dataDir/data_1.txt";
	
		try {
			File dataFile = new File(fName);
			String line;
			FileReader freader = new FileReader(dataFile);
			BufferedReader rdr =  new BufferedReader(freader);

			//line = rdr.readLine();
			// System.out.println("line ="  + line );
			while ((line = rdr.readLine()) != null)
			{
				String[] sArray = line.split(" ");
		
			for (int x = 0; x < sArray.length; x++) 
			{	 
				Object hVal = hmap.get(sArray[x]);

				if (hVal != null) { // testid exist in the hmap
					Integer count = (Integer) hVal;
					count ++;
					hmap.put(sArray[x], count);
					hCountMap.put(count, sArray[x]);
				} else { // testid does not exist in hmap 
					hmap.put(sArray[x], 1);
					hCountMap.put(1, sArray[x]);
				     }
			}// end for loop
		}
			Set keySet = hmap.keySet();
			  Object [] arry2 = keySet.toArray(); 
			  for (int x = 0; x < arry2.length;x++) 
			  { 
				  System.out.println("Key (word);  testCount ="  + arry2[x] + " , "  + hmap.get(arry2[x]) );
			  
			  }	
			  
			  Set keyValSet = hCountMap.keySet();
			  Object [] arryCount = keyValSet.toArray(); 
			  for (int x = 0; x < arryCount.length;x++) 
			  { 
				//  if(arryCount[x] <arryCount[x+1])
				  System.out.println("Key (word);  testCount ="  + arryCount[x] + " , "  + hCountMap.get(arryCount[x]) );
			  
			  }	
		    
		}
		catch (Exception e ) {
			e.printStackTrace();
		}
			
	} //end of readfromfile
	
	public void ArrayListDemo(){
		  
		      // create an empty array list with an initial capacity
		    ArrayList<Integer> arrlist = new ArrayList<Integer>(5);

		    // use add() method to add elements in the list
		    arrlist.add(15);
		    arrlist.add(22);
		    arrlist.add(30);
		    arrlist.add(40);

		    // adding element 25 at third position
		    arrlist.add(2,25);
		    arrlist.add(0,54);
			  
		    // let us print all the elements available in list
		    for (Integer number : arrlist) {
		      System.out.println("Number = " + number);
		    }  
		  }
		   
	public boolean isMonotonic (int[] arr1){
		int index = 0;
		boolean result = true;
		
		if ( arr1.length <3){
			return result;
		}
		while ( arr1[index] ==arr1[index +1] ){
			System.out.println("inside while: "+arr1[index]);
			System.out.println("inside while index: "+index);
			if ( index== arr1.length - 2){
				System.out.println("inside if length: "+arr1.length);
				System.out.println("inside if index: "+index);
				System.out.println("inside if: "+arr1[index]);
				return result;
				
			}
			index++;
		}
		if(arr1 [index] < arr1 [index+1]){
			for ( int i=0; i<arr1.length-2; i++){
				if (arr1 [i+1] >= arr1 [i +2]){
				result = false;
			}
			}
		}
		
		if(arr1 [index] > arr1 [index+1]){
			for ( int i=0; i<arr1.length-2; i++){
				if (arr1 [i+1] <= arr1 [i+2]){
				result = false;
			}
			}
		}
		return result;
	} // end isMonotonic method
	
}// end of class
