package parameterization;
import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

public class Test0 {
	@Test
	public void tc1() {
	
		given()
		.pathParam("ownerName","javaandselenium")
		.pathParam("repoName","evening5clk")
		
		.when()
		.get("https://api.github.com/repos/{ownerName}/{repoName}")
		
		.then()
		.log().all();
	}

}
