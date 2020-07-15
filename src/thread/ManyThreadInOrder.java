package thread;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

//要求多线程之间按顺序调用实现abc依次执行
class ShareResource {
	private int number = 1;
	private Lock lock = new ReentrantLock();
	private Condition c1 = lock.newCondition();
	private Condition c2 = lock.newCondition();
	private Condition c3 = lock.newCondition();

	// 判断
	public void printFive() {
		lock.lock();
		try {
			while (number != 1) {
				c1.await();
			}
			// 干活
			for (int i = 1; i < 5; i++) {
				System.out.println(Thread.currentThread().getName() + "\t" + i);
			}
			// 通知
			number = 2;// 修改标志位
			c2.signal();
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			lock.unlock();
		}
	}

	public void printTen() {
		lock.lock();
		try {
			while (number != 2) {
				c2.await();
			}
			// 干活
			for (int i = 1; i < 10; i++) {
				System.out.println(Thread.currentThread().getName() + "\t" + i);
			}
			// 通知
			number = 3;// 修改标志位
			c3.signal();
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			lock.unlock();
		}
	}

	public void printFiften() {
		lock.lock();
		try {
			while (number != 3) {
				c3.await();
			}
			// 干活
			for (int i = 1; i < 15; i++) {
				System.out.println(Thread.currentThread().getName() + "\t" + i);
			}
			// 通知
			number = 1;// 修改标志位
			c1.signal();
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			lock.unlock();
		}
	}
}

public class ManyThreadInOrder {
	public static void main(String[] args) {
		ShareResource sr = new ShareResource();
		new Thread(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				for (int i = 1; i <= 1; i++) {
					sr.printFive();
				}
			}

		}).start();
		new Thread(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				for (int i = 1; i <= 1; i++) {
					sr.printTen();
				}
			}

		}).start();
		new Thread(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				for (int i = 1; i <= 1; i++) {
					sr.printFiften();
				}
			}

		}).start();
	}
}
