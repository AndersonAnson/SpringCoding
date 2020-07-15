package designPattern.singleton;

public class SingletonLazyMode {
	private static volatile SingletonLazyMode singletonLazyMode;

	private SingletonLazyMode() {

	}

	public static SingletonLazyMode getInstance() {
		if (singletonLazyMode == null) {
			synchronized (SingletonLazyMode.class) {
				if (singletonLazyMode == null) {//��volatile��ָֹ��������
					singletonLazyMode = new SingletonLazyMode();
				}
			}
		}
		return singletonLazyMode;
	}
}
