package com.test.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.Color;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogleHideDropDown {
	
	WebDriver driver;
	
	@BeforeMethod
	public void setUp() {
		String url = "https://www.google.com/";
	
		System.setProperty("WebDriver.chrome.driver", "/Users/suparna/git/SNOW_Test/SNOWTest/chromedriver");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
	//	driver.manage().timeouts().pageLoadTimeout(20, TimeLimit.SECONDS);
	//	driver.manage().timeouts().implicitlyWait(20, TimeLimit.SECONDS);

		driver.get(url);
	}
	
	@Test
	public void googleTitleTest() {
		String title = driver.getTitle();
		System.out.println(title);
	}
	
	@Test
	public void googleLogoTest() {
		boolean flag = driver.findElement(By.xpath("")).isDisplayed();
	}
	
	@Test
	public void mailLinkTest() {
		boolean b = driver.findElement(By.xpath("//a[contains(text(),'Gmail')]")).isDisplayed();
	}
		

} // end class
