package com.test.exerciseTest;

public class test2 {

	public static void main (String[] args)  {
		test2 obj = new test2();
	//	obj.reverseInteger();
		obj.Fibonoci(9);
	//	System.out.println("New String   is \'"+obj.newString("Flexton")+"\'"); 
	}
	
	public void reverseInteger(){
	    int num = 78965;
	    int rev =0;
	    System.out.println("number..."+num);
	    while (num!=0){
	    	rev = rev*10 + num%10;
	    	num = num/10;
	    }
	    System.out.println("reverse..."+rev);
	}
	
	public void Fibonoci(int n){
		
		int prev =0;
		int sum =0;
		int next = 1;
		
		if (n <= 1){
			System.out.println ( "fibonoci ..."+n);
		}
		else{
			for (int i=2; i<=n; i++){
				sum = prev + next;
				prev = next;
				next = sum;
				System.out.println ( "sum ..."+sum);
				System.out.println ( "prev ..."+prev);
				System.out.println ( "next ..."+next);
			}
			System.out.println ( "fibonoci ..."+sum);
		}	
	}
	
	public String newString(String str) 
	    {    
	        if ((str==null)||(str.length() <= 1) )
	            return str;
	        return newString(str.substring(0,str.length()-2)) + str.charAt(str.length()-1);
	    }
	        
	}
/*	
	public void reverseIntegerVer2(){
	    int num = 78965;
	    int rev =0;
	    int [] org = Arrays.
	    
	    System.out.println("number..."+num);
	    while (num!=0){
	    	rev = rev*10 + num%10;
	    	num = num/10;
	    }
	    System.out.println("reverse..."+rev);
	}
*/

