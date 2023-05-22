package tests;

import static io.restassured.RestAssured.given;

import org.testng.Assert;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.specification.RequestSpecification;

public class DeleteProduct {

	public static void main(String[] args) {

		/*RequestSpecification deleteProdBaseReq=	new RequestSpecBuilder()
				.setBaseUri("https://rahulshettyacademy.com")
				.addHeader("authorization", token)
				.setContentType(ContentType.JSON)
				.build();

RequestSpecification deleteProdReq =given().log().all().spec(deleteProdBaseReq).pathParam("productId",productId); //it has part parameter- refer to contract

String deleteProductResponse = deleteProdReq.when().delete("/api/ecom/product/delete-product/{productId}").then().log().all(). 
extract().response().asString();   

JsonPath js1 = new JsonPath(deleteProductResponse);

Assert.assertEquals("Product Deleted Successfully",js1.get("message"));*/
}


}
