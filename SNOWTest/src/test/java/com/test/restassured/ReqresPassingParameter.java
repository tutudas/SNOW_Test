package com.test.restassured;

import org.json.simple.JSONObject;
import org.apache.juneau.json.JsonParser;
import org.apache.juneau.json.JsonSerializer;
import org.json.*;
import org.testng.Assert;
import org.testng.annotations.Test;
//import io.restassured.RestAssured;

import static io.restassured.RestAssured.get;
import static io.restassured.RestAssured.given;
import io.restassured.matcher.ResponseAwareMatcher;
import io.restassured.response.Response;
import static org.hamcrest.Matchers.equalTo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;

import static org.hamcrest.Matchers.*;
public class ReqresPassingParameter {
	
	int id;
//	String uri="https://reqres.in";
	
	// get 'id' from post and use 'id' for next put call
	@Test(enabled=true, priority =1)  //pass

	void test_01PostData() {
	    
		System.out.println("****** test_01PostData()*********");
		// request payload
	    JSONObject jsonData = new JSONObject();
	    jsonData.put("name", "morpheus");
	    jsonData.put("job", "leader");

	    String uri="https://reqres.in";
	  id =  given().contentType("application/json")
	      .body(jsonData.toString())
	      .when()
	      .post(uri + "api/users")
	      .jsonPath().getInt("id");
	  System.out.println("id"+id);
	}

// use id ( get from post call ) in put call to update data
	@Test(enabled = false, priority =2)  //pass

	void test_05PutData() {
	    
		System.out.println("******test_05PutData()*********");
	    JSONObject jsonData = new JSONObject();
	    jsonData.put("name", "Tutu");
	    jsonData.put("job", "Teacher");
	    String uri="https://reqres.in";
	    given().contentType("application/json")
	      .body(jsonData.toJSONString())
	      .when()
	      .put(uri + "/api/users/"+id)
	      .then()
	      .assertThat()
	      .statusCode(200)
	      .log().all(); 
		
	}

} // end class
