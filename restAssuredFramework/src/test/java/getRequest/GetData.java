package getRequest;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;


public class GetData {

	@Test
	public void testResponseCode() {
		
		Response resp = RestAssured.get("https://samples.openweathermap.org/data/2.5/weather?q=London,uk&appid=b6907d289e10d714a6e88b30761fae22");
		
		
		int code = resp.getStatusCode();
		ResponseBody data= resp.body();
		
		System.out.println("The response code is: "+code);
		System.out.println("The data is: "+data.asString());
		Assert.assertEquals(code, 200);
		
		
	}
}
