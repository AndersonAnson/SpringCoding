package genericTest;

import java.util.HashMap;

public class GenericTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Order<Integer> o = new Order<Integer>("chenqingxiao", 1, 123);
		SubOrder<Integer> o2 = new SubOrder<Integer>("chenqingxiao", 2, 456);
		System.out.println(o.toString());
		System.out.println(o2.toString());
		HashMap<String,Integer> map=new HashMap<>(10);
		System.out.println(Integer.toHexString(o.hashCode()));
	}

}
