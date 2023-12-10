package com.test.testng;

// To create customize report using TestNG

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.Assert;

import org.testng.annotations.AfterClass;

import org.testng.annotations.BeforeClass;

import org.testng.annotations.Test;

public class MySampleTest {
	WebDriver driver;

    @BeforeClass

    public void setUp() {

                    System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");

                    driver = new ChromeDriver();

                    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

                    driver.get("https://www.automationtestinginsider.com/");

                    driver.manage().window().maximize();

    }

    @AfterClass

    public void tearDown() {

                    driver.close();

                    driver.quit();

    }

    @Test(priority = 1, description = "My Sample Test Fail")

    public void testMethod1() {

                    String expectedTitle = "TestingFailed";

                    Assert.assertEquals(driver.getTitle(), expectedTitle, "Title not matched");

    }

    @Test(priority = 0, description = "My Sample Test Pass")

    public void testMethod2() {

                    boolean matchCondition = driver.getTitle().contains("ATI");

                    Assert.assertTrue(matchCondition, "Title contains the expected value");

    }

}
