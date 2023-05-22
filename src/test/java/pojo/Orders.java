package pojo;

import java.util.List;

public class Orders {
	
	private List<OrderDetail> orders;          // OrderDetail is inside the array of Orders according to payload in the contract of Create order

	public List<OrderDetail> getOrders() {
		return orders;
	}

	public void setOrders(List<OrderDetail> orders) {
		this.orders = orders;
	}

}
