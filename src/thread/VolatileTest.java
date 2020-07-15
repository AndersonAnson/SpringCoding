package thread;

public class VolatileTest {
	public static volatile int race =0;
	public synchronized static void increase() {
		race++;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread[] threads=new Thread[20];
		for(int i=0;i<20;i++) {
			threads[i]=new Thread(new Runnable() {
				public void run() {
					for(int i=0;i<10000;i++) {
						increase();
					}
				}
			});
			threads[i].start();
		}
		while(Thread.activeCount()>1) {
			Thread.yield();
		}
		System.out.print(race);
	}

}
