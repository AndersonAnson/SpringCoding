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
//		�½��߳�
//		�̳�Thread�� ��дrun���� ��main�߳��д���������� Ȼ�����start����������
		ThreadTest t1 = new ThreadTest();
		ThreadTest t2 = new ThreadTest();
//		start������������ǰ�̺߳͵��õ�ǰ�̵߳�run����
//		���ǲ���ͨ��ֱ�ӵ���run���������߳� ����Ҫ��start����
//		���������Ѿ�(start)�������ٵ���start�������߳� �ᱨ�쳣
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
