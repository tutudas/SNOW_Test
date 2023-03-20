package com.snow.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.snow.qa.util.TestUtil;

public class TestBase {
	
	public static WebDriver driver;
	public static Properties prop;
	
	public TestBase() {
		try {
			prop = new Properties();
			FileInputStream fp = new FileInputStream("/Users/suparna/git/SNOW_Test/SNOWTest/src/main/java/com/snow/qa/config/config.properties");
			prop.load(fp);
		}catch (FileNotFoundException e){
			e.printStackTrace();
		}catch (IOException e){
			e.printStackTrace();
		}
	}
		
		public static void initialization(){
			
			String browserName = prop.getProperty("Browser");
			
			if(browserName.equals("chrome")){
		//		System.setProperty("WebDriver.chrome.driver", "/Users/suparna/Desktop/eclipse/workspace/SNOWTest/chromedriver");
				System.setProperty("WebDriver.chrome.driver", "/Users/suparna/git/SNOW_Test/SNOWTest/chromedriver");
				
				
				driver = new ChromeDriver();
			}
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
			
			driver.get(prop.getProperty("url"));
		}

	
}
