package designPattern;

public class CustomerServiceImpl implements CustomerService {

	@Override
	public void save() {
		System.out.println("�ͻ������ˡ���������");
	}

	@Override
	public int find() {
		System.out.println("�ͻ���ѯ�����ˡ���������");
		return 100;
	}

}
