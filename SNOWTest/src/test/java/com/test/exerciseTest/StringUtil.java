package com.test.exerciseTest;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import java.util.Arrays;


public class StringUtil {
	
	String inputword ="";
	String revword ="";
	
	public static void main(String[] args) throws Exception {
		
		StringUtil obj = new StringUtil();
		String fName = "C:/Suparna/dataInput.txt";
		String fName2 = "C:/Suparna/dataForAnagram.txt";
		
		String input = "name2 my1 is3 suparna4";
		String word = "abcdaah";
		
		//obj.wordCountFromFile(fName);
	//	obj.findPalindromeWordsFromFile(fName);
		//obj.isWordAnagram(fName2);
		
	//	obj.removeSpecialChar("abc-def");
	//	obj.printStringBasedOnAttachedDigit(input);
		
	//	obj.findStringMatch("hello");
	//	obj.findDuplicateChar(word);
	//	obj.findDuplicateCharUsingHashMap(word);
		
		obj.printCharWithCount("aaabb");
//		
//		String s1 = "abc";
//		String s2 = new String(s1);
//		StringBuffer s3 = new StringBuffer(s1);
//		
//		String s4 = new String("s4");
//		String s5 = new String("s5");
//		
//		System.out.println("compare two strings by value..."+s1.equals(s2)); //output - true
//		System.out.println("compare string with stringBuffer by value..."+s1.equals(s3)); //output - false
//		System.out.println(s4=s5); //output - s5
		
	}
	
	public void findPalindromeWordsFromFile(String fileName) {
		
		ArrayList pList = new ArrayList();
		ArrayList aList = FileUtil.getLinesFromFile(fileName);
		int count = 0;
	//	boolean token = false;
		
			for(int i=0; i<aList.size() ; i++){
				
				String line = (String)aList.get(i);
				String [] wordArr = line.split(" ");
				
				for(int k =0; k< wordArr.length; k++) {
				inputword = wordArr[k];
				 System.out.println("input word =" +inputword);
				boolean token = this.isPalindrome(inputword);
				 System.out.println("token =" +token);
				
				if(token== true)
				{
				pList.add(inputword);
				count++;
				}
				
			}//inner for loop		
				
			}
			 System.out.println("pallindrome words count.." +count);
			 for(int x =0; x< pList.size(); x++) 
			System.out.println("pallindrome words are  =" +pList.get(x));
	}
	
public void wordCountFromFile(String fileName) {
	
		ArrayList aList = FileUtil.getLinesFromFile(fileName);
		HashMap wordCounthmap = new HashMap();
		
			for(int i=0; i<aList.size(); i++){
				
				String line = (String)aList.get(i);
				String [] word = line.split(" ");
				for(int k =0; k< word.length; k++) {
					
				inputword = word[k];
				if (wordCounthmap.get(inputword) != null) { 
					// word exist in the hashmap
					Integer count =  (Integer) wordCounthmap.get(inputword);
					 count++;
					wordCounthmap.put(inputword, count);
					
				} else {
					// word does not exist in hashmap
					wordCounthmap.put(inputword, new Integer(1));
				}	
				
				}  // innner for loop
				
			}//end for loop
			
			Set keySet = wordCounthmap.keySet();
			  Object [] arryWord = keySet.toArray(); 
			  System.out.println("\n Word;  Coount summary ....");
			  for (int x = 0; x < arryWord.length;x++) 
			  { 
				  System.out.println("" + arryWord[x] + "   =  "  + wordCounthmap.get(arryWord[x]) );
			  
			  }	
	}

public boolean isPalindrome(String word) {
	
			inputword = word;
			
			char [] cArry = this.inputword.toCharArray();
			char [] cArry2 = new char [cArry.length];
			for(int j=0; j< cArry.length ; j++){
				cArry2[j] =  cArry[cArry.length -1 -j];
			}
			
			this.revword = new String(cArry2);
			return  this.inputword.equals(this.revword);
			
		}


public void isWordAnagram(String fileName) {
	
	ArrayList aList = FileUtil.readFromFileToCheckAnagram(fileName);
	ArrayList anagramList = new ArrayList();
	int count = 0;
	System.out.println("arrayList size.." +aList.size());
		
	for(int i=0; i<aList.size() - 1 ; i=i+2){
			
			//System.out.println("arrayList size.." +aList.size());
			
			String line1 = (String)aList.get(i);
			String input1= line1.replaceAll(" ", "").toLowerCase();
			char cArr1[]  = input1.toCharArray();
			Arrays.sort(cArr1);
			String arry1 = new String (cArr1);
			 System.out.println("input1 .." +arry1);
			 
			String line2 = (String)aList.get(i+1);
			// System.out.println("line2.." +line2);
			String input2= line2.replaceAll(" ", "").toLowerCase();
			char cArr2[]  = input2.toCharArray();
			Arrays.sort(cArr2);
			String arry2 = new String (cArr2);
			 System.out.println("input2.." +arry2);
			 System.out.println("......................");
			if(arry1.equals(arry2))
			{
			anagramList.add(input1);
			count++;
			}
		
		}//inner for loop		
	
		 System.out.println("anagram words count.." +count);
		 for(int x =0; x< anagramList.size(); x++) {
		System.out.println("anagram words are  =" +anagramList.get(x));
		 }	
	}

public void removeSpecialChar(String str) {
	
	String result = str.replaceAll("[-+.^:,]","");
	
	char[] str2 = result.toCharArray();
	for(int i=0; i<str2.length; i++){
		 System.out.println("Result.." +str2[i]);
		}
	}
	
	public void printStringBasedOnAttachedDigit(String str) {
		
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
	
public void findStringMatch(String query) {
	
	String str = "nnnhjjkhellojkkkkhelloyuu";
	ArrayList fIndex = new ArrayList();
	
	if(str.length()<query.length()) {
		System.out.println("...NOT found..");
	}
	
	int index = str.length()-1 -query.length();
	
	for(int i=0; i<index; i++) {
		if(query.equals(str.substring(i, i+query.length()))) {
			//System.out.println("...substring.."+str.substring(i, i+query.length()));
			
			System.out.println("...FOUND..");
			fIndex.add(i);
		}
//		else {
//			System.out.println("...NOT found..");
//		}
	}
	
	System.out.println("Index..."+fIndex.toString());

}

public void findDuplicateChar(String word) {
	
	ArrayList dupArr = new ArrayList();
	
	for(int i=0; i< word.length() ; i++){
		for(int j=i+1; j< word.length() ; j++){
			if(Character.compare(word.charAt(i), word.charAt(j)) == 0) {
				System.out.println("...found duplicate char.."+word.charAt(i));
				dupArr.add(word.charAt(i));
			}
		}
	}

		System.out.println("..duplicate char.."+dupArr);
	
}

public void findDuplicateCharUsingHashMap(String word) {
	
	HashMap hmap = new HashMap();
	
	for(int i=0; i< word.length() ; i++){
		if(hmap.containsKey(word.charAt(i))) {
		//	System.out.println("..item exists.."+word.charAt(i));
			int count = (int)(hmap.get(word.charAt(i)));
			hmap.put(word.charAt(i),++count );
		//	System.out.println("..count.."+count);
		}
		else {
			//	System.out.println("..item NOT exists.."+word.charAt(i));
				hmap.put(word.charAt(i),1);
			}
		}
	
	Set<Entry<Integer, Integer>> s2 = hmap.entrySet();
	for (Entry<Integer, Integer> item : s2) {
		if(item.getValue()>1) {
				System.out.println(item.getKey() + "=" + item.getValue());
			}
		}
	
	}

public void printCharWithCount(String word) {
		
		Map <String ,Integer> m = new HashMap <String ,Integer>();
		int count = 0;
		
		for(int i=0; i<word.length(); i++) {
			if(m.containsKey(Character.toString(word.charAt(i)))) {
				m.put(Character.toString(word.charAt(i)), ++count);
			}
			else {
				m.put(Character.toString(word.charAt(i)), 1);
			}
		}
		
		System.out.println(m.toString());
	}
						
}// end class
