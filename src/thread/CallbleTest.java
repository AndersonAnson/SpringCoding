package thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

class MyCallable implements Callable<String> {

	@Override
	public String call() throws Exception {
//		System.out.println(Thread.currentThread().getName());
		// TODO Auto-generated method stub
		return "this is callble method";
	}

}

public class CallbleTest {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		MyCallable mc = new MyCallable();
		FutureTask<String> ft = new FutureTask<>(mc);
		Thread t = new Thread(ft);
		t.start();
	}

}
