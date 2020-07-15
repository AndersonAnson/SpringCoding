package thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

//问题：卖票过程中出现了重票、错票 出现了线程安全问题
class Window2 implements Runnable {
	private int ticket = 100;

	public void run() {

		while (true) {
			synchronized (this) {
				if (ticket > 0) {
					System.out.println(Thread.currentThread().getName() + "卖票 票号为" + ticket);
					ticket--;
				} else {
					break;
				}

			}
		}

	}

}

public class WindowRunnableTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Window2 w = new Window2();
//		Thread t1 = new Thread(w);
//		Thread t2 = new Thread(w);
//		Thread t3 = new Thread(w);
//		t1.setName("窗口1");
//		t2.setName("窗口2");
//		t3.setName("窗口3");
//		t1.start();
//		t2.start();
//		t3.start();
		ExecutorService e=Executors.newFixedThreadPool(10);
		ExecutorService e2=Executors.newScheduledThreadPool(10);
		e2.execute(new Window2());
	}

}
