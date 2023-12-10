package com.test.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleTest {
	
	public static WebDriver driver = null;
	
	@BeforeSuite
	public void launchBrowser() {
		
	//	WebDriverManager.chromedriver().setup();
		System.setProperty("WebDriver.chrome.driver", "/Users/suparna/git/SNOW_Test/SNOWTest/chromedriver");
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
	}
	
	@Test
	public void googleTitleTest() {
		String title = driver.getTitle();
		System.out.println(title);		
	}
	
	@Test
	public void googleLogoTest() {
		boolean b = driver.findElement(By.xpath(xpathExpression)).isDisplayed();	
	}
	
	@AfterSuite
	public void closingBrowser() {

		driver.close();;
		
	}

}
