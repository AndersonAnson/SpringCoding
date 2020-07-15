package designPattern;

public class JdkProxyTest {

	public static void main(String[] args) {
		CustomerService customerService = new CustomerServiceImpl();
		// 利用代理对象工厂生成一个代理对象
		JdkProxyFactory factory = new JdkProxyFactory(customerService);
		customerService = (CustomerService) factory.getProxyObject();
		customerService.save();
		System.out.println("------------------");
	}

}