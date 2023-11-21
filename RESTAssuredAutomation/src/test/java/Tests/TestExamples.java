package Tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import io.restassured.response.Response;

public class TestExamples {
	
	@Test	
	public void method1() {
		Response response =	get("https://reqres.in/api/users?page=2");
		System.out.println("Status code is: "+ response.statusCode());
		System.out.println(" time "+ response.time());
		System.out.println("status code and get body : "+ response.getBody().asString());
		
		int StatusCode = response.statusCode();
		Assert.assertEquals(StatusCode, 200);
	}

}
