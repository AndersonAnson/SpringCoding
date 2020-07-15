package designPattern.singleton;

public class SingletonLazyMode {
	private static volatile SingletonLazyMode singletonLazyMode;

	private SingletonLazyMode() {

	}

	public static SingletonLazyMode getInstance() {
		if (singletonLazyMode == null) {
			synchronized (SingletonLazyMode.class) {
				if (singletonLazyMode == null) {//º”volatile∑¿÷π÷∏¡Ó÷ÿ≈≈–Ú
					singletonLazyMode = new SingletonLazyMode();
				}
			}
		}
		return singletonLazyMode;
	}
}
