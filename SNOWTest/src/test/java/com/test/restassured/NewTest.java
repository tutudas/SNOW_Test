package com.test.restassured;
import static org.hamcrest.Matchers.equalTo;

import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;


//example of query param
//given().contentType(ContentType.JSON). with().queryParam("page", "2").queryParam("id", 9).
//when().get("").then().statusCode(200).log().all();
//}
public class NewTest {
   @Test (enabled=false)
   void respAssertion() {

      //base URI with Rest Assured class
      RestAssured.baseURI = "https://reqres.in/";

      //input details
      RequestSpecification h = RestAssured.given();
      //get response
      Response r = h.get("https://reqres.in/api/users?page=2");
      
  //    get("https://reqres.in/api/users?page=2"); // return response object

      //Response body
      ResponseBody bdy = r.getBody();
      
      //convert response body to string
      String b = bdy.asString();
      
      System.out.println(b);
      System.out.println("status code..." +r.getStatusCode());

      //JSON Representation from Response Body
      JsonPath j = r.jsonPath();

      //Get value of Location Key
      String l = j.get("page");
      System.out.println("page: " +l);
      System.out.println("code: " +j.get("status code"));
      
      

      // verify the value of key
      Assert.assertTrue(l.equals(2));
      
      // verify status code
      Assert.assertEquals(r.getStatusCode(), 200);
      Assert.assertEquals(r.getStatusCode(), 200, "not correct");
   }
   
   @Test
   void test_PostCallData() {

      //base URI with Rest Assured class
    RestAssured.baseURI = "https://reqres.in/";

      RequestSpecification h = RestAssured.given();
      
  	// request payload
      JSONObject jsonData = new JSONObject();
      jsonData.put("name", "Dalim");
      jsonData.put("job", "QA");
   
      h.header("contentType","application/json");
      h.body(jsonData.toJSONString());
      //get response  
      Response r = h.request(Method.POST, "/api/users");

      //Response body
      ResponseBody bdy = r.getBody();
      
      //convert response body to string
      String b = bdy.asString();
      
      System.out.println(b);
      System.out.println("status code..." +r.getStatusCode());

      //JSON Representation from Response Body
      JsonPath j = r.jsonPath();
//
//      //Get value of Location Key
//      String l = j.get("page");
//      System.out.println(l);
//
//      // verify the value of key
//      Assert.assertTrue(l.equals(2));
      
      // verify status code
      Assert.assertEquals(r.getStatusCode(), 201);
   }
}