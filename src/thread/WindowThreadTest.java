package thread;

class Window extends Thread {
	private static int ticket = 100;
	private static Object obj = new Object();

	public void run() {
		while (true) {
			synchronized (Window.class) {
				if (Window.ticket > 0) {
					System.out.println(this.getName() + "ÂôÆ± Æ±ºÅÎª" + Window.ticket);
					Window.ticket--;
				} else {
					break;
				}
			}
		}
	}
}

public class WindowThreadTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Window w1 = new Window();
		Window w2 = new Window();
		Window w3 = new Window();
		w1.setName("´°¿Ú1");
		w2.setName("´°¿Ú2");
		w3.setName("´°¿Ú3");
		w1.start();
		w2.start();
		w3.start();
	}

}
