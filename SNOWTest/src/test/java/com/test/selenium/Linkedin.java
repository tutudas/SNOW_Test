package com.test.selenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Linkedin {
	
	 public static void main(String[] args) {
		 System.setProperty("Webdriver.chrome.driver", "/Users/suparna/git/SNOW_Test/SNOWTest/chromedriver");
		 WebDriver driver = new ChromeDriver();
		 
		 driver.get("https://www.linkedin.com/");
		 
		 Set<String> s = driver.getWindowHandles();
		 
		 driver.manage().window().maximize();
		 
		 WebElement uname = driver.findElement(By.xpath(xpathExpression));
		 WebElement pass = driver.findElement(By.xpath(xpathExpression));
		 WebElement login = driver.findElement(By.xpath(xpathExpression));
		 
		 uname.sendKeys(keysToSend);
		 pass.sendKeys(keysToSend);
		 
		 login.click();
		 Assert.assertEquals(actual, expected);
	 }
	 
 } // end class

