package validation;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import org.testng.annotations.Test;

public class Test2 {
	@Test
	public void tc2() {
	when()
	.get("http://localhost:3000/posts")
	
	.then()
	.log().all()
	.body("[4].title",equalTo("qwsedrty"))
	.body("[3].title",contains("Manaultesting"))
.body("[6].author",is("john"));
	
}
}