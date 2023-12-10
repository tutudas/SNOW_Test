package com.test.recursiveTest;
import java.util.Scanner;

public class Factorial
{
     public static void main(String args[])
     {
       Factorial obj_one = new Factorial();
       
       Scanner keyboard = new Scanner(System.in);
       System.out.println("enter an integer");
       int myint = keyboard.nextInt();
       int a = obj_one.fact(myint);
       
       System.out.println("The factorial of the number is : " + a);
       System.out.println("The fib of the number is : " + obj_one.fibonacci(-10));
       System.out.println("The fib of the number is : " + obj_one.fibonacci(0));
       System.out.println("The fib of the number is : " + obj_one.fibonacci(1));
       System.out.println("The fib of the number is : " + obj_one.fibonacci(6 ));
       
     }
     
public int fact (int n)
{
        int result;
        if(n<0)
        {
        	System.out.println("ERROR..... " );
        	return n;
        }
        else if((n==1)||(n==0))
         return 1;
       else
       {
       result = fact(n-1) * n;
       return result;
       }
    
}

public int fibonacci (int n)
{
        int result;
        if(n<0)
        {
        	System.out.println("ERROR..... " );
        	return n;
        }
        else if(n<=1)
         return n;
       else
       {
       result =fibonacci(n-2) + fibonacci(n-1);
       return result;
       }
    
}

}