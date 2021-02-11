package stepdef;

 
import static org.junit.Assert.assertThat;

import io.cucumber.java.en.Given;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import static org.hamcrest.Matchers.*;



public class stepdefTest {
	
	 private static final String BASE_URL = "https://api.openweathermap.org/data/2.5/onecall";
	 
	 private static Response response;
	 

	@SuppressWarnings("deprecation")
	@Given("All trips will be completed in the current work week")
	 public void as_a_traveler() {
	 
		 response = RestAssured.given().param("lat", "33.441792").param("lon", "-94.037689").param("appid", "d9255eb874413f61eac6c3b2ac72061d").when().get(BASE_URL);
		 
		
		try{
			assertThat("20", is(lessThanOrEqualTo(response.path("current.temp").toString())));
			System.out.println("The traveller will pack swimmers, the weather is not cold");
			
		    }
		   
		    catch(Exception e){ 
		       System.out.println("The traveller will pack woollens, it is cold");
		    }
	 }
}
