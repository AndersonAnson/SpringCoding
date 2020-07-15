package designPattern.proxy;

public class StaticPorxyTest {
public static void main(String[] args) {
	NikeClothFactory nike=new NikeClothFactory();
	ProxyClothFactory proxyClothFactory=new ProxyClothFactory(nike);
	proxyClothFactory.produceCloth();
}
}
