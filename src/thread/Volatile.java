package thread;

public class Volatile {
	public volatile static int t = 0;

	public static void main(String[] args) {

		Thread[] threads = new Thread[10];
		for (int i = 0; i < 10; i++) {
			// ÿ���̶߳�t����1000�μ�1�Ĳ���
			threads[i] = new Thread(new Runnable() {

				@Override
				public void run() {
					for (int j = 0; j < 1000; j++) {
						t = t + 1;
					}
				}
			});
			threads[i].start();
		}

		// �ȴ������ۼ��̶߳�����
		while (Thread.activeCount() > 1) {
			Thread.yield();
		}

		// ��ӡt��ֵ
		System.out.println(t);
	}
}
