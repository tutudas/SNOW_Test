package com.test.examples;

import java.util.Arrays;

public class TeslaPart2 {
	
	public static void main(String[] args)
    {
        int[] A = { 9, -3, 5, -2, -8, -6, 1, 3 };
 
    //    rearrange(A);
        alter(A);
 
        // print the rearranged array
        System.out.println(Arrays.toString(A));
    }
	
	public static int partition(int[] A){
		
        int j = 0;
        int pivot = 0;    // consider 0 as a pivot
 
        // each time we find a negative number, `j` is incremented,
        // and a negative element would be placed before the pivot
        for (int i = 0; i < A.length; i++)
        {
            if (A[i] < pivot)
            {
                // swap `A[i]` with `A[j]`
                int temp = A[i];
                A[i] = A[j];
                A[j] = temp;
 
                j++;
            }
        }
 
        // `j` holds the index of the first positive element
        return j;
    }
 
    // Function to rearrange a given array such that it contains positive
    // and negative numbers at alternate positions
    public static void rearrange(int[] A)
    {
        // partition a given array such that all positive elements move
        // to the end of the array
 
        int p = partition(A);
 
        // swap alternate negative elements from the next available positive
        // element till the end of the array is reached, or all negative or
        // positive elements are exhausted.
 
        for (int n = 0; (p < A.length && n < p); p++, n += 2)
        {
            // swap `A[n]` with `A[p]`
            int temp = A[n];
            A[n] = A[p];
            A[p] = temp;
        }
    }
    
    
    public static void alter(int[] a) {
        int pos = 0;
        int neg = 0;
        int index = 0;
        int c =0;
        while (c < a.length) {
            if (a[index] > 0) {
                pos++;
            } else neg++;
            index++;
        }

        int i = 0;
        int j = 1;
        int temp = 0;
        //run until no more positive number or negative number
        while (pos > 0 && neg > 0) {
            //
            if (a[i] > 0) {
                pos--;
                if (a[j] < 0) {
                    i += 2;
                    j += 2;
                    neg--;
                } else // a[j] > 0
                {
                    while (a[j] > 0) {
                        j++;
                    }
                    //a[j] < 0
                    neg--;
                    //move that number to the appropriate place 
                    while (j > i) {
                        temp = a[j];
                        a[j] = a[j - 1];
                        a[j - 1] = temp;
                        j--;
                    } // end while
                    i += 2;
                    j += 2;
                }
            } else // a[i] < 0
            {
                while (a[i] < 0) {
                    i++;
                }
                //a[i] > 0
                //move that number to the appropriate place 
                while (i > (j - 1)) {
                    temp = a[i];
                    a[i] = a[i - 1];
                    a[i - 1] = temp;
                    i--;
                }

            } //end else    
        }

    }

} // end class
