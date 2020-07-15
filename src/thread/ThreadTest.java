package thread;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class ThreadTest extends Thread {
	public void run() {
		System.out.println(Thread.currentThread().getName());
		int i = 1;
		for (; i < 100; i++) {
			if (i % 2 == 0) {
//				System.out.println(i);
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		新建线程
//		继承Thread类 重写run方法 在main线程中创建子类对象 然后调用start方法就行了
		ThreadTest t1 = new ThreadTest();
		ThreadTest t2 = new ThreadTest();
//		start方法会启动当前线程和调用当前线程的run方法
//		我们不能通过直接调用run方法启动线程 必须要用start方法
//		不可以让已经(start)方法的再调用start方法的线程 会报异常
		t1.start();
		t2.start();
		System.out.println(Thread.currentThread().getName());
		for (int i=1; i < 100; i++) {
			if (i % 2 == 0) {
//				System.out.println(i);
			}
		}
		List<Integer> arr=new ArrayList<Integer>();
		arr.add(1);
		arr.add(2);
		System.out.print(arr);
		arr.toArray();
		System.out.print(arr);
	}

}
