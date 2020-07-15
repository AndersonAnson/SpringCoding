package thread;
//出啊杆件多线程的方式2：实现runnable接口
//创建一个实现了runnable接口的类
//实现run
//创建实现类的对象
//将此对象作为参数传递到thread类的构造器中，创建thread类的对象
//通过对象调用start方法
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
		Runnable mt=new MyThread();//接口的多态性
		Thread t1=new Thread(mt);
		t1.start();
		
	}
}

