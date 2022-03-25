package validation;
import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;


public class Test0 {
	@Test
	public void tc1() {
		when()
		.get("https://api.github.com/repos/javaandselenium/evening5clk")
		
		.then()
		.log().all()
		.assertThat().header("Server","GitHub.com")
		.assertThat().header("Referrer-Policy","origin-when-cross-origin, strict-origin-when-cross-origin");
	}

}
