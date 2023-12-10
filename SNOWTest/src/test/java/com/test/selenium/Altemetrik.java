package com.test.selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

// write a selenium program to get current url 
//active browser and right click operations
public class Altemetrik {
 public static void main(String[] args) throws InterruptedException {
		 
		 // using webdrivermanager
	//	 WebDriverManager.chromedriver().setup();

		 	String url = "https://www.makemytrip.com/";
		 	String month = "August 2023";
		 	String day = "21";
		
			System.setProperty("WebDriver.chrome.driver", "/Users/suparna/git/SNOW_Test/SNOWTest/chromedriver");
				
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--remote-allow-origins=*");
			WebDriver driver = new ChromeDriver(options);
	//		WebDriver driver = new ChromeDriver();
			driver.get(url);
			
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			
			driver.findElement(By.xpath("//div[@class=\"makeFlex hrtlCenter\"]//li[1]")).click();
			
			driver.findElement(By.id("fromCity")).sendKeys("SFO");
			driver.findElement(By.id("toCity")).sendKeys("Delhi");
			
			// how to select date from calendar
			
			driver.findElement(By.xpath("//span[contains(text(),\"Departure\")]")).click();
			Thread.sleep(2000);
			
			while(true) {
			String text = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]")).getText();
			if(text.equals(month) ) {
				break;
				}
			else {
				driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/span[2]")).click();
				}
			}
			List<WebElement> allDates = driver.findElements(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[3]/div/div"));
	//		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[3]/div[2]/div[2]")).click(); // working for random date selection

			for(WebElement e: allDates) {
				System.out.println(e.getText());
				String dates = e.getText();
				
				if(dates.equals(day)) {
					e.click();
					break;
				}
				
//				String date[] = dates.split("\n");
//				if(date[1].equals(day)) {
//					e.click();
//					break;
//				}
			}
			
			driver.findElement(By.xpath("//p/a[text()=\"Search\"]")).click();
			
	 }

}
