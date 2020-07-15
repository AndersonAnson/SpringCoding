package thread;

import java.util.concurrent.locks.ReentrantLock;

class Window3 implements Runnable {
	private int ticket = 100;
	private ReentrantLock lock = new ReentrantLock();

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while (true) {
			try {
				lock.lock();
				if (ticket > 0) {
					System.out.println(Thread.currentThread().getName() + "卖票 票号为" + ticket);
					ticket--;
				} else {
					break;
				}
			} finally {
				//解锁
				lock.unlock();
			}

		}
	}

}

public class LockTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Window3 w = new Window3();
		Thread t1 = new Thread(w);
		Thread t2 = new Thread(w);
		Thread t3 = new Thread(w);
		t1.setName("窗口1");
		t2.setName("窗口2");
		t3.setName("窗口3");
		t1.start();
		t2.start();
		t3.start();
	}

}
