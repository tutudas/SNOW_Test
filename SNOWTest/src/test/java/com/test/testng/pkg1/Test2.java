package com.test.testng.pkg1;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.test.testng.Base;

public class Test2 extends Base {
	
	@Test
	  public void f() {
	  }
	  @BeforeMethod
	  public void beforeMethod() {
		  System.out.println("Test2 - BM...");
	  }

	  @BeforeClass
	  public void beforeClass() {
		  System.out.println("Test2 - BC...");
	  }

	  @BeforeTest
	  public void beforeTest() {
		  System.out.println("Test2 - BT...");
	  }

	  @BeforeSuite
	  public void beforeSuite() {
		  System.out.println("Test2 - BS...");
	  }


}
