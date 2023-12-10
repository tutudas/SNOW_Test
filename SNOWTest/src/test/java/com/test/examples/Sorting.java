package com.test.examples;

public class Sorting {
	
public static void main(String[] args) {
		
		String arr[] = 
			  {
			    "Now", "is", "the", "time", "for", "all", "good", "men",
			    "to", "come", "to", "the", "aid", "of", "their", "country"
			  }; // not correct result
		String arr1[] =  {"hi", "is", "the", "time", "for"};

		int [] in = {5, 6,8,1,9,12,78,67,3,4};
		bubbleSortv2(in);		
	//	bubbleSortString(arr1);
}	

// for int array
public static void bubbleSort(int [] input) {
	
	
	  for(int j = 0; j < input.length; j++) 
	    {
	      for(int i = j + 1; i < input.length ; i++) 
	      {
	        if(input[i] < input[j] ) 
	        {
	          int tmp = input[j];
	          input[j] = input[i];
	          input[i] = tmp;
	        }
	       
	      }
	      System.out.println(input[j]);
	    }
	}

//for int array
public static void bubbleSortv2(int [] input) {
	
	int l = input.length;
	
	  for(int i = l-2; i >= 0; i--) 
	    {
	      for(int k = 0; k <= i ; k++) 
	      {
	        if(input[k] > input[k+1] ) 
	        {
	          int tmp = input[k+1];
	          input[k+1] = input[k];
	          input[k] = tmp;
	        }
	       
	      }
	     
	    }
	  for(int i=0; i<input.length; i++) {
		  System.out.println(input[i]);
	  }
	}

// for string array

public static void bubbleSortString(String[] arr) 
{
  for(int i = 0; i < arr.length; i++) 
  {
    for(int j = i + 1; j < arr.length; j++) 
    {
      if(arr[i].compareTo(arr[j]) > 0) 
      {
        String t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
      }
    }
    System.out.println(arr[i]);
  }
}

}// end class
