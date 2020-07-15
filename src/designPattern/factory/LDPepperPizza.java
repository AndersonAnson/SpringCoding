package designPattern.factory;

public class LDPepperPizza extends Pizza{

	@Override
	public void prepare() {
		// TODO Auto-generated method stub
		setName("london pepper");
		System.out.println("london pepper pizza准备原材料");
	}

}
