package GithubCURDOperation;

import static io.restassured.RestAssured.*;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class Test2 {
@Test
public void tc3() {
	JSONObject jobj=new JSONObject();
	jobj.put("description","repo is valid");
	
	given()
	.contentType(ContentType.JSON)
	.body(jobj)
	.auth().oauth2("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")
	
	.when()
	.patch("https://api.github.com/repos/javaandselenium/Api7clk")
	
	.then()
	.log().all();
}
}
