package parameterization;
import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

public class Test2 {
	@Test
	public void tc2() {
	given()
	.param("q","api")
	.param("order","desc")
	
	.when()
	.get("https://api.github.com/search/users")
	
	.then()
	.log().all();
	}

}
