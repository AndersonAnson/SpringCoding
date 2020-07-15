package designPattern;

public class JdkProxyTest {

	public static void main(String[] args) {
		CustomerService customerService = new CustomerServiceImpl();
		// ���ô�����󹤳�����һ���������
		JdkProxyFactory factory = new JdkProxyFactory(customerService);
		customerService = (CustomerService) factory.getProxyObject();
		customerService.save();
		System.out.println("------------------");
	}

}