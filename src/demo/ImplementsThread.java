package demo;

public class ImplementsThread implements Runnable{
	private static Object lock = new Object(); //��
    private static int i = 1;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runnable r=new Runnable() {
			@Override
			public void run() {
				// TODO Auto-generated method stub
				while (true) {
	                synchronized (lock) {
	                    if ( i > 20) {
	                        System.out.println("��ӡ��ϣ�");
	                        lock.notify();
	                        return;
	                    }
	                    System.out.println("�߳�" + Thread.currentThread().getName() + "��ӡ��"  + i ++ );
	                    lock.notify();
	                    try {
	                        Thread.sleep(100);
	                        lock.wait();
	                    } catch (InterruptedException e) {
	                        e.printStackTrace();
	                    }
	                }
	            }
			}
			
		};
		Thread t1=new Thread(r);
		Thread t2=new Thread(r);
		t1.setDaemon(true);
		t1.start();
		t2.start();
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<10;i++) {
			System.out.println(i);
		}
	}

}
