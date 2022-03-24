package parameterization;
import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

public class Test1 {
	@Test
	public void tc2() {
	given()
	.queryParam("q","api")
	.queryParam("order","desc")
	
	.when()
	.get("https://api.github.com/search/users")
	
	.then()
	.log().all();
	}

}
