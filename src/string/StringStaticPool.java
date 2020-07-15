package string;

import java.lang.reflect.Field;
import java.util.HashMap;

import array.SparseMatrix;

public class StringStaticPool {
	private String name;
	private int id;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public StringStaticPool() {

	}

	public StringStaticPool(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String a="a";
//		String b="a";
//		String c=new String("a");
//		String d=new String("a");
//		System.out.println(a==b);
//		System.out.println(a.equals(b));
//		System.out.println(c==d);
//		System.out.println(c.equals(d));
//		System.out.println(b.hashCode());
//		System.out.println(c.hashCode());
//		
//		Integer m=new Integer(1);
//		Integer n=new Integer(1);
//		Integer i=Integer.valueOf(1);
//		Integer j=1;
//		System.out.println(m.equals(i));
//		System.out.println(n==i);
//		System.out.println(i.equals(j));
//		System.out.println(i==j);
//		System.out.println(j.hashCode());
//		HashMap<String,String> h=new HashMap<String,String>();
//		h.hashCode();
//		String ss = "123456";
//		 
//		System.out.println("ss = " + ss);
//		 
//		ss.replace('1', '0');
//		 
//		System.out.println("ss = " + ss);
		StringStaticPool sm0 = new StringStaticPool("xiaohua", 221321312);
		StringStaticPool sm1 = new StringStaticPool("xiaohua", 221321312);
		StringStaticPool sm2 = new StringStaticPool("xiaohua", 221321312);
		StringStaticPool sm3 = new StringStaticPool("xiaohua", 221321312);
		StringStaticPool sm4 = new StringStaticPool("xiaohua", 221321312);
		System.out.println(sm0.hashCode());
		System.out.println(sm1.hashCode());
//		System.out.println(sm2.hashCode());
//		System.out.println(sm3.hashCode());
//		System.out.println(sm4.hashCode());
//		System.out.println(sm2.equals(sm1));
		System.out.println(sm0==sm1);
	}

}
