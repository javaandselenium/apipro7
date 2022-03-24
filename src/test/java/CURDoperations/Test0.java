package CURDoperations;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;

public class Test0 {
	@Test
	public void getOperation() {
		
		when()
		.get("http://localhost:3000/posts")
		
		.then()
		.log().all();
		
	}

}
