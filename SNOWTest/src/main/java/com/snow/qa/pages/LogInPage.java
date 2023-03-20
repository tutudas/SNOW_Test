package com.snow.qa.pages;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.snow.qa.base.TestBase;

public class LogInPage extends TestBase {
	WebDriver driver;
	
//	@FindBy(xpath = "//*[@id=\"sign_in_username\"]")
	
	@FindBy(name = "email")
	WebElement username;
	
	@FindBy(xpath = "//*[@id=\"sign_in_password\"]")
	WebElement password;
	
	@FindBy(xpath = "//*[@id=\"sign_in_username_btn\"]")
	WebElement nextBtn;
	
	@FindBy(xpath = "//*[@id=\"sign_in_password_btn\"]")
	WebElement signInBtn;
	
//	@FindBy(id = "Start Building [dev135924]")
//	WebElement startBuildingBtn;
	
	
	public LogInPage() {
		PageFactory.initElements(driver, this);
	}
	
	public String validateLoginPageTitle() {
		return driver.getTitle();
	}
	
	public HomePage login(String un, String pwd) {
		
		username.sendKeys(un);
		nextBtn.click();
		password.sendKeys(pwd);
		signInBtn.click();
		
		return new HomePage();
	}
	

}
