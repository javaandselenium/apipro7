package GithubCURDOperation;
import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

public class Test3 {
	
	@Test
	public void tc4() {
		
		given()
		.auth().oauth2("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")
		
		.when()
		.delete("https://api.github.com/repos/javaandselenium/Api7clk")
		
		.then()
		.log().all();
	}

}
