package com.test.testng;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AnnotationTest2 extends Base{
	
	@BeforeClass
	public void test04(){
		System.out.println("Annotation2 beforeclass Test04...");
	}


	@Test
	public void test06(){
		System.out.println("Annotation2 @Test06 ...");
	}

}