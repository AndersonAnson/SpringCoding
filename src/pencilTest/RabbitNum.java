package pencilTest;

import java.util.Scanner;

public class RabbitNum {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int res = 0;
		int old = 2;
		int flag1 = 0;
		int flag2 = 0;
		int flag3 = 0;
		int flag4 = 0;
		int flag5 = 0;
		for (int i = 1; i < n; i++) {
			old = old + flag5;
			flag5 = flag4;
			flag4 = flag3;
			flag3 = flag2;
			flag2 = flag1;
			if (i % 5 == 0) {
				flag1 = old;// 请出生的兔子数量与old数量一致
			}

		}
		res = old + flag1 + flag2 + flag3 + flag4 + flag5;
		System.out.println(res);
	}

	public static int Fibonacci(int n) {
		if (n == 1 || n == 2 || n == 3 || n == 4) {
			return 1;
		} else {
//			定义好了两个初始值
			return Fibonacci(n - 1) + Fibonacci(n - 2);
		}
	}

}