package demo;

import java.util.ArrayList;
import java.util.Vector;

public class InstanceOf {
	public static void displayObjectClass(Object o) {
		System.out.println("������ " + o.getClass() + " ���ʵ��");
        if (o instanceof Vector)
            System.out.println("������ java.util.Vector ���ʵ��");
        else if (o instanceof ArrayList)
            System.out.println("������ java.util.ArrayList ���ʵ��");
        else
            System.out.println("������ " + o.getClass() + " ���ʵ��");
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Object testObject = new ArrayList();
        displayObjectClass(testObject);
	}

}
