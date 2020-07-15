package designPattern.factory;

public class BJOrderPizza extends OrderPizza{

	@Override
	Pizza createPizza(String orderType) {
		// TODO Auto-generated method stub
		Pizza pizza=null;
		if(orderType.equals("chesse")) {
			pizza=new BJCheesePizza();
		}
		return pizza;
	}
	
}
