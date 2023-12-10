package com.test.exerciseTest;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class calculateData {

	
	
	public HashMap tIDTotestTimeMap = new HashMap();
	String testId;
	int min;
	int max;
	float ave;
	

	
	public void settestId(String a)
	{
		testId = a;
	}
	
	
	
	public float getAve()
	{
		return ave;
		
	}
	public void readFromFile()
	{
		String fName = "C:/Suparna/dataDir/data_0-0.log";
		
		try {
			File dataFile = new File(fName);
			String line;
			FileReader freader = new FileReader(dataFile);
			BufferedReader rdr =  new BufferedReader(freader);

			line = rdr.readLine();
			while ((line = rdr.readLine()) != null) {
				this.addToTestIdToLogLinesHashMap(line);
				}
			} catch (Exception e ) {
				e.printStackTrace();
			}
		}
	
	public void addToTestIdToLogLinesHashMap(String line) {

		String[] tokens = line.split(",");
		String testid = tokens[2].trim();
		String testTimeStr = tokens[4].trim();
		int testTime =   Integer.parseInt(testTimeStr );
		
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
	
	public float calData() {

		Set keySetTime =  tIDTotestTimeMap.keySet();
		  Object [] arryTestId = keySetTime.toArray();
		  
		  java.util.Arrays.sort(arryTestId);
	 
		  int sum = 0;
		  
		
		 for (int x =0; x< arryTestId.length; x++){
			sum = 0; 
			 
			 ArrayList  list =  (ArrayList) tIDTotestTimeMap.get(arryTestId[x]); 
			 Object [] arryTime = list.toArray();
			 java.util.Arrays.sort(arryTime);
			 
			 min = ((Integer)arryTime[0]).intValue();
			 max = ((Integer)arryTime[arryTime.length - 1]).intValue();
			 
			 for (int y =0; y< list.size(); y++){
				
				 sum = sum + ((Integer)arryTime[y]).intValue();
				 
			 }
			 
			 ave = sum / (arryTime.length);
		 }
		 return ave;
}  // end of method

	
	
	public void execute()
	{
		// dataResult = this.calData(testId);
		
		ave =this.calData() ;
		
	} 	
	
	
}
