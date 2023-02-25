package com.snow.qa.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

public class snowTest {
	WebDriver driver;


	@BeforeMethod 
	public void setUp(){
		System.setProperty("WebDriver.chrome.driver", "/Users/suparna/Desktop/eclipse/workspace/SNOWTest/chromedriver");
		driver = new ChromeDriver();
	}

}
