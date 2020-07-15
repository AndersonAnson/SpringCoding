package thread;

class Share implements Runnable {
	boolean lockFormer;
	static Object o1 = new Object();
	static Object o2 = new Object();

	Share(boolean lockFormer) {
		this.lockFormer = lockFormer;
	}

	@Override
	public void run() {
		if (this.lockFormer) {
			synchronized (o1) {
				try {
					System.out.println("o1 want o2");
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				synchronized (o2) {
					System.out.println("1ok");
				}
			}
		} else {
			synchronized (o2) {
				try {
					System.out.println("o2 want o1");
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				synchronized (o1) {
					System.out.println("1ok");
				}
			}
		}

	}
}

public class DeadLock {
	public static void main(String[] args) {
		Thread t1 = new Thread(new Share(true));
		Thread t2 = new Thread(new Share(false));
		t1.start();
		t2.start();
	}
}
