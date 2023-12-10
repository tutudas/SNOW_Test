package com.test.restassured;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.get;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.RestAssured.*;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.matcher.RestAssuredMatchers;
import io.restassured.matcher.RestAssuredMatchers.*;
import org.hamcrest.Matchers.*;
import org.json.simple.JSONObject;

//import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.*;

import java.util.HashMap;
import java.util.Map;

public class ReqresTest4 {
	
	String id;
	String uri="https://reqres.in";
	
@Test(priority=1, enabled=false)

public void createUser(){
	System.out.println("******createUser*********");
	
	Map<String, String> request = new HashMap<>();
    request.put("name", "person1");
    request.put("job", "job1");

    int id = given().contentType("application/json")
      .body(request)
      .when()
      .post(uri + "/api/users")
      .jsonPath().getInt("id");
    
    System.out.println("id..." +id);
}

@Test(priority=2, dependsOnMethods = {"createUser"}, enabled=false)
	public void updateUser(){	
	System.out.println("******updateUser*********");
	
	Map<String, String> request = new HashMap<>();
    request.put("name", "tutu");
    request.put("job", "tester");

    	given()
    		.contentType("application/json")
    		.body(request)
    .when()
      .put(uri + "/api/users/"+id)
    .then()
      .statusCode(200)
      .body("name", equalTo("tutu"))
      .body("job", equalTo("tester"));
}

@Test(priority=3, enabled=false)
public void deleteUser(){

System.out.println("********deleteuser*******");
	given()
	.when()
		.delete(uri + "/api/users/"+id)
	.then()
		.statusCode(204);
	}

@Test(priority=4, enabled=false)
public void testQueryAndPathParameters(){
	System.out.println("******testQueryAndPathParameters*********");
	
    		given()
    		.pathParam("myPath","users")
    		.queryParam("page", 2)
    		.queryParam("id", 5)
      .when()
      	.get(uri + "/api/{myPath}")
       .then()
       	.statusCode(200)
       	.log()
       	.all();
}

@Test(priority=5)
public void testCookies(){

System.out.println("********testCookies*******");
	given()
	.when()
		.get("https://www.google.com/")
	.then()
		.cookie("AEC", "")
		.log()
		.all();
	}

} // end class
