package com.test.selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class amazon {

	 public static void main(String[] args) {
		 
		 // using webdrivermanager
		// WebDriverManager.chromedriver().setup();

		 	String url = "https://www.amazon.com/";
		
			System.setProperty("WebDriver.chrome.driver", "/Users/suparna/git/SNOW_Test/SNOWTest/chromedriver");
				
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--remote-allow-origins=*");
			WebDriver driver = new ChromeDriver(options);
			driver.get(url);
			
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			
			List<WebElement> l = driver.findElements(By.xpath("//a"));
			
		//	System.out.println(" all lists: "+l.toString());
			System.out.println(" all lists size : "+l.size());
			
	 }
	
}
