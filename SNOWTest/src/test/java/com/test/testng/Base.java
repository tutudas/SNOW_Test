package com.test.testng;

import java.io.IOException;

import org.junit.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.snow.qa.pages.LogInPage;

public class Base {
	
	@BeforeSuite
	public void test01(){
		System.out.println("Base - BeforeSuite Test01...");
	}
	
	@BeforeTest
	public void test03(){
		System.out.println("Base - BeforeTest Test02 ...");
	}
	
	@BeforeClass
	public void test02(){
		System.out.println("Base - Beforeclass Test03...");
	}
	
	@BeforeMethod
	public void test04(){
		System.out.println("Base - BeforeMethod Test04...");
	}
	
	@Test
	public void test05(){
		System.out.println("Base - Test test05 ...");
	}
	
	@AfterMethod
	public void test06(){
		System.out.println("Base - AfterMethod Test06...");
	}
	
	@AfterTest
	public void test07(){
		System.out.println("Base - AfterTest test07 ...");
	}
	
	@AfterClass
	public void test08(){
		System.out.println("Base - AfterClass Test08...");
	}
	
	@AfterSuite
	public void test09(){
		System.out.println("Base - AfterSuite Test09...");
	}
	
}
