package com.test.testng;


import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class AnnotationTest1 extends Base{
	
	@BeforeClass
	public void test03(){
		System.out.println("Annotation1 beforeclass Test03...");
	}

	@Test
	public void test05(){
		System.out.println("Annotation1 @Test05...");
	}

}
