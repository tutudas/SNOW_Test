package com.snow.qa.test;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.snow.qa.base.TestBase;
import com.snow.qa.pages.HomePage;
import com.snow.qa.pages.LogInPage;

public class LogInPageTest extends TestBase {
	
	LogInPage logInPage;
	HomePage homepage;
//	WebDriver driver;

	public LogInPageTest() throws IOException{
		super();
	}

	@BeforeTest 
	public void setUp() throws IOException{
		initialization();
		logInPage = new LogInPage();
	}
	
	@Test(priority=1)
	public void loginTest() {
		homepage = logInPage.login(prop.getProperty("username"), prop.getProperty("password"));
	}
	
//	@Test(priority=2)
//	public void logInPageTitleTest() {
//		String title = logInPage.validateLoginPageTitle();
//		System.out.println("title..." +title);
//		Assert.assertEquals(title, "SericeNow");
//	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
