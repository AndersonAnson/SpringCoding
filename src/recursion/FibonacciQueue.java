package recursion;

public class FibonacciQueue {
	public int Fibonacci(int n) {
		if (n == 1) {
			return 1;
		}
		if (n == 2) {
			return 1;
		}
		return Fibonacci(n - 1) + Fibonacci(n - 2);
	}
}
