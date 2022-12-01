
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.when;
import static io.restassured.RestAssured.given;


public class restTest {

	@Test
	public void getClientTest() {
		when().get("https://generator.swagger.io/api/gen/servers").
		then().
		statusCode(200);
	}
	
	@Test
	public void generateClientTest() {
		String postData = "{\n"
				+ "  \"spec\": {},\n"
				+ "  \"options\": {\n"
				+ "    \"additionalProp1\": \"string\",\n"
				+ "    \"additionalProp2\": \"string\",\n"
				+ "    \"additionalProp3\": \"string\"\n"
				+ "  },\n"
				+ "  \"swaggerUrl\": \"http://petstore.swagger.io/v2/swagger.json\",\n"
				+ "  \"authorizationValue\": {\n"
				+ "    \"value\": \"string\",\n"
				+ "    \"type\": \"string\",\n"
				+ "    \"keyName\": \"string\",\n"
				+ "    \"urlMatcher\": {}\n"
				+ "  },\n"
				+ "  \"usingFlattenSpec\": true,\n"
				+ "  \"securityDefinition\": {\n"
				+ "    \"type\": \"string\",\n"
				+ "    \"description\": \"string\"\n"
				+ "  }\n"
				+ "}";
		
		given().
		contentType(ContentType.JSON).
		body(postData).
		when().
		post("https://generator.swagger.io/api/gen/servers/spring").
		then().
		statusCode(200);
	}
}
