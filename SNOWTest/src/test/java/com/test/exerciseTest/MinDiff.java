package com.test.exerciseTest;


public class MinDiff {
	
	public static void  main(String [] args) throws Exception {
		int [] arr= {45,987,12,3,5,6,89,78};
		MinDiff obj = new MinDiff();
		System.out.println("Index is.." +obj.getIndexMinDiff(arr));
	}
	
	
public int getIndexMinDiff(int[] arr){
		
		//If array is empty or single length, return -1 as there is nothing to compare   
		if(arr.length == 0 || arr.length == 1)
			return -1;
		int idx = 0;
		//Find the difference between first two 
		//and assume it is the minimum
		int diff = Math.abs(arr[0] - arr[1]); 
		int mindiff = diff;
		//Loop through rest of the array 
		for(int i=1; i<arr.length-1; i++){
			diff = Math.abs(arr[i]-arr[i+1]);
				//If current diff < MinDiff, reset MinDiff, idx
				if(diff < mindiff){
					mindiff = diff;
					idx = i;
		           }
		}
		return idx;
	}


}
