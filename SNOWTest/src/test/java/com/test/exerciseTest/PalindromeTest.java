package com.test.exerciseTest;

public class PalindromeTest {
	
	String inputword ="";
	String revWord= "";
	
	public void setInputword(String input ) {
		this.inputword = input;
	}
	
	/*
	public void PalindromeTest(String "popop" ) 
	{
		this.inputword = "popop";
	}
	
	*/
	
	public void  execute( ) {
		this.revWord = "";
		char [] cArry = this.inputword.toCharArray();
		char [] cArry2 = new char [cArry.length];
		for(int i=0; i < cArry.length ; i++){
			cArry2[i] =  cArry[cArry.length -1 -i];
		}
		
		this.revWord = new String(cArry2);
	}
	
	public boolean  isPalindrome(){
	 return  this.inputword.equals(this.revWord);
	}
	

}
