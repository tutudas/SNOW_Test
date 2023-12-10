package com.test.examples;

import java.util.ArrayList;
import java.util.List;

public class Sum {

	static int [] arr = {2,7,11,13};
	 
	public static void main(String[] args) {
		
		matchSumIndices(arr, 9);
	}
	
	final void print() {
		System.out.println("check sum... ");
	}
	
	public static void matchSumIndices(int[] num, int target) {
		List index = new ArrayList();
		
		for(int i=0; i< num.length -1; i++) {
			if(num[i]+num[i+1] == target) {
				index.add(num[i]);
				index.add(num[i+1]);
			}
		}
		for(int j=0; j<index.size(); j++) {
			System.out.println("indices.. "+index.get(j));
		}
		System.out.println("indices.. "+index.toString()); // print using to string - [2, 7]
		
	}

}
