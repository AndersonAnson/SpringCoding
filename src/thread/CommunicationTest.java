package thread;

import java.util.Arrays;
import java.util.List;

class Number implements Runnable {
	private int number = 1;

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while (true) {
			synchronized (this) {
				notify();
				if (number <= 100) {
					System.out.println(Thread.currentThread().getName() + ":" + number);
					number++;
					try {
						wait();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				} else {
					break;
				}
			}
		}
	}

}

public class CommunicationTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Number w = new Number();
		Thread t1 = new Thread(w);
		Thread t2 = new Thread(w);
//		t1.setName("线程1");
//		t2.setName("线程2");
//		t1.start();
//		t2.start();
		String[] a= {"a","b","c"};
		Arrays.asList(a);
		System.out.println(a[1]);
	}

}
