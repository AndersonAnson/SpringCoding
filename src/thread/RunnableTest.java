package thread;
//�����˼����̵߳ķ�ʽ2��ʵ��runnable�ӿ�
//����һ��ʵ����runnable�ӿڵ���
//ʵ��run
//����ʵ����Ķ���
//���˶�����Ϊ�������ݵ�thread��Ĺ������У�����thread��Ķ���
//ͨ���������start����
class MyThread implements Runnable{
	@Override
	public void run() {
		// TODO Auto-generated method stub
		Thread.currentThread().setName("MyThread2");
		int i = 1;
		for (; i < 100; i++) {
			if (i % 2 != 0) {
				System.out.println(Thread.currentThread().getName() + " " + i);
			}
		}
	}
}
public class RunnableTest{
	public static void main(String[] args) {
		Runnable mt=new MyThread();//�ӿڵĶ�̬��
		Thread t1=new Thread(mt);
		t1.start();
		
	}
}

