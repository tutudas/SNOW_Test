package com.test.examples;

import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.*;
import java.util.Set;
import java.util.TreeMap;

import com.test.exerciseTest.StringUtil;

//write a selenium program to get current url 
//active browser and right click operations

//write a java program to how many times the alphabets are repeated in the given word
//SQL - From a student table, write a query to get third highest marks
//Selenium - Reading data from input excel file


//Java Programme on Hashmap
//Selenium - How to handle the day to day scenarios like handing the exceptions. Is there any way to
//capture the screenshots automatically when exception occurs using selenium webdriver

// ans: select * from ((select * fron student ORDER BY 'mark' DESC limit 3) AS T) ORDER BY T.'mark' ASC limit 1);
// ans: select * from Student ORDER BY 'mark' DESC limit 3,1;

//----REST--- fetch data from json response 

public class Altemetrik {
	
public static void main(String[] args) throws Exception {
		
		Altemetrik obj = new Altemetrik();
		
		String input = "name2 my1 is3 suparna4";
		String word = "abcdaah";
		obj.printCharNextIntegerTimes("a1c2d3");
	//	obj.frequencyOfWord("this is a this a name");
	//	obj.isPrime(22);
		
}

/*
public void readExcel(String filepath, String sheetName) {
 	File file = new File(filepath);
	Fileinputstream inputStream = new FileInputStream(file); 
	Workbook book = null;
	book = new XSSWorkbook(inputstream);
	Sheet workSheet = book.getSheet(sheetName); 
	int rowCnt= workSheet.getLastRowNum();
	for (int i=0; i< rowCnt; i++) {
		Row row = workSheet.getRow(i);
	for(int j=0; j<row.getLastCellNum();j++) {
	}

Public class testHomePage {
@Test
public registration(){
try{
System.setproperty("webdriver.gecko.driver","c:\\geckodriver.exe"); driver = new FirefoxDriver();
driver.get("http://appurl")
// other code
}
catch (Exception ex){
} }
this.takeSnapShot(driver,"c://test.png");
public void takeSnapShot(Webdriver webdriver, String fileWithPath) {
TakeScreenshot srcshot = ((TakeScreenshot)webdriver); File sourcefile = srcshot.getScreenshotAs(fileWithPath.FILE);
File Destfile = new file(filewithPath); FileUtils.copyFile(sourcefile,Destfile);
} }

*/
	public void removeSpecialChar(String str) {
		
		String result = str.replaceAll("[-+.^:,]","");
		
		char[] str2 = result.toCharArray();
		for(int i=0; i<str2.length; i++){
			 System.out.println("Result.." +str2[i]);
			}
		}
		
		public void printStringBasedOnAttachedDigit(String str) {
		
		// input = "name2 my1 is3 suparna4"; output = my name is suparna	
			
			String[] str2 = str.split(" ");
			String[] result = new String[str2.length];
			
			
			for(int i=0; i<str2.length; i++){
				
				char ch = str2[i].charAt(str2[i].length() - 1);
				int digit = Integer.parseInt(String.valueOf(ch));
				result[digit -1] = str2[i].substring(0, str2[i].length() - 1);
				 
			}
			
			String delimiter = " ";
		    String out = String.join(delimiter, result);

			System.out.println("Result2.." +out);
		
		}
		
public void printCharNextIntegerTimes(String str) {

	// input = "a3c4f2"; output = aaa-cccc-ff
	
			String out ="";
			for(int i=0; i<str.length(); i++){
				char ch1 = str.charAt(i);
				char ch2 = str.charAt(i+1);
				int digit = Integer.parseInt(String.valueOf(ch2));
				for(int j=1; j<=digit; j++) {
					out = out+ch1;	
				}
				i++;
				if(i<str.length()-1)
				out = out+"-";	 
			}
			System.out.println("Out.." +out);
		
		}

public void frequencyOfWord(String str) {

	String[] words = str.split(" ");
//	Map<String, Integer> m = new HashMap<String, Integer>();
	Map<String, Integer> m = new TreeMap<String, Integer>();
	
	for(int i=0; i<words.length; i++){
		if(m.containsKey(words[i])) {
			m.put(words[i], m.get(words[i])+1);
		}
		else {
			m.put(words[i], 1);
		}
	}
	Set <Entry<String, Integer>> s = m.entrySet();
	for(Entry item:s) {
		System.out.println(item.getKey()+" : "+ item.getValue());
	}	
}

public void isPrime(int num) {
	
	boolean flag = true;
	for(int i=2; i<= num/2; i++) {
		//System.out.println("num..."+num);
		if(num%i == 0) {
		//	System.out.println("num/i..."+num/i);
			flag = false;
			break;
		}
		
	}
	if(flag)
	System.out.println("number: " +num+" Prime...");
	else
	System.out.println("number: " +num+" Not Prime...");
	
}

public void removeDup(String s) {
	
//	input = "suparnasaha"; output = hnpr
	char[] arr = s.toCharArray();
	
	
}
		

} // end class
