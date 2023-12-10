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

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;

import static org.hamcrest.Matchers.*;

public class ReqresTest2 {

@Test (enabled=true)

void test_01singleJSONObject(){
	
	Response res = get("https://reqres.in/api/users");

	get("https://reqres.in/api/users?page=2").then()
	.assertThat()
	.statusCode(200)
	.body("page", equalTo(2))
	.body("data.id[0]", equalTo(7))
	.body("data.first_name[0]", equalTo("Michael"))
	.body("total", equalTo(12));
	
	System.out.println(res.body().asString());
	
//	String log =	given().
//			when().
//			get("https://reqres.in/api/users").
//			then().assertThat().
//			body("id", equalTo(7))
//			.log().body().toString();
	
}

//@Test (enabled=false)
//
//void test_02responseString() {
//
//	String res = get("https://reqres.in/api/users?page=2").then()
//	.assertThat()
//	.statusCode(200)
//	.extract()
//	.asString();
//	
//	assertThat(res).isNotEmpty();
//	
//}


@Test (enabled=false) // fail

void test_03responseJson() {

	Map<String, String> request = new HashMap<>();
    request.put("name", "morpheus");
    request.put("job", "leader");
    
    JSONObject jsonData = new JSONObject();
    jsonData.put("name", "morpheus");
    jsonData.put("job", "leader");
 
    String uri="https://reqres.in";

    int pageId = given().contentType("application/json")
      .body(request)
      .when()
      .post(uri + "/api/users")
      .then()
      .assertThat()
      .statusCode(201)
      .extract()
      .path("id");
    
    System.out.println("id..." +pageId);
  //  assertThat(pageId).isEqualTo(11);
	
}

@Test  (enabled=false) //pass

void test_04responseJson() {
    
	System.out.println("******test_04responseJson()*********");
    JSONObject jsonData = new JSONObject();
    jsonData.put("name", "morpheus");
    jsonData.put("job", "leader");
 
    String uri="https://reqres.in";

    given().contentType("application/json")
      .body(jsonData.toJSONString())
      .when()
      .post(uri + "/api/users")
      .then()
      .assertThat()
      .statusCode(201)
      .log().all(); 
	
}

// put using jsonObject
/*
 * PUT you need to pass in data to update the entire resource, even if you only want to 
 * modify one field; PUT will create a new resource if it cannot find the specified resource
 *  (while Upsert allowed)
 * 
 */

@Test(enabled=false)  //pass

void test_05PutData() {
    
	System.out.println("******test_05PutData()*********");
    JSONObject jsonData = new JSONObject();
    jsonData.put("name", "Tutu");
    jsonData.put("job", "Teacher");
 
    String uri="https://reqres.in";

    given().contentType("application/json")
      .body(jsonData.toJSONString())
      .when()
      .put(uri + "/api/users/349")
      .then()
      .assertThat()
      .statusCode(200)
      .log().all(); 
	
}

@Test (enabled=false) //pass

/*
 *  PATCH , you can update part of a resource by simply passing in the 
 *  data of the field to be updated
 * 
 */

void test_06PatchData() {
	
	System.out.println("******test_06PatchData()*********");
    
	// request payload
    JSONObject jsonData = new JSONObject();
    jsonData.put("name", "Dalim");
    jsonData.put("job", "QA");
 
    String uri="https://reqres.in";

    given().contentType("application/json")
      .body(jsonData.toJSONString())
      .when()
      .patch(uri + "/api/users/349")
      .then()
      .assertThat()
      .statusCode(200)
      .log().all(); 
	
}

@Test (enabled=false) //pass

void test_07DeleteData() {
	
	System.out.println("******test_07DeleteData()*********");
    
    String uri="https://reqres.in";

    given()
      .when()
      .delete(uri + "/api/users/349")
      .then()
      .log().all().statusCode(204); 
	
}

@Test (enabled=false)

void test_08JsonArray() {
	
	get("https://reqres.in/api/users?page=2").then()
    .statusCode(200)
    .assertThat()
    .body("size()", is(6));
	}


@Test (enabled=false) // fail - compilation error JSONTokener

void test_09useExternalJsonFile() throws FileNotFoundException {

	System.out.println("******test_09useExternalJsonFile()*********");
	
	File f = new File("/Users/suparna/git/SNOW_Test/SNOWTest/data.json");
	
	FileReader fr = new FileReader(f);
	
//	JSONTokener jt = new JSONTokener(fr);
	
//	JSONObject jsonData = new JSONObject(jt);
   
 
    String uri="https://reqres.in";

//    int pageId = given().contentType("application/json")
//      .body(jsonData.toString())
//      .when()
//      .post(uri + "/api/users")
//      .then()
//      .assertThat()
//      .statusCode(201)
//      .extract()
//      .path("id");
    
 //   System.out.println("id..." +pageId);
  //  assertThat(pageId).isEqualTo(11);
	
}

@Test (enabled=false)  //Fail - java.lang.UnsupportedClassVersionError: 

void test_10PostDataUsingPojo() {
    
	System.out.println("******test_10PostDataUsingPojo()*********");
	
	SamplePojoForSerialization obj = new SamplePojoForSerialization("morpheus","leader");

    String uri="https://reqres.in/";

    given().contentType("application/json")
      .body(obj)
      .when()
      .post(uri + "api/users")
      .then()
      .assertThat()
      .statusCode(201)
      .log().all(); 
    
    // pojo to Json serialization //Fail - java.lang.UnsupportedClassVersionError: 
    JsonSerializer js =JsonSerializer.DEFAULT_READABLE;
    System.out.println(js.serialize(obj));
	
}

@Test(enabled=false) //pass

void test_11PostDataUsingJsonObject() {
    
	System.out.println("******test_11PostDataUsingJsonObject()*********");	
	
	// request payload
    JSONObject jsonData = new JSONObject();
    jsonData.put("name", "morpheus");
    jsonData.put("job", "leader");

    String uri="https://reqres.in/";

    given().contentType("application/json")
      .body(jsonData.toString())
      .when()
      .post(uri + "api/users")
      .then()
      .assertThat()
      .statusCode(201)
      .log().all(); 
    	
}

@Test(enabled=false) //WIP - need to update samplePojoForDeserialization

void test_12GetDataConvertPojo() {
    
	System.out.println("******ttest_12GetDataConvertPojo()*********");	
	
    String uri="https://reqres.in/";
    
    given()
    .when()
    .get(uri + "api/unknown/2")
    .then()
    .assertThat()
    .statusCode(200)
    .log().all(); 
    
   String jsonVal= "{\"data\":{\"id\":2,"
   		+ "\"email\":\"janet.weaver@reqres.in\","
   		+ "\"first_name\":\"Janet\",\"last_name\":\"Weaver\","
   		+ "\"avatar\":\"https://reqres.in/img/faces/2-image.jpg\"},"
   		+ "\"support\":{\"url\":\"https://reqres.in/#support-heading\","
   		+ "\"text\":\"TokeepReqResfree,contributionstowardsservercostsareappreciated!\"}}";

   JsonParser jp = JsonParser.DEFAULT; 
    	
}


} // end class