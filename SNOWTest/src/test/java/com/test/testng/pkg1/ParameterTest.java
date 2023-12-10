package com.test.testng.pkg1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class ParameterTest {

	WebDriver driver;
	
	@Test 
	@Parameters({"url", "emailId"})
	public void googleLoginTest(String url, String emailId) {
		
		System.setProperty("WebDriver.chrome.driver", "/Users/suparna/git/SNOW_Test/SNOWTest/chromedriver");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		
	//	driver = new ChromeDriver();
		
		driver.get(url);
	//	driver.findElement(By.xpath("//a[contains(text(),'Sign in')]")).click();
	}
}
