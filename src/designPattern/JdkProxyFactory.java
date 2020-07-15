package designPattern;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 
 * TODO 通过工厂生成代理对象 2018年10月10日下午6:42:00
 */
public class JdkProxyFactory {
	// 成员变量
	private Object target;// 被代理的对象
	// 使用有参数的构造方法设置代理对象

	public JdkProxyFactory(Object target) {
		this.target = target;
	}

	public Object getProxyObject() {
		return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(),
				new InvocationHandler() {
					public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
						System.out.println("开始代理"); // 增强实现
						Object result = method.invoke(target, args);
						System.out.println("代理结束"); // 增强实现
						return result;
					}
				});
	}
}