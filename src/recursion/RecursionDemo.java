package recursion;

public class RecursionDemo {
//	阶乘问题
	public static int factorial(int n) {
		if (n == 1) {
			return 1;
		} else {
			return factorial(n - 1) * n;
		}
	}

//	打印问题
	public static void test(int n) {
		if (n > 2) {
			test(n - 1);
		}
		System.out.println("n=" + n);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RecursionDemo.test(10);
		int a = RecursionDemo.factorial(5);
		System.out.println("a=" + a);
	}

}
