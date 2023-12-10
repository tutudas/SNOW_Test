package com.test.testng.pkg1;

import org.testng.annotations.Test;

import com.test.testng.Base;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.BeforeSuite;

public class Test1 extends Base {
  @Test
  public void f() {
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("Test1 - BM...");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("Test1 - BC...");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("Test1 - BT...");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("Test1 - BS...");
  }

}
