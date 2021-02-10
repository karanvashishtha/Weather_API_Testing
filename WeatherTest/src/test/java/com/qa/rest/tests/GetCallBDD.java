package com.qa.rest.tests;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class GetCallBDD {
	
	@Test
	public void Tc01()
	{
		given().
		when().
		   get("https://api.openweathermap.org/data/2.5/onecall?lat=33.441792&lon=-94.037689&exclude=hourly,daily&appid=d9255eb874413f61eac6c3b2ac72061d").
		then().
		assertThat().
		statusCode(200);
	}

}
