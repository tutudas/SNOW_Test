package com.test.selenium;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestAllureReport {
	
	@BeforeMethod
	public void test1() {
		System.out.println("....BeforeMethod....");
	}
	
	@BeforeTest
	public void test2() {
		System.out.println("....BeforeTest....");
	}
	
	@AfterMethod
	public void test3() {
		System.out.println("....AfterMethod....");
	}
	
	@AfterTest
	public void test4() {
		System.out.println("....AfterTest....");
	}
	
	@Test
	public void test5() {
		System.out.println("....Test....");
	}

}
