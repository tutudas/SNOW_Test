package com.test.selenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

public class AirIndia {
	
	 public static void main(String[] args) {
		 System.setProperty("Webdriver.chrome.driver", "/Users/suparna/git/SNOW_Test/SNOWTest/chromedriver");
		 ChromeOptions options = new ChromeOptions();
		 options.addArguments("--remote-allow-origins=*");
		 WebDriver driver = new ChromeDriver(options);
		 
		 
	//	 WebDriver driver = new ChromeDriver();
		 
		 driver.get("https://www.airindia.com/");
		 
	//	 Set<String> s = driver.getWindowHandles();
		 
		 driver.manage().window().maximize();
		 
		 WebElement from = driver.findElement(By.xpath("//input[@id='From']"));
		 WebElement to = driver.findElement(By.xpath("//input[@id='To']"));
		 WebElement depart = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/flight-booking[1]/mat-tab-group[1]/div[1]/mat-tab-body[1]/div[1]/app-search-flight[1]/div[1]/form[1]/div[1]/app-datepicker-range-popup[1]/div[1]/div[1]/label[1]"));
		 WebElement returnField = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/flight-booking[1]/mat-tab-group[1]/div[1]/mat-tab-body[1]/div[1]/app-search-flight[1]/div[1]/form[1]/div[1]/app-datepicker-range-popup[1]/div[1]/div[3]/label[1]"));
			
		 WebElement departDate = driver.findElement(By.xpath("//mat-tab-body/div[1]/app-search-flight[1]/div[1]/form[1]/div[1]/app-datepicker-range-popup[1]/div[1]/div[1]/div[1]/div[1]/ngb-datepicker[1]/div[2]/div[1]/ngb-datepicker-month[1]/div[6]/div[4]/span[1]"));
		 
		 WebElement returnDate = driver.findElement(By.xpath("/mat-tab-body/div[1]/app-search-flight[1]/div[1]/form[1]/div[1]/app-datepicker-range-popup[1]/div[1]/div[1]/div[1]/div[1]/ngb-datepicker[1]/div[2]/div[2]/ngb-datepicker-month[1]/div[6]/div[5]/span[1]"));
		 
	
	 }
	 
 } // end class

