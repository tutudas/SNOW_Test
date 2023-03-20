package com.snow.qa.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class seleniumTest {

	 public static void main(String[] args) {
		 
		 // using webdrivermanager
		// WebDriverManager.chromedriver().setup();
	
		// 	String url = "https://developer.servicenow.com/dev.do#!/home?wu=true";
		 String url = "https://signon.service-now.com/x_snc_sso_auth.do";
		 	
		 //	String url = "https://www.yahoo.com/";
		// 	String expectedTitle = "https://signon.service-now.com/x_snc_sso_auth.do";
		 	
		 //	String expectedTitle = "https://mail.yahoo.com/d/folders/1?pspid=2023538075&activity=ybar-mail&guce_referrer=aHR0cHM6Ly9sb2dpbi55YWhvby5jb20v&guce_referrer_sig=AQAAAMKjls62_ygK4o38ZFTdXJsJIsKfb03L6N86svskBYVO91vALzcE4FAqf54ahQtt0KFblqUVTW7jshLqVbsWOVbDVaTnIxGpBIk820jzLXfi-Ug2EwjvqwmLGrKUUFITzJ2x8CWyjNofxigMib7GKre3lCqJpoCGtuAns6hISM1B";
		 	String expectedTitle = "ServiceNow";
		 	
		 	String actualTitle = "";
			String username = "shahsuparna@yahoo.com";
			String password = "Sushant!123";
		 
			System.setProperty("WebDriver.chrome.driver", "/Users/suparna/git/SNOW_Test/SNOWTest/chromedriver");
			WebDriver driver = new ChromeDriver();
			driver.get(url);
			
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			
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
			
			
			WebElement uName = driver.findElement(By.xpath("//*[@id=\"sign_in_username\"]"));
			uName.sendKeys(username);
			
			
			actualTitle = driver.getTitle();
			System.out.println("actualTitle..."+actualTitle);
			
			WebElement nextBtn = driver.findElement(By.xpath("//*[@id=\"sign_in_username_btn\"]"));
			nextBtn.click();
			
			WebElement pwd = driver.findElement(By.xpath("//*[@id=\"sign_in_password\"]"));
			pwd.sendKeys(password);
			
			WebElement signBtn = driver.findElement(By.xpath("//*[@id=\"sign_in_password_btn\"]"));
			signBtn.click();
			
			if(actualTitle.contentEquals(expectedTitle)){
	            System.out.println("Test Passed!");
	        } else {
	            System.out.println("Test Failed");
	        }
			
			WebElement startBtn = driver.findElement(By.xpath("/html/body/dps-app//div/main/dps-home-auth-quebec//div/section[1]/div/dps-page-header/div[1]/button/span"));
			startBtn.click();
			
			driver.quit();
	 }
	
}
