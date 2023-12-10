package com.test.restassured;

import static io.restassured.RestAssured.given;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class ReqresTest3 {
	
	@Test(enabled=false)
	public void test_01(){
		System.out.println("******Test01******");
		Response res = RestAssured.get("https://reqres.in/api/users?pages=2");
		System.out.println("Response code: " +res.getStatusCode());
		System.out.println("Response body: " +res.getBody());
		System.out.println("Response time: " +res.getTime());
		System.out.println("Response header: " +res.getHeader("content-type"));
		
		int expectedStatus = 200;
		int actualStatus = res.getStatusCode();
		Assert.assertEquals(actualStatus, expectedStatus);
		
	}
	
	@Test(enabled=false)
	public void test_02(){
		System.out.println("******Test02******");
		String baseUri="https://reqres.in/api/users";
		given()
		.queryParam("pages", "2")
		.when()
		.get(baseUri)
		.then()
		.statusCode(200);
		
	}
	
	@Test(enabled=true)
	public void test_03(){
		System.out.println("******Test03******");		
		String baseUri="https://reqres.in/api/users";
		given()
		.queryParam("pages", "2")
		.when()
		.get(baseUri)
		.then()
		.statusCode(200);
		
	}

}
