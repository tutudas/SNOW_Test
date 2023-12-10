package com.test.exerciseTest;

public class MathUtil {

	
public static void main(String[] args) throws Exception {
		
		int[] input ={-8,20,19,18,3,14,4,9,-2,25}; 
		int[] num ={-8,19,0,3,0,4,9}; 
		
		MathUtil obj = new MathUtil();
		// obj.findSecondLowest(input);
		// obj.findSecondHighest(input);
	//	 System.out.println(2/0);  // will give arithmetic exception - runtime exception
		// System.out.println(2.0/0);  // will work - Infinity
		// obj.findDigitCount(-78537);
	//	obj.isPrime(5);
	//	obj.countEvenAndOddNumber(451238);
	//	System.out.println("factorial..." +obj.Factorialv2(5));
	//	obj.reArrangeArray(num);
		obj.isFibonoci(4);
	}	

// main method can be overloaded without any compile and run time error
//but this main method will not execute

public static void main(int[]args) throws Exception {
	System.out.println("Main method Overloded" );
}
		
	public int sum(int x, int y) {
		int z = x +y;
		return z;	
	}
	
public static void isFibonoci(int n) {
	
	int n1=0,n2=1,n3,i;  
	 System.out.print(n1+" "+n2);//printing 0 and 1  
	  
	 for(i=2;i<n;++i)//loop starts from 2 because 0 and 1 are already printed  
	 {  
	  n3=n1+n2;  
	  System.out.print(" "+n3);  
	  n1=n2;  
	  n2=n3;  
	 }  
		
	}

	public int Factorial(int x) {
		int result =0;
		if( x <= 0) {
			result = 1;
		}
		else {
			result = x  *  Factorial( x-1);
		}
		
		return result;
	}
	
	// put all zeros at the end
	public void reArrangeArray(int[] num) {
		
		int l = 0;
		int h = num.length -1;
		int t = 0;
		
		while(l< h) {
			while (num[l] != 0) l++;
			while (num[h] == 0) h--;
			if(l<h) {
				t = num[h];
				num[h] = num[l];
				num[l] = t;
			}
		}
		for(int i=0; i<num.length; i++) {
			System.out.println("re arrange array.."+num[i] );
		}
	}
	
	public int Factorialv2(int num) {
		int result = 1;
		if( num <= 1) {
			result = 1;
		}
		else {
			for(int i=2; i<=num; i++) {
				result = result * i;
			}
			
		}
		
		return result;
	}
	
	
	public void printBinaryFormat(int number){
		 System.out.println("shot val=" + (short) number );
        int binary[] = new int[32];
        for(int i = 0;i <=31;i++)
        	binary[i] =0;
        
        int index = 0;
        while(number > 0){
            binary[index++] = number%2;
            number = number/2;
        }
        for(int i = 31;i >= 0;i--){
            System.out.print(binary[i]);
        }
        System.out.print("\n");
        
    }

	public int getDecimalFromBinary(int binary)
	{ 
		int decimal = 0; int power = 0; 
	while(true)
	{ 
	if(binary == 0)
	{ 
		break;
		} 
	else { 
		int tmp = binary%10; 
		decimal += tmp*Math.pow(2, power); 
		binary = binary/10; power++; } 
	} 
	return decimal;
	} 
	
	public void findSecondLowest(int[] input)
	{ 
		int low = 0;
		int lowest = input[0];
		
		for(int i=1; i<input.length; i++) {
			if(input[i] < lowest) {
				low = lowest;
				lowest = input[i];
			}
			else if(input[i] < low) {
				low = input[i];
			}
		}
		
		System.out.println("low..."+low);
		System.out.println("lowest..."+lowest);
		
	} 
		
	public void findSecondHighest(int[] input)
	{ 
		int high = 0;
		int highest = input[0];
		
		for(int i=1; i<input.length; i++) {
			if(input[i] >highest) {
				high= highest;
				highest = input[i];
			}
			else if(input[i] > high) {
				high = input[i];
			}
		}
		
		System.out.println("high..."+high);
		System.out.println("highest..."+highest);
		
	} 
	
	public void findDigitCount(int num) {
		int count =0;
		while(num!=0) {
			num = num/10;
			count++;
		}
		System.out.println("digit count..."+count);
		
	}
	
	public void countEvenAndOddNumber(int num) {
		
		int evenCount =0;
		int oddCount =0;
		
		while(num!=0) {
			int digit = num%10;
			if(digit/2 ==0) {
				evenCount++;
			}
			else {
				oddCount++;
			}
			num = num/10;
		}
		System.out.println("odd count..."+oddCount);
		System.out.println("even count..."+evenCount);
		
	}
	
public void isPrime(int num) {
	
		int count = 0;
		System.out.println("number..."+num);	
		
		for(int i=2; i<= num/2; i++) {
				if(num/i == 0) {
					System.out.println("NOT Prime..."+num);
				}
			}
			
		System.out.println("Prime..."+num);
			
	}
	
}
