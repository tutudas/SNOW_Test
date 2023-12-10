package com.test.exerciseTest;

import java.io.BufferedReader;

public class Average {
	
	
	int sum = 0;
	int ave;
	Integer [] arrayOfNum = null;
	
	public Average(){
		
	}
	
	public void setArrayOfNum(Integer [] arrayNum)
	{
		System.out.println("array = " +arrayNum[0]);
		arrayOfNum = arrayNum;
		System.out.println("array = " +arrayOfNum[0]);
	}
	
	public int ave()
	{
		return ave;
	}
	
	public void execute()
	{
		ave = this.calAve (arrayOfNum);
	}
	
	
	public int calAve(Integer [] arrayNum)
	{
		
		//int temp;
		
		for (int i = 0; i < arrayNum.length; i++)
		{
			//String [] tokens = (arrayNum.toString()).split(",");
			//String num =  tokens[i+1].trim();
			//temp =	Integer.parseInt(num );
			sum = sum + arrayNum[i];
		}
		
		ave = sum / (arrayNum.length);
		return ave;
	}


}// end of class
