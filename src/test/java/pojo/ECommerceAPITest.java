package pojo;

import static io.restassured.RestAssured.given;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.testng.Assert;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.specification.RequestSpecification;

public class ECommerceAPITest {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		RequestSpecification req=	new RequestSpecBuilder().setBaseUri("https://rahulshettyacademy.com/")
		  .setContentType(ContentType.JSON).build();
			
				
				//LOGIN 
			
			LoginRequest loginRequest = new LoginRequest();
			loginRequest.setUserEmail("EMMAIGHEDO@YAHOO.COM");	// Set your values using 'SET' only
			loginRequest.setUserPassword("Slyman01%");
				
			RequestSpecification reqLogin =given().relaxedHTTPSValidation().log().all().spec(req).body(loginRequest);
			LoginResponse loginResponse = reqLogin.when().post("/api/ecom/auth/login").then().log().all().extract()
			.response().as(LoginResponse.class);     // use this if u are using DESERIALIZATION to extract the response where Loginresponse is the class containing DESERIALIZATION
			
			System.out.println(loginResponse.getToken()); // Also ensure you create the DESERIALIZATION pojo class(Login Response) for the Response you are expecting in the form of token, user id and message
			
			String token = loginResponse.getToken();
			System.out.println(loginResponse.getUserId());
			String userId =loginResponse.getUserId(); 

			//Add Product
			
			/*RequestSpecification addProductBaseReq=	new RequestSpecBuilder().setBaseUri("https://rahulshettyacademy.com")
					.addHeader("authorization", token)
					.build();
			
			RequestSpecification reqAddProduct = given().log().all().spec(addProductBaseReq).param("productName", "Laptop")
			.param("productAddedBy", userId).param("productCategory", "fashion")
			.param("productSubCategory", "shirts").param("productPrice", "11500")
			.param("productDescription", "Lenova").param("productFor", "men")
			.multiPart("productImage",new File("//users//rahulshetty//documents//laptop.png"));
			
			String addProductResponse =reqAddProduct.when().post("/api/ecom/product/add-product").
			then().log().all().extract().response().asString();
			JsonPath js = new JsonPath(addProductResponse);
			String productId =js.get("productId");
			
	
			//Create Order(To purchase product)
			
			/*PayLoad(Body)
			{"orders":[{"country":"India","productOrderedId":"638d783803841e9c9a4a33be"}]}   <- It s a nested payload*/ 
			
			/*RequestSpecification createOrderBaseReq= new RequestSpecBuilder()
					.setBaseUri("https://rahulshettyacademy.com")
				    .addHeader("authorization", token)
				    .setContentType(ContentType.JSON)  // <- content type is part of the header because the payload is in json
					.build();

			OrderDetail orderDetail = new OrderDetail();    //an object of the pojo class is created
			orderDetail.setCountry("India");		//set the values of the variable in the pojo class
			orderDetail.setProductOrderedId(productId); //set the values of the variable in the pojo class
				
			List<OrderDetail> orderDetailList = new ArrayList<OrderDetail> ();    // an object of ArrayList is created because the payload is an array
			orderDetailList.add(orderDetail);	

			Orders orders = new Orders();		//an object of the  Array pojo class is created
			orders.setOrders(orderDetailList);
				
			RequestSpecification createOrderReq=given().log().all().spec(createOrderBaseReq).body(orders);

			String responseAddOrder = createOrderReq.when().post("/api/ecom/order/create-order").then().log().all().extract().response().asString();

			System.out.println(responseAddOrder);
			


		//Delete Product

		RequestSpecification deleteProdBaseReq=	new RequestSpecBuilder()
							.setBaseUri("https://rahulshettyacademy.com")
							.addHeader("authorization", token)
							.setContentType(ContentType.JSON)
							.build();

		RequestSpecification deleteProdReq =given().log().all().spec(deleteProdBaseReq).pathParam("productId",productId); //it has part parameter- refer to contract

		String deleteProductResponse = deleteProdReq.when().delete("/api/ecom/product/delete-product/{productId}").then().log().all(). 
		extract().response().asString();   

		JsonPath js1 = new JsonPath(deleteProductResponse);

		Assert.assertEquals("Product Deleted Successfully",js1.get("message")); */
	}
	
}

	