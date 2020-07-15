package designPattern.proxy;

import java.lang.reflect.Proxy;

public class ProxyClothFactory implements ClothFactory {
	private ClothFactory factory;

	public ProxyClothFactory(ClothFactory factory) {
		super();
		this.factory = factory;
	}

	public ClothFactory getFactory() {
		return factory;
	}

	public void setFactory(ClothFactory factory) {
		this.factory = factory;
	}
	
	@Override
	public void produceCloth() {
		// TODO Auto-generated method stub
//		System.out.println("������������");
//		factory.produceCloth();
//		System.out.println("����������β����");

	}

	public static void main(String[] args) {
		ProxyClothFactory pc=new ProxyClothFactory(new NikeClothFactory());
		
	}
}
