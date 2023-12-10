package com.test.restassured;

import org.testng.annotations.DataProvider;

public class RestWithDataProvider {
	
	@DataProvider(name="seasonsAndNumberOfRaces")
	public Object[][] createTestDataRecords() {
	    return new Object[][] {
	   	 {"name", "tmp data"},
	   	 {"2016",21},
	   	 {"1966",9}
	    };
	}


}
