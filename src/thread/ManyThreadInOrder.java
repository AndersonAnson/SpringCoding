package thread;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

//Ҫ����߳�֮�䰴˳�����ʵ��abc����ִ��
class ShareResource {
	private int number = 1;
	private Lock lock = new ReentrantLock();
	private Condition c1 = lock.newCondition();
	private Condition c2 = lock.newCondition();
	private Condition c3 = lock.newCondition();

	// �ж�
	public void printFive() {
		lock.lock();
		try {
			while (number != 1) {
				c1.await();
			}
			// �ɻ�
			for (int i = 1; i < 5; i++) {
				System.out.println(Thread.currentThread().getName() + "\t" + i);
			}
			// ֪ͨ
			number = 2;// �޸ı�־λ
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
			// �ɻ�
			for (int i = 1; i < 10; i++) {
				System.out.println(Thread.currentThread().getName() + "\t" + i);
			}
			// ֪ͨ
			number = 3;// �޸ı�־λ
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
			// �ɻ�
			for (int i = 1; i < 15; i++) {
				System.out.println(Thread.currentThread().getName() + "\t" + i);
			}
			// ֪ͨ
			number = 1;// �޸ı�־λ
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
