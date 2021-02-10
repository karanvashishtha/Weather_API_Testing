package stepdef;

 
import org.junit.Assert;
 
import io.cucumber.java.en.Given;
import io.restassured.RestAssured;
import io.restassured.response.Response;



public class stepdefTest {
	
	 private static final String BASE_URL = "https://api.openweathermap.org/data/2.5/onecall";
	 
	 private static Response response;

	 @Given("As a traveler")
	 public void as_a_traveler() {
	 
		 response = RestAssured.given().param("lat", "33.441792").param("lon", "-94.037689").param("appid", "d9255eb874413f61eac6c3b2ac72061d").when().get(BASE_URL);
		 
		Assert.assertEquals("hot", "276.92", response.path("current.temp").toString());
		Assert.assertNotEquals("20", response.path("current.temp").toString());
	 }
}
