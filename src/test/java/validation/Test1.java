package validation;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import org.testng.annotations.Test;

import io.restassured.path.json.JsonPath;

public class Test1 {
	@Test
	public void tc2() {
		when()
		.get("https://api.github.com/repos/javaandselenium/evening5clk")
		
		.then()
		.log().all()
		.assertThat().header("Server","GitHub.com")
		.body("owner.login",equalTo("javaandselenium"))
		.assertThat().statusCode(200);
		
	}

}
