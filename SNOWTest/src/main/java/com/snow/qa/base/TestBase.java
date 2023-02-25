package com.snow.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

public class TestBase {
	
	static WebDriver driver;
	static Properties prop;
	
	public TestBase(){
		try {
			prop = new Properties();
			FileInputStream fp = new FileInputStream("/Users/suparna/Desktop/eclipse/workspace/SNOWTest/src/main/java/com/snow/qa/config/config.properties");
			prop.load(fp);
		}catch (FileNotFoundException e){
			e.printStackTrace();
		}catch (IOException e){
			e.printStackTrace();
		}
		
//		private void init(){
//			String browserName = prop.getProperty("Browser");
//			if(browserName.equals("chrome")){
//				System.setProperty("WebDriver.chrome.driver", "/Users/suparna/Desktop/eclipse/workspace/SNOWTest/chromedriver");
//			}
//		}
		
	}
	

}
