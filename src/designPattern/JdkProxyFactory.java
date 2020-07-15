package designPattern;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 
 * TODO ͨ���������ɴ������ 2018��10��10������6:42:00
 */
public class JdkProxyFactory {
	// ��Ա����
	private Object target;// ������Ķ���
	// ʹ���в����Ĺ��췽�����ô������

	public JdkProxyFactory(Object target) {
		this.target = target;
	}

	public Object getProxyObject() {
		return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(),
				new InvocationHandler() {
					public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
						System.out.println("��ʼ����"); // ��ǿʵ��
						Object result = method.invoke(target, args);
						System.out.println("�������"); // ��ǿʵ��
						return result;
					}
				});
	}
}