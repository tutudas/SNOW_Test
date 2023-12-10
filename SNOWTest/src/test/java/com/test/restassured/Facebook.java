package com.test.restassured;
import javax.xml.ws.Response;
import static io.restassured.RestAssured.given;
import io.restassured.matcher.RestAssuredMatchers;

public class Facebook {

	Response res =  
			given()
			.queryParam("firstName", "John", "lastName", "Doe")
			.when()
			.post("/greetXML")
			.then()
			.body("greeting.firstName", equalTo("John"));

	
}
