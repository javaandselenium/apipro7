package scripts;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;

public class Test0 {
	@Test
	public void tc1() {
	Response resp = RestAssured.get("http://localhost:3000/posts");	
	 ValidatableResponse resval = resp.then();
	 resval.log().all();
	}
	

}
