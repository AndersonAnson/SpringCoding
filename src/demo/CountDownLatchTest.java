package demo;

import java.util.concurrent.CountDownLatch;

public class CountDownLatchTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final CountDownLatch latch=new CountDownLatch(2);
		latch.countDown();
	}

}
