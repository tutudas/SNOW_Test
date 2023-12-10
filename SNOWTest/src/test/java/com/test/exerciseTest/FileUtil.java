package com.test.exerciseTest;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;

public class FileUtil {

	

public void writeToFile(String filename) throws Exception{

System.out.println("\nWriting to file , " + filename);
FileWriter fstream = new FileWriter(filename, true);
BufferedWriter out = new BufferedWriter(fstream);

out.write("Hello Java\n");
//out.newLine();
   
//Close the output stream
out.close();
    
}

public void writeToFilePrintWriter(String filename) throws Exception{
System.out.println("\nPrintWrite  to anoter file , " + filename);
FileWriter fstream = new FileWriter(filename, true);
PrintWriter pw = new PrintWriter(fstream);

pw.write("Hello Java");
String line = "Testing  to write this liner to file\n";
pw.println( line);

   
pw.print("\n");
//Close the output stream
pw.close();
    
}

public static ArrayList getLinesFromFile(String fileName)
{
	//String fName = "C:/Suparna/dataInput.txt";
	ArrayList list = new ArrayList();
	int length = 0;
	int maxLength = length;
	String maxCharLine="";
	
	try {
		File dataFile = new File(fileName);
		String line;
		FileReader freader = new FileReader(dataFile);
		BufferedReader rdr =  new BufferedReader(freader);
		while ((line = rdr.readLine()) != null) {
			list.add(line);	
			
			String arr[]= line.split(" ");
			for(int x=0; x<arr.length; x++){
				length += arr[x].length();
			}
				if(length>maxLength){
					maxLength = length;
					maxCharLine = line;
				}
				System.out.println("MAX CHAR LINE "+maxCharLine);	
			}
		

		} catch (Exception e ) {
			e.printStackTrace();
		}
	return list;
	
	}
public static ArrayList readFromFileToCheckAnagram(String fileName)
{
	ArrayList list = new ArrayList();
	
	try {
		File dataFile = new File(fileName);
		String line;
		FileReader freader = new FileReader(dataFile);
		BufferedReader rdr =  new BufferedReader(freader);
		while ((line = rdr.readLine()) != null) {
			list.add(line);
	
		}

		} catch (Exception e ) {
			e.printStackTrace();
		}
	return list;
	
	}


}// end of class
