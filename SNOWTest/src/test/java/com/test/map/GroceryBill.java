package com.test.map;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import org.testng.annotations.Test;



import java.util.Map.Entry;
import java.util.Scanner;

public class GroceryBill {

	@Test (enabled = false)
	public void readFromPriceListFile()throws IOException {
	     
		HashMap <String, Integer> priceMap = new HashMap<String, Integer>();
		
		int total = 0;
	    String fName ="/Users/suparna/git/SNOW_Test/SNOWTest/data/priceList.txt";
	     
	   //  BufferedReader reader = new BufferedReader(new FileReader(file));
	    
	    Scanner sc = new Scanner (new File(fName));
	     
	     while(sc.hasNext()) {
	    	 	String currentLine = sc.nextLine();
	    	 	String[] token = currentLine.split(":");
	    	 	priceMap.put(token[0], Integer.parseInt(token[1]));
	      }
	     
	      // print priceList file
	     Set<Entry<String, Integer>> s2 = priceMap.entrySet();
			for (Entry<String, Integer> item : s2) {
			   // System.out.println(item.getKey() + "=" + item.getValue());
			}
	    
	    String [] buyList = {"Apple:2","Orange:6","Egg:3","banana:2"};
	    		
		 for (String item : buyList) {
			 String buyItem = item.split(":")[0];
			 int quantity = Integer.parseInt(item.split(":")[1]);
			 
			if(priceMap.get(buyItem)!= null) {
				total += quantity * (int)(priceMap.get(buyItem));
				//System.out.println("Total Price.inside loop.." + total);
			}
		}
		 System.out.println("Total Price readFromPriceListFile..." + total);

	}
	
	@Test
	public void readFromBothFile()throws IOException {
	     
		HashMap <String, Integer> priceMap = new HashMap<String, Integer>();
		
		int total = 0;
		
	    String fName ="/Users/suparna/git/SNOW_Test/SNOWTest/data/priceList.txt";
	    
	    String qtyName ="/Users/suparna/git/SNOW_Test/SNOWTest/data/quantityList.txt";
	    
	    Scanner sc = new Scanner (new File(fName));
	     
	     while(sc.hasNext()) {
	    	 	String currentLine = sc.nextLine();
	    	 	String[] token = currentLine.split(":");
	    	 	priceMap.put(token[0], Integer.parseInt(token[1]));
	      }
	     
	      // print priceList file
	     Set<Entry<String, Integer>> s2 = priceMap.entrySet();
			for (Entry<String, Integer> item : s2) {
			   // System.out.println(item.getKey() + "=" + item.getValue());
			}
	    
			 Scanner sc1 = new Scanner (new File(qtyName));
		     
		     while(sc1.hasNext()) {
		    	 	String currentLine = sc1.nextLine();
		    	 	String[] token = currentLine.split(":");
		    	 	int qty = Integer.parseInt(token[1]);
		    	 	if(priceMap.get(token[0])!= null) {
				total += qty * (int)(priceMap.get(token[0]));
				//System.out.println("Total Price.inside loop.." + total);
			}
		}
		 System.out.println("Total Price readFromBothFile..." + total);

	}
}

