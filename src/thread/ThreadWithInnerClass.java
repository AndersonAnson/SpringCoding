package thread;

public class ThreadWithInnerClass {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t = new Thread() {
			public void run() {
				int i = 1;
				for (; i < 200; i++) {
					System.out.println(i);
				}
			}
		};
		t.start();
	}

}
