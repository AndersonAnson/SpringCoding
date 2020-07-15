package demo;

import java.util.Collections;
import java.util.LinkedHashMap;

public class OuterClass implements Cloneable{
	private String str;

	public void outerDisplay() {
		System.out.println("outerClass...");
	}

	public class InnerClass {
		public void innerDisplay() {
			str = "chenssy..."; // 使用外围内的属性
			System.out.println(str);
			outerDisplay(); // 使用外围内的方法
		}
	}

	// 推荐使用getxxx()来获取成员内部类，尤其是该内部类的构造函数无参数时
	public InnerClass getInnerClass() {
		return new InnerClass();
	}

	@Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
	
	public static void main(String[] args) {
		OuterClass outer = new OuterClass();
//        OuterClass.InnerClass inner = outer.getInnerClass();
//		OuterClass.InnerClass inner = outer.new InnerClass();
//		inner.innerDisplay();
		int a=4;
		int b=3;
		a=a^b;
		b=a^b;
		a=a^b;
		int[] intarray= {1,2,3,4,5,6,7};
		Integer[] intArray= {new Integer(1),new Integer(2)};
		System.out.println(intArray.hashCode());
	}
}
