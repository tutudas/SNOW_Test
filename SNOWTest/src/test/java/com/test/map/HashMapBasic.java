package com.test.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.*;
import java.util.Set;

public class HashMapBasic {

	// no order / indexing
	// store as key value <k, v> pair
	// key cannot be duplicate
	// can store null values but only one null key
	
	public static void main(String[] args) {
		//printMap();
		compareHashMaps();
	}
		
	public static void printMap() {	
		
		Map <String, Integer> m = new HashMap<String, Integer>();
		m.put("India", 1);
		m.put("USA", 5);
		m.put("Africa", 3);
		m.put(null, 1);
		m.put(null, 6);
		
		System.out.println(m.get("India"));
		System.out.println(m.get(null)); // will print 6
		
		Iterator<Entry<String, Integer>> it1 = m.entrySet().iterator();
		
	//	Set <Entry<String, Integer>> it2 = m.entrySet();
		
		while(it1.hasNext()) {
			Entry<String, Integer> item = it1.next();
		//	System.out.println("key: " + item.getKey() +" "+ "value: " + item.getValue());
		}
		// using java8 lambda expression
	//	m.forEach(k, v) -> System.out.println("key: " + k +" "+ "value: " + v);
		
	}
	
public static void compareHashMaps() {	
		
		Map <String, Integer> m1 = new HashMap<String, Integer>();
		m1.put("India", 1);
		m1.put("USA", 5);
		m1.put("Africa", 3);

		
		Map <String, Integer> m2 = new HashMap<String, Integer>();
		m2.put("India", 1);
		m2.put("France", 5);
		m2.put("Aus", 3);
		
		Map <String, Integer> m3 = new HashMap<String, Integer>();
		m3.put("India", 1);
		m3.put("France", 5);
		m3.put("Aus", 3);
		m3.put("Aus", 4);
		
		System.out.println(m1.equals(m2));  // false
		System.out.println(m2.equals(m3));  //false
		System.out.println(m1.keySet().equals(m2.keySet())); //false
		System.out.println(m2.keySet().equals(m3.keySet())); //true
		
		
	}
	
	
} // end class
