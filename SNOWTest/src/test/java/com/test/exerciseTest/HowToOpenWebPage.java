package com.test.exerciseTest;

import java.io.*;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
 
import javax.net.ssl.HttpsURLConnection;

public class HowToOpenWebPage {
	
	public static void  main(String [] args) throws Exception {
			
		HowToOpenWebPage test = new HowToOpenWebPage();
		test.openWebPage();
	}
	
	public void openWebPage () throws Exception{
		long time = System.currentTimeMillis();
		String url = "https://www.google.com";
		 
		URL obj = new URL(url);
		HttpURLConnection con = (HttpURLConnection) obj.openConnection();
 
		// optional default is GET
		con.setRequestMethod("GET");
 
		//add request header
		//con.setRequestProperty("User-Agent", USER_AGENT);
 
		int responseCode = con.getResponseCode();
		System.out.println("\nSending 'GET' request to URL : " + url);
		System.out.println("Response Code : " + responseCode);
 
		BufferedReader in = new BufferedReader(
		        new InputStreamReader(con.getInputStream()));
		String inputLine;
		StringBuffer response = new StringBuffer();
 
		while ((inputLine = in.readLine()) != null) {
			response.append(inputLine);
			System.out.println("Response Code : " + inputLine);
			}
		long time2 = System.currentTimeMillis();
		System.out.println("time = " +  time);
		System.out.println("time = " + time2);
		System.out.println("time = " + (time2 - time));
	}

}// end of class
