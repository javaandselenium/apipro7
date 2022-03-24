package GithubCURDOperation;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;

public class Test0 {
	@Test
	public void tc1() {
	when()
	.get("https://api.github.com/repos/javaandselenium/evening5clk")
	
	.then()
	.log().all();
	}

}
