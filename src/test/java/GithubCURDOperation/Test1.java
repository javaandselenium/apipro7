package GithubCURDOperation;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;


public class Test1 {
	@Test
	public void tc2() {
		JSONObject jobj=new JSONObject();
		jobj.put("name","Api7clk");
		jobj.put("description","dummy repro");
		
		given()
		.contentType(ContentType.JSON)
		.body(jobj)
		.auth().oauth2("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")
		
		.when()
		.post("https://api.github.com/user/repos")
		
		.then()
		.log().all();
		
		
		
		
	}

}
