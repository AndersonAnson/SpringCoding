package reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import org.junit.Test;

public class ReflectionTest {
	@Test
	public void test() {
		Person p1 = new Person("tom", 11);
		System.out.println(p1.toString());
		p1.show();
	}

	@Test
	public void test2() throws Exception {
		Class clazz = Person.class;
//		通过反射创建person类对象
		Constructor cons = clazz.getConstructor(String.class, int.class);
		Object obj = cons.newInstance("tom2", 15);
		Person p = (Person) obj;
		System.out.println(p.toString());
//		通过反射调用对象指定的属性 方法
		Field age = clazz.getDeclaredField("age");
		age.set(p, 18);
		System.out.println(p.toString());
//		通过反射调用方法
		Method m = clazz.getDeclaredMethod("show");
		m.invoke(p);
	}

	@Test
	public void test3() {

	}

	{
		System.out.println("hello");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Class<ReflectionTest> clazz=ReflectionTest.class;
		try {
			ReflectionTest obj=clazz.newInstance();
		} catch (InstantiationException | IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
