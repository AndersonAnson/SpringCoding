package thread;

public class ThreadDemo {
	static MyThread1 t1 = new MyThread1();
	static MyThread2 t2 = new MyThread2();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		try {
//			Thread.sleep(10000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		int a=t1.getPriority();
		System.out.println(a);
		t1.start();
		t2.start();
		Thread.currentThread().setName("mainThread");
		int i = 1;
		for (; i < 100; i++) {
			if (i % 2 != 0) {
				System.out.println(Thread.currentThread().getName() + " " + i);
			}
			if (i == 49) {
				try {
					
					t1.join();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}

		new Thread() {
			public void run() {
				System.out.println(Thread.currentThread().getName());
				int i = 1;
				for (; i < 100; i++) {
					if (i % 2 == 0) {
						System.out.println(i);
					}
					if(i==50) {
						Thread.yield();
					}
				}
			}
		}.start();
		new Thread() {
			public void run() {
				System.out.println(Thread.currentThread().getName());
				int i = 1;
				for (; i < 100; i++) {
					if (i % 2 != 0) {
						System.out.println(i);
					}
				}
			}
		}.start();
	}

}

class MyThread1 extends Thread {
	public void run() {
		Thread.currentThread().setName("MyThread1");
		int i = 1;
		for (; i < 100; i++) {
			if (i % 2 == 0) {
				System.out.println(Thread.currentThread().getName() + " " + i);
			}
			if (i == 50) {
				try {

					ThreadDemo.t2.join();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
}

class MyThread2 extends Thread {
	public void run() {
		Thread.currentThread().setName("MyThread2");
		int i = 1;
		for (; i < 100; i++) {
			if (i % 2 != 0) {
				System.out.println(Thread.currentThread().getName() + " " + i);
			}
		}
	}
}