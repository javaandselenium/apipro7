package CURDoperations;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class Test1 {
	@Test
	public void tc2() {
JSONObject jobj=new JSONObject();
jobj.put("id",1234);
jobj.put("title","demoApi");
		
	given()
	.contentType(ContentType.JSON)
	.body(jobj)
	
	.when()
	.post("http://localhost:3000/posts")
	
	.then()
	.log().all();
		
		
	}

}
