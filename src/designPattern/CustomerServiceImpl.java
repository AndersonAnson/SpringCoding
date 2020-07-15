package designPattern;

public class CustomerServiceImpl implements CustomerService {

	@Override
	public void save() {
		System.out.println("客户保存了。。。。。");
	}

	@Override
	public int find() {
		System.out.println("客户查询数量了。。。。。");
		return 100;
	}

}
