package string;

public class StringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1=new String("abc");
		String s2=new String("abc");
		StringStaticPool s3=new StringStaticPool();
		StringStaticPool s4=new StringStaticPool();
		System.out.println(s1.hashCode());//String重写了hashcode保证相同的内容hashcode一样
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());//它没重写就不一样
		System.out.println(s4.hashCode());
	}

}
