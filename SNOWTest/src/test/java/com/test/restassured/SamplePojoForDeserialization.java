package com.test.restassured;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

public class SamplePojoForDeserialization {
	
	String uri="https://reqres.in";
	@Test(priority=1)
	public void testPostUsingPOJO(){

	System.out.println("******testPostUsingPOJO*********");

	SamplePojoForSerialization data = new SamplePojoForSerialization("name1","job1");
	
//	data.setJob("job1");
//	data.setName("name1");

		int id = 
		given()
			.contentType("application/json")
			.body(data)
		.when()
		  .post(uri + "/api/users")
	      .jsonPath().getInt("id");
	    
	    System.out.println("id..." +id);
	}
	
} // end class
