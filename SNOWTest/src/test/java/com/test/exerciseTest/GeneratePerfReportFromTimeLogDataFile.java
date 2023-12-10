package com.test.exerciseTest;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.ResourceBundle;

import java.util.Locale;


public class GeneratePerfReportFromTimeLogDataFile {


	public BufferedWriter _out = null;
	public int totalTest =0;
	public int totalFail =0;

	public ArrayList [] arrayOfList = new ArrayList[1001];
	

	
	 // basedir - is the grinder time log dir, time log file(s) , combined out put file & result file will gererated 
	// in this dir
	 public String basedir = "";
	 
	 // time log file name(s)
	 public  String [] datafiles =null;
	// public  String [] datafiles = { "data_1-0.log",  "data_2-0.log",  "data_4-0.log"   };
	 

	public static void main(String[] argv) {

		if(argv!=null && argv.length==1) { System.out.println(argv.length); }

		GeneratePerfReportFromTimeLogDataFile test = null;
		PrintUtil pObj = new PrintUtil();

		try {
			
			test = new GeneratePerfReportFromTimeLogDataFile();
			
			ResourceBundle props;
	        props = ResourceBundle.getBundle("testproperty", Locale.getDefault());
	        // test.basedir ="C:/Suparna/dataDir/";
	        test.basedir = props.getString("testproperty.ipaperformancetest.timelogdir").trim();
	        
	         
	        pObj.pLine("base dir = " + test.basedir);
	        
	        String logfilenames = props.getString("testproperty.ipaperformancetest.timelogfiles").trim();
	        pObj.pLine("log files name = " + logfilenames);
	        
	        
	        test.datafiles = logfilenames.split(",");
	      
	        
		//	String outFile = "R:/IPA/Performance/GrinderTool/testlogs/timelog/combinedata.csv";
	      
	        String outFile =   test.basedir + "combinedata.csv";
	        
			FileWriter fw = new FileWriter(outFile);
			if (fw ==null) System.out.println(" --------- null---");
			test._out = new BufferedWriter(fw);

			String line = "HostID, ThreadID, RunID, TestID, MillisecSinceStart, TestTime, Errors";
			test._out.write(line);
			test._out.newLine();

			//Set expSet = new HashSet();

			for(int i=0; i < 1001 ; i++)
				test.arrayOfList[i] = new ArrayList();

			for(int i=0; i < test.datafiles.length; i++){
			test.combineDataFromFile(i);
			System.out.println("Total Test with time (> 100 msec):= " + test.totalTest);
		    System.out.println("Total no of Test with response time(<100msec):="+ test.totalFail);
		    System.out.println(" ---------- ----------------- ----------");
		   // do the report after combining all the data files
		   // test.genrateReport();
			}
			System.out.println("Total Test with time (> 100 msec):=" + test.totalTest);
		    System.out.println("Total no of Test with response time(<100msec):=" + test.totalFail);
			System.out.println(" ---------- REPORT ----------");
			 test.genrateReport();

			//expSet.clear();
			//expSet.add("dummy function protein");


			test._out.close();

		} catch(Exception e) {
			e.printStackTrace();
			//test._out.close();
		} finally {

			//
		}


	}// end main



// read time log lines from ith  time data-log file and append the line into combine data file
// also add the test time for each log line into the testIDArray-for-time
 public void combineDataFromFile(int fileIndex)
	    {

	 	  String fName = basedir + datafiles[fileIndex].trim();
	 	  
	
	 	  int testFail =0;
	       try {
	       File dataFile = new File(fName);
	       BufferedReader rdr = null;
	       String line;
	     
	       rdr = new BufferedReader(new FileReader(dataFile));
	      
	       String[] tokens = null;

           int count =0;
           int time =0;
           int testid =0;
           int testidIdx =0;
           line = rdr.readLine();
	       while ((line = rdr.readLine()) != null) {
	      // line = line.trim();
	       if( line.length() == 0) continue;
	       if(line.charAt(0) == '#') continue;

	       tokens = line.split(",");
	      
	       time = Integer.parseInt(tokens[4].trim());
	       
	    // If test time < 10 msec  then consider test case as failed
	       if (time <10){
	   //     System.out.println(line)	;
	    	   testFail++;
	    	   continue;
	       }
	       testid =0;
	       testidIdx =0;
	       testid = Integer.parseInt(tokens[2].trim());
	       testidIdx = testid - 100;
	       line = " " + fileIndex +", " + line;
	       count++;
           Out(line);

	       if(testidIdx < 1){
	       	System.out.println( "ERROR: Invalid testID >> " + line);
	       }
	       else{
	       	if (arrayOfList[testidIdx] == null)System.out.println("index = " + testidIdx + " null list--------");
	       	arrayOfList[testidIdx].add(new Integer(time));
	       }

	       }
	       System.out.println("Processed timelog file: " + datafiles[fileIndex] + "\n  No of Test with time(>100msec):= " + count);
	       System.out.println("  No of Test with response time(<100msec):= " + testFail);
	       totalTest = totalTest + count;
	       totalFail = totalFail + testFail;
	       } catch (Exception e ) {
	            e.printStackTrace();
	       }
	    }

public void genrateReport(){
//	String reportFile = "R:/IPA/Performance/GrinderTool/testlogs/report.csv";
	String reportFile = basedir  + "report.csv";
	FileWriter fw = null;
	BufferedWriter out = null;
	String line = "TestID, SIZE, MidInx, Median, AVE, MIN, MAX";
	try {
	fw = new FileWriter(reportFile);
	if (fw ==null) System.out.println("File wrire is NULL --------- null---");
	out = new BufferedWriter(fw);

	out.write(line);
	out.newLine();
	int testid = 0;
	int size =0;
	int mid =0;
	int median =0;
	int min =0;
	int max =0;
	int ave =0;
	for(int i=1; i< 1001; i++){
		ave =0;
		testid = i+ 100;
	//	System.out.println("------ array i =" +i);
		Object [] arr = arrayOfList[i].toArray();
		java.util.Arrays.sort(arr);
		size = arr.length;
		// if size == 0 => test did not run for that testid
		if(size == 0)continue;
		mid = size /2;


		System.out.println("TestID= " + testid + " No of valid test-run(size)= " + size + "   mid  =" + mid);

		// saaume is array size is >= 1
		// when size is even, two middle inxed are mid-1 & mid
		if ((size % 2 == 0) && (mid >0) ){
			// note mid index is mid -1
			median = ((Integer)arr[mid-1]).intValue() + ((Integer)arr[mid]).intValue();
			median = median/ 2;
		}
		else
			// when size is odd then middle index is mid
			median = ((Integer)arr[mid]).intValue();

		min = ((Integer)arr[0]).intValue();
		max = ((Integer)arr[size -1]).intValue();
		for(int j=0; j < size ; j++)
			ave = ave + ((Integer)arr[j]).intValue();
		// assume size > 0
		ave = ave / size;
		line = " " + testid  + ",  " + size + ",  " + mid + ",  " + median + ",  " + ave + ",  " + min + ",  " + max;
		out.write(line );
	    out.newLine();
	}

	out.close();
} catch (Exception e ) {
    e.printStackTrace();
}

}



public void Out(String line){
	try {
        _out.write(line );
        _out.newLine();
    } catch (IOException e) {
    	e.printStackTrace();
    }
}


} // end 

