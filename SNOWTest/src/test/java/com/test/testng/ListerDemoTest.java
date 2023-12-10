package com.test.testng;

import org.testng.annotations.Test;

public class ListerDemoTest extends GoogleTest {

	@Test
	public void launchApp() {
		driver.get("https://www.amazon.com/");
	}
}
