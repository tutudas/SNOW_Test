package com.test.exerciseTest;

import java.awt.List;
import java.security.KeyStore.Entry;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;


	/*
	 public static void main (String[] args)  
	    {
		 int [] arr1 = { 2, 5, 7, 5, 8,9,5};
		 int x = (int) 35.95;
		 Test obj = new Test();
		 System.out.println(obj.validate("123.456.78.89"));
		 System.out.println("x:  "+x);
		 Arrays.sort(arr1);
		 System.out.println("sorted array:  "+(Arrays.toString(arr1)));
	    }
	private static final Pattern PATTERN = Pattern.compile(
	        "^(([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\.){3}([01]?\\d\\d?|2[0-4]\\d|25[0-5])$");

	public static boolean validate(final String ip) {
	    return PATTERN.matcher(ip).matches();
	}
	*/
	
public class Test {	
	
	public static void main (String[] args) {
		Test obj = new Test();
	//	obj.compareSortedArrays();
	//	obj.isPrime(56);
		obj.reverse();
	}
	
	public void reverse(){
	    String s1 = "%$#@@   yummy900 56 $%%%#@";
	//    int len = s1.length();
	    String revStr ="";
	    System.out.println("before..."+s1);
	    s1= s1.replaceAll("[^a-zA-Z0-9]", "");
	    System.out.println("after ..."+s1);
	    
	    int len = s1.length();
	    for (int i=len -1; i>=0; i--){
	    revStr = revStr + s1.charAt(i);    
	    }
	    System.out.println("reverse..."+revStr);
	 //   System.out.println("after remove junk..."+s1.replaceAll("[^a-zA-Z0-9]", "")); 
	}

	
public void compareSortedArrays(){
		
		int [] arr1 = { 7, 8, 2,5,9 };
		int [] arr2 = { 3, 5, 7, 1, 8,9,2};
	//	int [] arr2 = { 15, 18, 17, 10, 13,9};
		
		ArrayList l = new ArrayList();
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		System.out.println("arr1..."+Arrays.toString(arr1));
		System.out.println("arr2..."+Arrays.toString(arr2));

		if ((arr1[arr1.length -1]< arr2[0]) || (arr2[arr2.length -1]< arr1[0]))
		{
			System.out.println("no common number");
		}
		else if (arr1[arr1.length -1]== arr2[0]){
			System.out.println("common number.." +arr2[0]);
		}
		else if (arr2[arr2.length -1]== arr1[0]){	
			System.out.println("common number.." +arr1[0]);
		}
		else{
			for (int i=0; i<=arr1.length-1; i++){
				for (int j=0; j<=arr2.length-1; j++){
					if (arr1[i] == arr2[j]){
						l.add(arr1[i]);		
				}
			}
		} // end else
		System.out.println("size of list.."+l.size());		
				
		for (int x=0; x<l.size(); x++){
				System.out.println("common number.." +l.get(x));
				}
		
			}
	} // end method

public void isPrime(int num){
	int flag = 0;
	if (num ==0 || num ==1){
		System.out.println("it is not prime");
	}
	for (int i=2; i<num/2; i++){
		if((num%i) == 0){
			flag =1;
			System.out.println("it is not prime");
			break;
		}
	if (flag == 0 ){
			System.out.println("it is prime");
		}
	}
	
}



} // end class

/*
    public static void main (String[] args)  
    { 
    	
    	String s = "name"+1+2+"mo"+9+8;
    	int num = 10 +(+12) -(-6) - 8+(-2)+1;
        int arr1[] = {1, 2, 3}; 
        int arr2[] = {1, 2, 3}; 
        if (Arrays.equals(arr1, arr2))  // Same as arr1.equals(arr2) 
            System.out.println("Same"); 
        else
            System.out.println("Not same"); 
        System.out.println("string:" +s);
        System.out.println("num:" +num);
        
    	
    	// String is immutable
        String one ="Random";
     //   String two ="Random";
        String two =new String("Random");
       //  one ="RAndom";
      //  String two ="RAndOm";
        
        if (one == two){
        	System.out.println("one == two" );
        }
        else{
        	System.out.println("one != two" );
        } 
        if (one.equals(two)){
        	System.out.println("value is equal" );
        }
        else{
        	System.out.println("value is NOT equal" );
        }  
        
        Test obj = new Test();
  //      obj.repeatNumbers();
   //     obj.checkPalindrom();
        obj.checkPalindromVer2();
   //     System.out.println(obj.isPalindrome("moomy"));
        
    } 
    
    
    public void repeatNumbers(){
    	int [] arr = { 2, 5, 7, 5, 8,9,5};
    	Map hmap = new HashMap();
    	int count =1;
    	
    	for ( int i=0; i<= arr.length -1; i++){
    		Object hVal = hmap.get(arr[i]);
			if (hVal != null) { // testid exist in the hmap
				count++;
				hmap.put(arr[i], count);
			} else { // testid does not exist in hmap
				
				hmap.put(arr[i], count);
			}	
    	}
    	Set keySet = hmap.keySet();
		Object [] arr2 = keySet.toArray(); 
    	for (int x = 0; x < arr2.length;x++) 
		  { 
			  System.out.println("Key ="  + arr2[x] + " , " +"Val = " +  hmap.get(arr2[x]) );
		  
		  }	
    }
    
    public void checkPalindrom(){
    	String str = "moom";
    	char [] arr1 = str.toCharArray();	
    	if (arr1.length % 2 == 0){
    		for (int i=0; i<= arr1.length-1/2; i++){
    			if (arr1[i] != arr1.length-i-1){
    				System.out.println("not palindrome");
    			}
    			else {
    				System.out.println("palindrome.......");
    			}
    		}
    		
    	}
   
    }
    
    public void checkPalindromVer2(){
    	String str = "moom";
    	String revStr;
    	char [] arr1 = str.toCharArray();
    	char[] arr2 = new char[arr1.length];
    	
    	for ( int i=0; i<=arr1.length -1; i++){
    		arr2[i]= arr1[arr1.length-1-i];	
    	}
    	revStr = arr2.toString();
    //	revStr = new String(arr2);
    	System.out.println("string..." +str);
    	System.out.println("reverse string...." +revStr);
    	if (str.equals(revStr) ){
    		System.out.println("palindrome");
		}
		else {
			System.out.println(" not palindrome.......");
    	}
    }
    
    
    public static boolean isPalindrome(String str) {
        return str.equals(new StringBuilder(str).reverse().toString());
    }
    */
    	
    	




