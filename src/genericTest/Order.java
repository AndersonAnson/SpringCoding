package genericTest;

import java.util.ArrayList;
import java.util.List;

public class Order<T> {
	private String orderName;
	private int orderId;
	T orderT;

	public Order() {

	}

	public Order(String orderName, int orderId, T orderT) {
		super();
		this.orderName = orderName;
		this.orderId = orderId;
		this.orderT = orderT;
	}

	public String getOrderName() {
		return orderName;
	}

	public void setOrderName(String orderName) {
		this.orderName = orderName;
	}

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public T getOrderT() {
		return orderT;
	}

	public void setOrderT(T orderT) {
		this.orderT = orderT;
	}

	@Override
	public String toString() {
		return "Order [orderName=" + orderName + ", orderId=" + orderId + ", orderT=" + orderT + "]";
	}

//	·ºÐÍ·½·¨
	public <E> List<E> copyFromArray(E[] arr) {
		ArrayList<E> list = new ArrayList<E>();
		for (E e : arr) {
			list.add(e);
		}
		return list;
	}
}
