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
		System.out.println(a1.show(z));//�����Ӧ���͵����ط���
		System.out.println(a2.show(d));//��д��
		System.out.println(a2.show(l));//��д��
		System.out.println(a2.show(z));//����������һ�� û��д�Ϳ�����
		System.out.println(d.show(d));
		System.out.println(d.show(l));
		System.out.println(d.show(z));
	}
}
