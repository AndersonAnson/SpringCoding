package polymorsim;

public class Test {
	public static void main(String[] args) {
		Animal a1=new Animal();
		Animal a2=new Dog();
		Dog d=new Dog();
		LangDog l=new LangDog();
		ZangAo z=new ZangAo();
		System.out.println(a1.show(a2));
		System.out.println(a1.show(l));
		System.out.println(a1.show(z));//进入对应类型的重载方法
		System.out.println(a2.show(d));//重写了
		System.out.println(a2.show(l));//重写了
		System.out.println(a2.show(z));//方法参数不一样 没重写就看父类
		System.out.println(d.show(d));
		System.out.println(d.show(l));
		System.out.println(d.show(z));
	}
}
