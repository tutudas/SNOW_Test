package com.test.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.Color;

public class Gmail {
	
	public static void main(String[] args) {
		String url = "https://www.google.com/";
	
		System.setProperty("WebDriver.chrome.driver", "/Users/suparna/git/SNOW_Test/SNOWTest/chromedriver");
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);

		driver.get(url);
		WebElement e = driver.findElement(By.xpath("//span[@class=\"gb_Md\"]"));
		/*//back color: rgba(255, 255, 255, 1)
			//back color: #ffffff
			//fail 	
		String color = e.getCssValue("background-color");
		System.out.println("back color: "+color);
		String hexColor = Color.fromString(color).asHex();
		System.out.println("back color: "+hexColor);
		
		if(hexColor.equals("#fff")) {
			System.out.println("pass ");
		}
		else
			System.out.println("fail ");
			*/
		
		e.click();
	//	driver.findElement(By.xpath("//div[text()=\"Suparna Saha\"]")).click();
		
	WebElement uname =  	driver.findElement(By.xpath(" //input[@id='identifierId']"));
		 if(uname.isEnabled()){
			 uname.sendKeys("sahasuparna74@gmail.com");
		 }
		 else{
		     System.out.println("Not Enabled");
		 }
//		driver.findElement(By.xpath(" //input[@id='identifierId']")).sendKeys("sahasuparna74@gmail.com");
		driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
		driver.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys("Chakdaha!789");
		driver.findElement(By.xpath("//div[text()=\"Next\"]")).click();

	} // end main
} // end class
