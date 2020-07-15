package genericTest;

public class SubOrder<T> extends Order<T> {

	public SubOrder() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SubOrder(String orderName, int orderId, T orderT) {
		super.setOrderName(orderName);
		super.setOrderId(orderId);
		super.setOrderT(orderT);
//		this.orderId = orderId;
//		this.orderT = orderT;
	}
}
