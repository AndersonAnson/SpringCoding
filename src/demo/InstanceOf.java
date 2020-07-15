package demo;

import java.util.ArrayList;
import java.util.Vector;

public class InstanceOf {
	public static void displayObjectClass(Object o) {
		System.out.println("对象是 " + o.getClass() + " 类的实例");
        if (o instanceof Vector)
            System.out.println("对象是 java.util.Vector 类的实例");
        else if (o instanceof ArrayList)
            System.out.println("对象是 java.util.ArrayList 类的实例");
        else
            System.out.println("对象是 " + o.getClass() + " 类的实例");
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Object testObject = new ArrayList();
        displayObjectClass(testObject);
	}

}
