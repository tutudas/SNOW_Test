package com.test.exerciseTest;

import java.util.HashMap;
import java.util.Map;

public class AddNumbers {
	
	int num1;
	int num2;
	int z;
	String url = null;
	Map hmap = null;
	
	
//	public AddNumbers () {
//		
//	}
	
	public void setNum1(int a)
	{
		num1 = a;
	}
	
	public void setNum2(int b)
	{
		num2 = b;
	}
	
	public void setHmap( HashMap <String, Integer> inputMap)
	{
		hmap = inputMap;
	}
	
	public void setUrl( String inputUrl)
	{
		 url = inputUrl;
	}
	
	public String geturl()
	{
		return url;
	}
	
	public int sumofvalues() {
		return 99;
	}
	
	public int sumofxy()
	{
		return z;
	}
	public void execute()
	{
		z = num1 + num2;
	}
	
}
