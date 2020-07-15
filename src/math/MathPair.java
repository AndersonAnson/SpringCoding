package math;

import java.util.Scanner;

public class MathPair {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		long n = in.nextInt();
		long k = in.nextInt();
		long count = 0;
		if (k == 0) {
			count = n * n;
		} else {
			// 余数要大于k,除数一定是从k+1开始的。
			for (long y = k + 1; y <= n; y++) {
				// 余数是从0到y-1循环的，
				// 对于每个y值，x从1到n包含n/y个余数循环,
				// 每个余数循环中只有y-k个符合条件的。
				count += (n / y) * (y - k);
				// 剩下一个不完整的余数循环，判断这部分最大的余数是否大于k
				if (n % y >= k)
					count += n % y - k + 1;
			}
		}
		System.out.println(count);
	}
}
