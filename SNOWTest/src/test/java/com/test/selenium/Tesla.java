package com.test.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Tesla {

	 public static void main(String[] args) {

		 	String url = "https://www.tesla.com/";
		
			System.setProperty("WebDriver.chrome.driver", "/Users/suparna/git/SNOW_Test/SNOWTest/chromedriver");
				
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--remote-allow-origins=*");
			WebDriver driver = new ChromeDriver(options);

			driver.get(url);
			
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.findElement(By.xpath("//span[contains(text(),'Account')]")).click();
			driver.findElement(By.xpath("//button[@id ='form-button-create']")).click();
			
			driver.findElement(By.xpath("//input[@id='form-input-first_name']")).sendKeys("tutu");
			driver.findElement(By.xpath("//button[@id ='form-button-create']")).click();
			driver.findElement(By.xpath("//button[@id ='form-button-create']")).click();
		
			
	 }
} // end class
