package tests;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.specification.RequestSpecification;
import pojo.OrderDetail;
import pojo.Orders;

import static io.restassured.RestAssured.given;

public class AddProduct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

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
		
		
		//Create Order
		RequestSpecification createOrderBaseReq=	new RequestSpecBuilder()
				.setBaseUri("https://rahulshettyacademy.com")
				.addHeader("authorization", token)
				.setContentType(ContentType.JSON)
				.build();
		OrderDetail orderDetail = new OrderDetail();
		orderDetail.setCountry("India");
		orderDetail.setProductOrderedId(productId);
		
		List<OrderDetail> orderDetailList = new ArrayList<OrderDetail> ();
		orderDetailList.add(orderDetail);	
		Orders orders = new Orders();
		orders.setOrders(orderDetailList);
		
	RequestSpecification createOrderReq=given().log().all().spec(createOrderBaseReq).body(orders);

	String responseAddOrder = createOrderReq.when().post("/api/ecom/order/create-order").then().log().all().extract().response().asString();
	System.out.println(responseAddOrder); */
	}

}
