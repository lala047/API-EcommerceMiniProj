package tests;

import static io.restassured.RestAssured.given;

import java.util.ArrayList;
import java.util.List;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import pojo.OrderDetail;
import pojo.Orders;

public class CreateOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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

		System.out.println(responseAddOrder);*/
		

	}

}
