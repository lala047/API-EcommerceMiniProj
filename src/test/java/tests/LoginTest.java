package tests;

import io.restassured.builder.RequestSpecBuilder;

import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import pojo.LoginRequest;
import pojo.LoginResponse;
import static io.restassured.RestAssured.given;
public class LoginTest {

	public static void main(String[] args) {
	
		
		RequestSpecification req=	new RequestSpecBuilder().setBaseUri("https://rahulshettyacademy.com")
			.setContentType(ContentType.JSON).build();
		
		LoginRequest loginRequest = new LoginRequest();      // Creating an object of the POJO Classs
		loginRequest.setUserEmail("emmaighedo@yahoo.com");	// Set your values using 'SET' only
		loginRequest.setUserPassword("Slyman01%");
		
			
		RequestSpecification reqLogin =given().relaxedHTTPSValidation().log().all().spec(req).body(loginRequest); //where loginRequest is the obj reference created
		LoginResponse loginResponse = reqLogin.when().post("/api/ecom/auth/login")
		.then().log().all().extract().response()
		.as(LoginResponse.class);     // use this if u are using DESERIALIZATION to extract the response where Loginresponse is the class containing DESERIALIZATION
		System.out.println(loginResponse.getToken()); // Also ensure you create the DESERIALIZATION pojo class(Login Response) for the Response you are expecting in the form of token, user id and message
		String token = loginResponse.getToken();
		System.out.println(loginResponse.getUserId());
		String userId =loginResponse.getUserId();

	}

}
