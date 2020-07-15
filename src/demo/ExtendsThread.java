package demo;

public class ExtendsThread extends Thread{
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println(i);
		}
	}
	public static void main(String[] args) {
	    ExtendsThread mt = new ExtendsThread();
	    mt.start();
	    ExtendsThread mt2 = new ExtendsThread();
	    mt2.start();
	    Integer a=new Integer(22);
	    Integer b=new Integer(22);
//	    Integer a=12;
//	    Integer b=12;
	    System.out.println(a.equals(b));
	    System.out.println(a==b);
	}
}
