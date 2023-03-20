package com.test.map;


import java.util.HashMap;
import java.util.Map;
import java.util.Map.*;
import java.util.Set;

public class HashMapTest {

	public static void main(String[] args) {
		
		
		
		
		// TODO Auto-generated method stub

	}
	
	
	public void mapTest01_keySet() {
		
		Map<String,Integer> hmap = new HashMap<String, Integer>();
		
		hmap.put("age1", 10);
		hmap.put("age2", 20);
		hmap.put("age3", 30);
		
		Set<String> s1 = hmap.keySet();
		
		for (String item : s1) {
		    System.out.println(item);
		}
		

		Set<Entry<String, Integer>> s2 = hmap.entrySet();
		for (Entry<String, Integer> item : s2) {
		    System.out.println(item.getKey() + "=" + item.getValue());
		}
	}
	
public void mapTest02_duplicateWord() {
		
		Map<String,Integer> hmap = new HashMap<String, Integer>();
		
		hmap.put("age1", 10);
		hmap.put("age2", 20);
		hmap.put("age3", 30);
		
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
