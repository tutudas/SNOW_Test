package com.test.files;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.Map.Entry;

import org.testng.annotations.Test;

public class TotalGroceryPrice {
	
	@Test
	public void mapTest02_wordFrequency() throws FileNotFoundException {
	
		int total = 0;
		
		Map<String,Integer> priceMap = new HashMap<String, Integer>();
		String fPrice = "/Users/suparna/git/SNOW_Test/SNOWTest/data/priceList.txt";
		String fAmount = "/Users/suparna/git/SNOW_Test/SNOWTest/data/quantityList.txt";
	
	Scanner sc = new Scanner (new File(fPrice));
	
	while(sc.hasNext()) {
		
		String line = sc.nextLine().trim();
		
		String[] token = line.split(":");
		
		for (int i=0; i<token.length; i++) {
			
			priceMap.put(token[0],Integer.parseInt(token[1]) );
			
		}
	}
	
	Scanner sc1 = new Scanner (new File(fAmount));
	
	while(sc1.hasNext()) {
		
		String line = sc1.nextLine().trim();
		
		String[] token = line.split(":");
		
		String item = token[0];
		int amount = Integer.parseInt(token[1]);
		System.out.println(item +"="+amount);
			if(priceMap.containsKey(item)) {
				  total += amount*priceMap.get(item);
			}
			else {
				  System.out.println("item price NOT available");
			}
	}
	
		Set<Entry<String, Integer>> s2 = priceMap.entrySet();
		for (Entry<String, Integer> item : s2) {
		   // System.out.println(item.getKey() + "=" + item.getValue());
		}
		
		  System.out.println("map.."+priceMap); 
		  System.out.println("Total..."+total);
	} 
	

}
