package com.test.exerciseTest;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Set;

public class JavaPractise1 {
 
	ArrayList list = new ArrayList();
	public HashMap hmap = new HashMap();
	public HashMap tIDTotestCountMap = new HashMap();
	public HashMap tIDTotestTimeMap = new HashMap();
	
	public static void main(String[] args) throws Exception {
		System.out.println("Hello this is my test ...");
		
		System.out.println("sum is ..." +JavaPractise1.sum(1.2, 8.4));
		System.out.println("sum is ..." +JavaPractise1.sum(2, 8));
		
//		System.out.println("arg0= " + args[0]);
//		System.out.println("arg1= " + args[1]);

//		String fName = args[0] ; //"C:/Suparna/dataDir/output_0-0.txt";
//		System.out.println("arg0= " + fName);
//		String timeData = "C:/Suparna/dataDir/outputTime.txt";
///		String basedir = "";
		
		JavaPractise1 obj1 = new JavaPractise1();
		JavaPractise1 obj2 = new JavaPractise1();
		
		System.out.println("sum is ..." +obj1.sum(3.2, 3.4));
		System.out.println("sum is ..." +obj2.sum(3, 5));
		
		
	//	int a = obj1.sum(2, 5);
	//	System.out.println("num "+a);
		
		
		//ResourceBundle props;
		//props = ResourceBundle.getBundle("input", Locale.getDefault());
		//obj1.basedir = props.getString("input").trim();
		
		
		
		// ArrayList list = new ArrayList();
	//	 obj2.callMethodfromOtherClass();
		// obj1.callMethodfromOtherClass();
		// obj1.stringSplitTest();
		// obj1.arrayListTest();
		//obj1.HashSetTest();
		// obj1.HashMapTest();
		// obj1.readFromFile();
		// obj1.printListTest();
		// obj1.writeToFile(fName);
		 
		// obj1.printTestIDToCountHashMap();
		 // obj1.printTestIDToCountHashMap( obj1.hmap);
		 
		//obj1.printTestIDToTimeLogLinesHashMap();
		//obj1.printTestIDToTimeHashMap(timeData);
		//obj1.printTimeLineHashMap();
		
		//obj1.printMaxCharLine();

	}
	
	
	public static double sum(double x, double y) {
		double z = x +y;
		return z;	
	}
	
	public static int sum(int x, int y) {
		int z = x +y;
		return z;	
	}
	

	public void callMethodfromOtherClass() throws Exception {
		System.out.println("Test call - callMethodfromOtherClass");
		Javatest1 test2 = new Javatest1();
		int z = test2.sum(5, 7);

		System.out.println("sum of x + y =" + z); 
		System.out.println("factorial of x=" + test2.Factoril(8));

		String fName1 = "C:/Suparna/JavaTest/file1.txt";
		String fName2 = "C:\\Suparna\\JavaTest\\file2.txt";

		test2.writeToFile(fName1);
		test2.writeToFilePrintWriter(fName2);

	}

	public void stringSplitTest() throws Exception {

		System.out.println("Test call - stringSplitTest");
		String s = "Jan, Feb, Mar";

		String[] sArray = s.split(",");

		System.out.println("split Array =" + sArray);
		System.out.println("split Array size =" + sArray.length);

		for (int x = 0; x < sArray.length; x++) {
			System.out.println("split token =" + sArray[x]);

		}

	}

	public void arrayListTest() throws Exception {

		System.out.println("Test call - arrayListTest");
		ArrayList list = new ArrayList(5);
		//List list = new ArrayList(5);
		Set s = new HashSet();
		s.add("hello");
		s.add("hello2");
		s.add(5);
		s.add(23);
		
		HashMap map = new HashMap();
		System.out.println("map size =" + map.size());

		map.put("march", 1);
		map.put("Feb", 2);
		map.put("jan", 4);
		System.out.println("map size =" + map.size());
		
		System.out.println("list size =" + list.size());
		list.add(0,"jan");
		list.add(1,"Feb");
		list.add(10);
		list.add(s);
		list.add(map);
		
		

		
		System.out.println("list size =" + list.size());
		//list.add(3,"Mar");
		//list.add(5,"July");
		//list.set(6, "Dec");
		
		System.out.println("list =" + list.toString());
		System.out.println("list size =" + list.size());
		System.out.println("split token =" + list.get(1));
		System.out.println("split token =" + list.get(4).toString());
		
		for (int x = 0; x < list.size(); x++) {
			System.out.println("split token =" + list.get(x)); 

		}
		
		 System.out.print("Original contents of arrayList: ");
	      Iterator itr = list.iterator();
	     
	      while(itr.hasNext()) {
	         Object element = itr.next();
	         System.out.print(element + " ");
	      }
	      System.out.println();
	      
			 // Modify objects being iterated
		      ListIterator litr = list.listIterator();
		      while(litr.hasNext()) {
		         Object element = litr.next();
		         litr.set(element + "+");
		      }
		      System.out.print("Modified contents of al: ");
		      itr = list.iterator();
		      while(itr.hasNext()) {
		         Object element = itr.next();
		         System.out.print(element + " ");
		      }
		      System.out.println();

		      // Now, display the list backwards
		      System.out.print("Modified list backwards: ");
		      while(litr.hasPrevious()) {
		         Object element = litr.previous();
		         System.out.print(element + " ");
		       }
		       System.out.println();
		    }

	public void HashSetTest() throws Exception {

		System.out.println("Test call - HashSetTest");
		HashSet set = new HashSet();
		System.out.println("set size =" + set.size());
		set.add("jan");
		set.add("jan");
		System.out.println("set size =" + set.size());
		set.add("Feb");
		set.add("Mar");
		System.out.println("set size =" + set.size());
		System.out.println("set =" + set);

		if (set.contains("Dec")) {
			System.out.println("set contais Dec.");
		}
		System.out.println("set contais jan.? = " + set.contains("jan"));

		Object[] arry2 = set.toArray();
		for (int x = 0; x < arry2.length; x++) {
			System.out.println("set item in array2 =" + arry2[x]);

		}
		
		 System.out.println( "..............Collection Example!.............\n" ); 
	      int size;
	      HashSet collection = new HashSet ();
	      
	      size = collection.size();
	      if (collection.isEmpty()){
	         System.out.println("Collection is empty");
	      }
	      else{
	         System.out.println( "Collection size: " + size);
	      }
	      String str1 = "Yellow", str2 = "White", str3 = "Green", str4 = "Blue";  
	      Iterator iterator;
	      collection.add(str1);    
	      collection.add(str2);   
	      collection.add(str3);   
	      collection.add(str4);
	     
	      System.out.print("Collection data: ");  
	      iterator = collection.iterator();     
	      while (iterator.hasNext()){
	         System.out.print(iterator.next() + " ");  
	      }
	      System.out.println();
	      size = collection.size();
	      if (collection.isEmpty()){
	         System.out.println("Collection is empty");
	      }
	      else{
	         System.out.println( "Collection size: " + size);
	      }
	      System.out.println();
	   }
		

	public void HashMapTest() throws Exception {

		System.out.println("Test call - HashMapTest");
		HashMap map = new HashMap();
		System.out.println("map size =" + map.size());

		map.put("jan", 1);
		map.put("Feb", 2);
		map.put("jan", 4);

		System.out.println("map size =" + map.size());
		System.out.println("map =" + map);

		if (map.containsKey("Feb")) {
			System.out.println("map contais Feb.");
		}
		System.out.println("map contais jan.? = " + map.containsKey("jan"));

		Set keySet = map.keySet();
		  Object [] arry2 = keySet.toArray(); 
		  for (int x = 0; x < arry2.length;x++) 
		  { 
			  System.out.println("Key , Val  ="  + arry2[x] + " , "  +  map.get(arry2[x]) );
		  
		  }	
	}

	private void readFromFile()
	{

		String fName = "C:/Suparna/dataDir/data_0-0.log";
		
		try {
			File dataFile = new File(fName);
			String line;
			FileReader freader = new FileReader(dataFile);
			BufferedReader rdr =  new BufferedReader(freader);

			line = rdr.readLine();
			while ((line = rdr.readLine()) != null) {
				list.add(line);		
							
				this.addToTestIdToLogLinesHashMap(line);
				this.addToHashMapForCount(line);
		}

			} catch (Exception e ) {
				e.printStackTrace();
			}
		}

		public void printListTest() {

			System.out.println("Test call - printListTest");

			System.out.println("list size =" + list.size());

			for (int x = 0; x < list.size(); x++) {
				System.out.println("lines are =" + list.get(x));

			}
		}

		
		public void writeToFile(String fName) {

			try {
				FileWriter fstream = new FileWriter(fName);
				BufferedWriter out = new BufferedWriter(fstream);

				for (int i = 0; i < list.size(); i++) {
					String line = (String) list.get(i);
					out.write(line);
					out.newLine();
				}
				out.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		public void addToTestIdToLogLinesHashMap(String line) {

			String[] tokens = line.split(",");
			String testid = tokens[2].trim();
			String testTimeStr = tokens[4].trim();
			int testTime =   Integer.parseInt(testTimeStr );
			
			Object hVal = hmap.get(testid);
			if (hVal != null) { // testid exist in the hmap
				ArrayList alist = (ArrayList) hVal;
				alist.add(line);
  
			} else { // testid does not exist in hmap
				ArrayList alist = new ArrayList();
				alist.add(line);
				hmap.put(testid, alist);
				
			}
			
			Object timeList = tIDTotestTimeMap.get(testid);
			
			if (timeList != null) { // testid exist in the map
				
				ArrayList aTimeList = (ArrayList) timeList;
				aTimeList.add(testTime);
			} else { // testid does not exist in map
				ArrayList alistTime = new ArrayList();
				alistTime.add(testTime);
				tIDTotestTimeMap.put(testid, alistTime);
				
			}
			
		}
		
		public void addToHashMapForCount(String line) {

			String[] tokens = line.split(",");
			String testid = tokens[2].trim();
			Object hVal = tIDTotestCountMap.get(testid);

			if (hVal != null) { // testid exist in the hmap
				Integer intVal = (Integer) hVal;
				//alist.add(line);
				intVal ++;
				tIDTotestCountMap.put(testid, intVal);
			} else { // testid does not exist in hmap
				tIDTotestCountMap.put(testid, 1);
			     }
		}
		
		public void printTestIDToCountHashMap() {

			Set keySet = tIDTotestCountMap.keySet();
			  Object [] arry2 = keySet.toArray(); 
			  for (int x = 0; x < arry2.length;x++) 
			  { 
				  System.out.println("Key (testid);  testCoount ="  + arry2[x] + " , "  + tIDTotestCountMap.get(arry2[x]) );
			  
			  }	
		}
		
		public void  printTestIDToTimeLogLinesHashMap() {

			Set keySet = hmap.keySet();
			  Object [] arry2 = keySet.toArray(); 
			  for (int x = 0; x < arry2.length;x++) 
			  { 
				  System.out.println("Key (testid)  ="  + arry2[x]);
				  System.out.println("---------------------------------");
				  
				  ArrayList  list = (ArrayList)  hmap.get(arry2[x]);
				  for(int y =0; y < list.size(); y++) {
					  System.out.println("line = "  + list.get(y));
				  }
			  
			  }	
		}	
		
		public void  printTimeLineHashMap() {

			Set keySet = tIDTotestTimeMap.keySet();
			  Object [] arry2 = keySet.toArray(); 
			  for (int x = 0; x < arry2.length;x++) 
			  { 
				  System.out.println("Key (testid)  ="  + arry2[x]);
				  System.out.println("---------------------------------");
				  
				  ArrayList  list = (ArrayList)  tIDTotestTimeMap.get(arry2[x]);
				  for(int y =0; y < list.size(); y++) {
					  System.out.println("line = "  + list.get(y));
				  }
			  
			  }	
		}	
		
		

public void printTestIDToTimeHashMap(String timeData) {

			Set keySetTime =  tIDTotestTimeMap.keySet();
			  Object [] arryTestId = keySetTime.toArray();
			  
			  java.util.Arrays.sort(arryTestId);
	 try{
		 
		 	FileWriter fstream = new FileWriter(timeData);
			BufferedWriter out = new BufferedWriter(fstream);
			// ArrayList timeList = new ArrayList();
		 
			  int sum = 0;
			  int ave = 0;
			  int min = 0;
			  int max = 0;
			  
			System.out.println(" testId     ave	    min	    max " );
			System.out.println(" ........................................................");
		    out.write(" testId     ave	    min	    max");
		    out.newLine();
			
			 for (int x =0; x< arryTestId.length; x++){
				sum = 0; 
				 
				 ArrayList  list =  (ArrayList) tIDTotestTimeMap.get(arryTestId[x]); 
				 Object [] arryTime = list.toArray();
				 java.util.Arrays.sort(arryTime);
				// System.out.println(" testId  ave	min	max =" +arryTestId[x]);
				 
				 min = ((Integer)arryTime[0]).intValue();
				 max = ((Integer)arryTime[arryTime.length - 1]).intValue();
				 
				 for (int y =0; y< list.size(); y++){
					// System.out.println(" time =" + ((Integer)arryTime[y]).intValue());
					 sum = sum + ((Integer)arryTime[y]).intValue();
					 
				 }
				 
				// System.out.println(" testId  ave	min	max =" +arryTestId[x]);
				 
				// System.out.println(" sum = " + sum + " count =" + arryTime.length);
				 ave = sum / (arryTime.length);
				// System.out.println("\n"   +arryTestId[x] +"   " + ave	+"   "	+min + "   " +max); 
				
				 String line1 =  arryTestId[x] +"   " + ave	+"   "	+min + "   " +max;
				 System.out.println(line1);
				out.write(line1 );
				out.newLine();
			 }
			out.close();	
			  
			  }catch (Exception e ) {
				    e.printStackTrace();
			  } finally {

					//
				}	
	}  // end of method


public void printMaxCharLine(){
	
	int maxLength = 0;
	String maxCharLine="";
	String fName = "C:/work/eclipseWorkSpaceLunaJee/AdvJavaDeAnzaJan2016/data/FordZTW.txt";
	
	try {
		File dataFile = new File(fName);
		String line;
		FileReader freader = new FileReader(dataFile);
		BufferedReader rdr =  new BufferedReader(freader);

		line = rdr.readLine();
		while ((line = rdr.readLine()) != null) {
			int length = 0;
			String arr[]= line.split(" ");
			for(int x=0; x<arr.length; x++){
				length += arr[x].length();
			}
			System.out.println("length "+length);
			if(length>maxLength){
				maxLength = length;
				maxCharLine = line;
			}
		}
	}
		catch (IOException e) {

			// System.out.println("Error �� " + e.toString());
			
		}
	System.out.println("MAX CHAR LINE "+maxCharLine);	

}	//end of method	


} // end of class
		
	
