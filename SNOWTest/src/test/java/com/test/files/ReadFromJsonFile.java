package com.test.files;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import bsh.ParseException;

public class ReadFromJsonFile {

	public static void main(String[] args) throws ParseException, org.json.simple.parser.ParseException    
	{  
		 JSONParser parser = new JSONParser();

	        try {     
	            Object obj = parser.parse(new FileReader("c:\\file.json"));

	            JSONObject jsonObject =  (JSONObject) obj;

	            String name = (String) jsonObject.get("name");
	            System.out.println(name);

	            String city = (String) jsonObject.get("city");
	            System.out.println(city);

	            String job = (String) jsonObject.get("job");
	            System.out.println(job);

	            // loop array
	            JSONArray cars = (JSONArray) jsonObject.get("cars");
	            Iterator<String> iterator = cars.iterator();
	            while (iterator.hasNext()) {
	             System.out.println(iterator.next());
	            }
	        } catch (FileNotFoundException e) {
	            e.printStackTrace();
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    
	} // end main
	
} // end class
