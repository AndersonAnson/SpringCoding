package designPattern.abstractFactory;

public class BJPepperPizza extends Pizza{
	@Override
	public void prepare() {
		// TODO Auto-generated method stub
		setName("北京的胡椒披萨");
		System.out.println("北京胡椒披萨准备原材料");
	}
}
