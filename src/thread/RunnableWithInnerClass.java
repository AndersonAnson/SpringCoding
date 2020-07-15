package thread;

public class RunnableWithInnerClass {
	public static void main(String[] args) {
		Thread t=new Thread(new Runnable() {
			int i = 1;

			@Override
			public void run() {
				// TODO Auto-generated method stub
				for (; i < 100; i++) {
					System.out.println(i);
				}
			}

		});
		t.start();//创建接口的匿名实现类的有名对象
//		System.out.println(new Integer(10).hashCode());
	}
}
