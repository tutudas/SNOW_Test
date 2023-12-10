package com.test.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.Map.Entry;

public class TreeMapTest {

	public static void main(String[] args) {	
		
		mapTest01_keySet();
	}
	
	public static void mapTest01_keySet() {
		
		Map<String,Integer> hmap = new TreeMap<String, Integer>();
		
		hmap.put("h", 10);
		hmap.put("e", 20);
		hmap.put("l", 30);
		hmap.put("o", 15);
		
		Set<String> s1 = hmap.keySet();
		
		for (String item : s1) {
		    System.out.println(item);
		}
		Set<Entry<String, Integer>> s2 = hmap.entrySet();
		for (Entry<String, Integer> item : s2) {
		    System.out.println(item.getKey() + "=" + item.getValue());
		}
	}
}
