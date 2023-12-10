package com.test.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class seleniumTest {

	 public static void main(String[] args) {
		 
		 // using webdrivermanager
		// WebDriverManager.chromedriver().setup();
		 
		 	
		// 	String url = "https://www.yahoo.com/";
		 	String url = "https://www.google.com/";
		
			System.setProperty("WebDriver.chrome.driver", "/Users/suparna/git/SNOW_Test/SNOWTest/chromedriver");
				
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--remote-allow-origins=*");
			WebDriver driver = new ChromeDriver(options);
			
			//WebDriver driver = new ChromeDriver();
		//	driver.get("https://www.yahoo.com/");
			driver.get(url);
			
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			
//		WebElement news= driver.findElement(By.xpath("//a[@id='root_2']"));
//				news.click();
			
			driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys("orange");
			driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys(Keys.RETURN);

				

			
			System.out.println("here...");
			
		//	WebElement m = driver.findElement(By.cssSelector("input[type='button'][value='span-dps-button-label']"));
					
	//		WebElement m = driver.findElement(By.xpath("//div/header/dps-navigation-header//header/div/div[2]/ul/li[2]/dps-login//div/dps-button//button/span"));
			
//			WebElement m = driver.findElement(By.cssSelector("#root_1"));
//			m.click();
//			
//			WebElement uName = driver.findElement(By.cssSelector("#login-username"));
//			uName.sendKeys("shahsuparna@yahoo.com");
//			
//			WebElement next = driver.findElement(By.cssSelector("#login-signin"));
//			next.click();
//			
//			WebElement pwd = driver.findElement(By.cssSelector("#login-passwd"));
//			pwd.sendKeys("basantakumari");
//			
//			WebElement nextBtn = driver.findElement(By.cssSelector("#login-signin"));
//			nextBtn.click();
			
			
//			WebElement uName = driver.findElement(By.xpath("//*[@id=\"sign_in_username\"]"));
//			uName.sendKeys(username);
//			
//			
//			actualTitle = driver.getTitle();
//			System.out.println("actualTitle..."+actualTitle);
//			
//			WebElement nextBtn = driver.findElement(By.xpath("//*[@id=\"sign_in_username_btn\"]"));
//			nextBtn.click();
//			
//			WebElement pwd = driver.findElement(By.xpath("//*[@id=\"sign_in_password\"]"));
//			pwd.sendKeys(password);
//			
//			WebElement signBtn = driver.findElement(By.xpath("//*[@id=\"sign_in_password_btn\"]"));
//			signBtn.click();
			
			
			WebElement actualTitle = driver.findElement(By.xpath("//a[@id='uh-logo']"));
			
//			
//			if(actualTitle.contentEquals(expectedTitle)){
//	            System.out.println("Test Passed!");
//	        } else {
//	            System.out.println("Test Failed");
//	        }
//			
//			WebElement startBtn = driver.findElement(By.xpath("/html/body/dps-app//div/main/dps-home-auth-quebec//div/section[1]/div/dps-page-header/div[1]/button/span"));
//			startBtn.click();
			
			//driver.quit();
	 }
	
}
