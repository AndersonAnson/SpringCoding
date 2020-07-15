package designPattern.factory;

public abstract class OrderPizza {
	abstract Pizza createPizza(String orderType);

	public OrderPizza() {
		Pizza pizza = null;
		String orderType;
		do {
			orderType = "chesse";
			pizza = createPizza(orderType);//���󷽷��ɹ����������
		} while (true);
	}

}
