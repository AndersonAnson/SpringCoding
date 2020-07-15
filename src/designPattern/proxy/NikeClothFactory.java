package designPattern.proxy;
//被代理类
public class NikeClothFactory implements ClothFactory {

	@Override
	public void produceCloth() {
		// TODO Auto-generated method stub
		System.out.println("nike工厂");
	}

}
