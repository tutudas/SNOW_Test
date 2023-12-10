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
//import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.*;

public class ReqresTest {
	
@Test(enabled=true)
	
public void test_01() {
		
		Response res = get("https://reqres.in/"); 
		
		System.out.println("******Test1******");
	//	System.out.println(res.asString());
		System.out.println(res.getBody().asString());
		System.out.println(res.getStatusCode());
		System.out.println(res.getTime());
		System.out.println(res.getHeaders());
		System.out.println(res.getHeader("Content-Type"));
		
		int statusCode = res.getStatusCode();
		Assert.assertEquals(statusCode, 200); // pass
		
	}
	
@Test(enabled=false)

public void test_02(){

	System.out.println("******Test2******");
	Response res = 
			given().
	when().
	get("https://reqres.in/");    

	System.out.println("body...." +res.getBody().toString());
	int statusCode = res.getStatusCode();
	
	Assert.assertEquals(statusCode, 200); // pass
}

@Test(enabled=false)
	public void test_03(){
	
	System.out.println("******Test3******");
	Response res = given().
			when().
			get("https://reqres.in/api/users?page=2");
		//	.get("https://reqres.in/");
	

//	System.out.println("is this page2...."+res.then().assertThat().body("page", equalTo("2"))) ;
	
	System.out.println("status code...."+res.getStatusCode());
	System.out.println("status code...."+res.asString());
}

@Test(enabled=false)

public void test_04(){

	System.out.println("******Test4******");
	// list users --- fail----
//			given().
//				when().
//				get("https://reqres.in/api/users?page=2").
//				then().assertThat().
//				body("page", equalTo("2")).
//				body(contains("success")).
//				body(not(contains("errors"))).
//				statusCode(200).log().body();
			
	// ----pass---
	
			given().
			when().
			get("https://reqres.in/api/users?page=2").
			then().
			statusCode(200).log().body();
}

@Test(enabled=false)
public void test_04A(){

	System.out.println("******Test4A******");
	// print error msg
	String log =	given().
				when().
				get("https://reqres.in/api/users?page=2").
				then().assertThat().
				body("page", equalTo(2)).
				body(contains("success")).
				body(not(contains("errors"))).
				statusCode(200).log().ifValidationFails().
				log().body().toString();
	
}


@Test (enabled=false)

public void test_05getResponseBody() {
	
	System.out.println("******Test5******");
	
	given().when().get("https://reqres.in/api/users?page=2").then().log()
		  .all();
		 
	
}

@Test (enabled=false)
public static void test_06getResponseContentType(){
	
	System.out.println("******Test6******");
	   System.out.println("The content type of response "+
	          get("https://www.google.com/").then().extract()
	              .contentType());
	}

}
