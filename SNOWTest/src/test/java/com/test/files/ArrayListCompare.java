package com.test.files;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayListCompare {

	public static void main(String[] args) {
		
	//	removeDuplicate();
	//	sortAndCompare();
	//	findAdditionalElement();
		findCommonElement();
	}
	
	// JDK 8 - stream
	public static void removeDuplicate() {
		ArrayList <Integer> arr = new ArrayList<Integer> (Arrays.asList(1,2,3,3,4,2,1,5));
		List <Integer>  result = arr.stream().distinct().collect(Collectors.toList());
		System.out.println(result);
	}
	
	public static void sortAndCompare() {
		ArrayList <Integer> arr1 = new ArrayList<Integer> (Arrays.asList(9,3,7,4));
		ArrayList <Integer> arr2 = new ArrayList<Integer> (Arrays.asList(7,2,3,5,1));
		
		Collections.sort(arr1);
		Collections.sort(arr2);
		System.out.println(arr1.equals(arr2));
	}
	
	public static void findAdditionalElement() {
		ArrayList <Integer> l1 = new ArrayList<Integer> (Arrays.asList(9,3,7,4));
		ArrayList <Integer> l2 = new ArrayList<Integer> (Arrays.asList(7,2,3,4));
		
	//	l1.removeAll(l2);
		l2.removeAll(l1);
	//	System.out.println("additional in l1: "+l1);
		System.out.println("additional in l2: "+l2);
	}
	
	public static void findCommonElement() {
		ArrayList <String>  l1 = new ArrayList<String> (Arrays.asList("java","python","Ruby"));
		ArrayList <String>  l2 = new ArrayList<String> (Arrays.asList("java","python","C"));

		l2.retainAll(l1);
		System.out.println("common: "+l2);
	}
	
	
}
