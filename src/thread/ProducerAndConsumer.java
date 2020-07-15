package thread;

//�������̺߳��������߳�
//������������Ʒ
class Clerk {
	private int productCount = 0;

	public synchronized void produceProduct() {// ͬ����������this ȷ�����µķ���Ҳ����һ����
		if (productCount < 20) {
			productCount++;
			System.out.println(Thread.currentThread().getName() + "��ʼ������" + productCount);
			this.notify();
		} else {
			try {
				this.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public synchronized void comsumeProduct() {
		if (productCount > 0) {
			System.out.println(Thread.currentThread().getName() + "��ʼ���ѵ�" + productCount);
			productCount--;
			this.notify();
		} else {
			try {
				this.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

class Producer implements Runnable {
	private Clerk clerk;

	public Producer(Clerk clerk) {
		super();
		this.clerk = clerk;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println(Thread.currentThread().getName() + "��ʼ������Ʒ");
		while (true) {
			clerk.produceProduct();
		}
	}

}

class Consumer implements Runnable {
	private Clerk clerk;

	public Consumer(Clerk clerk) {
		super();
		this.clerk = clerk;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println(Thread.currentThread().getName() + "��ʼ���Ѳ�Ʒ");
		while (true) {
			clerk.comsumeProduct();
		}
	}

}

public class ProducerAndConsumer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Clerk clerk = new Clerk();
		Producer p1 = new Producer(clerk);
		Consumer c1 = new Consumer(clerk);
		Thread t1 = new Thread(p1);
		Thread t2 = new Thread(c1);
		t1.start();
		t2.start();
	}

}
