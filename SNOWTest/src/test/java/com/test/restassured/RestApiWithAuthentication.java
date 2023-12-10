package com.test.restassured;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

public class RestApiWithAuthentication {
	
	 String baseUri ="https://gorest.co.in/";
	 String basePath = "public/v2/users/";
	 String authToken = "Bearer 2f9fe2ef50481dd3d36dd525c26fb3ca31e713fb2f0612beeb508c77a8f9fee5";
	 String bearerToken = "2f9fe2ef50481dd3d36dd525c26fb3ca31e713fb2f0612beeb508c77a8f9fee5";
	 int id;

	 
	@Test (enabled = false) //pass

	void test_01getData(){
		given()
		.headers("Bearer","2f9fe2ef50481dd3d36dd525c26fb3ca31e713fb2f0612beeb508c77a8f9fee5")
		.when()
		.get(baseUri + basePath)
		.then()
		.assertThat()
		 .statusCode(200)
		 .log().all(); ;
	}
	
	@Test (enabled = false) // pass

	void testBearerTokenAuthentication(){
		System.out.println("******testBearerTokenAuthentication()*********");	
		
		// request payload
	    JSONObject jsonData = new JSONObject();
	    jsonData.put("name", "first last");
	    jsonData.put("gender", "Male");
	    jsonData.put("email", "first.last@gmail.com");
	    jsonData.put("status", "active");

	   
	    given()
	    .headers("Authorization", authToken)
	 //   .headers("Authorization", "Bearer "+bearerToken)
	    .contentType("application/json")
	     .body(jsonData.toString())
	      .when()
	      .post(baseUri + basePath)
	      .then()
	      .assertThat()
	      .statusCode(201)
	      .log().all(); 
	    	}
	
	
	@Test (enabled = false)

	void test_03createDataAndReturnId(){
		System.out.println("******test_03createDataAndReturnId()*********");	
		
		// request payload
	    JSONObject jsonData = new JSONObject();
	    jsonData.put("name", "tmp data");
	    jsonData.put("gender", "Female");
	    jsonData.put("email", "tmp.data@gmail.com");
	    jsonData.put("status", "Inactive");

	   
	   id =  given()
	    .headers("Authorization", authToken)
	    .contentType("application/json")
	     .body(jsonData.toString())
	      .when()
	      .post(baseUri + basePath)
	      .jsonPath()
	      .getInt("id");
		System.out.println("data created for id: " +id);
	      
	    	}
	
	
	@Test (enabled = false)

	void test_04updateDataForId(){
		System.out.println("******test_04updateDataForId()*********");	
		
		// request payload
	    JSONObject jsonData = new JSONObject();
	 //   jsonData.put("name", "first last");
	    jsonData.put("gender", "Male");
	 //   jsonData.put("email", "first.last@gmail.com");
	    jsonData.put("status", "active");

	   
	    given()
	    .headers("Authorization", authToken)
	    .contentType("application/json")
	     .body(jsonData.toString())
	      .when()
	      .put(baseUri + basePath + id)
	      .then()
	      .assertThat()
	      .statusCode(200)
	      .log().all();
	    
	    System.out.println("data updated for id" +id);
	      
	    	}
// check updated data
	
	@Test (enabled = false) //pass

	void test_05getDataAfterUpdate(){
		
		System.out.println("data created for id: " +id);
		given()
		.headers("Authorization", authToken)
		.get(baseUri + basePath +id)
		.then()
		.assertThat()
		 .statusCode(200)
		 .log().all(); ;
	}
	
	@Test (enabled = false) //pass

	void testBasicAuthetication(){
		
		System.out.println("testBasicAuthetication... ");
		given()
		.auth().basic("postman","password")
		.when()
		.get("https://echo.getpostman.com/basic-auth")
		.then()
		.assertThat()
		 .statusCode(200)
		// .body("authenticated", equalTo(true))
		 .log().all();
	}
	
	@Test (enabled = true) //pass

	void testDigestAuthetication(){
		
		System.out.println("testDigestAuthetication... ");
		given()
		.auth().digest("postman","password")
		.when()
		.get("https://echo.getpostman.com/basic-auth")
		.then()
		.assertThat()
		 .statusCode(200)
		// .body("authenticated", equalTo(true))
		 .log().all();
	}
	
	@Test (enabled = true) //pass

	void testPreemptiveAuthetication(){
		
		System.out.println("testPreemptiveAuthetication... ");
		given()
		.auth().preemptive().basic("postman","password")
		.when()
		.get("https://echo.getpostman.com/basic-auth")
		.then()
		.assertThat()
		 .statusCode(200)
		// .body("authenticated", equalTo(true))
		 .log().all();
	}
	
	@Test (enabled = false) //pass

	void testOAuth1Authetication(){
		
		System.out.println("testOAuth1Authetication... ");
		given()
			.auth().oauth("consumeKey","consumerSecret","accessToken","tokenSecret")
		.when()
			.get("https://echo.getpostman.com/basic-auth")
		.then()
			.assertThat()
			.statusCode(200)
			// .body("authenticated", equalTo(true))
			.log().all();
	}
	
	@Test (enabled = false) //pass

	void testOAuth2Authetication(){
		
		System.out.println("testOAuth2Authetication... ");
		given()
			.auth().oauth2("ghp_")
		.when()
			.get("https://api.github.com/user/repos")
		.then()
			.assertThat()
			.statusCode(200)
			// .body("authenticated", equalTo(true))
			.log().all();
	}
	
	@Test (enabled = false) //pass

	void testAPIKeyAuthetication(){
		
		System.out.println("testAPIKeyAuthetication... ");
		given()
			.queryParam("appid"," ")
		.when()
			.get("")
		.then()
			.assertThat()
			.statusCode(200)
			// .body("authenticated", equalTo(true))
			.log().all();
	}

} // end class
