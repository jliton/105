package API;

import org.testng.annotations.Test;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class Calling{
	String Resp;
@Test
public void GetCall() {
	
	io.restassured.response.Response res= RestAssured.
			given().
			when().
			get("http://localhost:3000/api/SMBCustomers").
			then().assertThat().statusCode(200).and().contentType(ContentType.JSON).extract().response();
	Resp=res.asString();
	System.out.println(Resp);
	Gson gson=new GsonBuilder().create();
	GetDetails[]  getDetails;
	if(res.getStatusCode()==200) {
		
		getDetails=gson.fromJson(Resp,GetDetails[].class );
		System.out.println(getDetails[0].getLastName());
				
		
		
	}
	
}
}
