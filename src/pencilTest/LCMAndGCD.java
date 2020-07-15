package pencilTest;

import java.util.Scanner;

public class LCMAndGCD {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int lcm = Integer.MAX_VALUE;
		int gcd = Integer.MIN_VALUE;
		int res = Integer.MIN_VALUE;
		for (int a = n / 2; a <= n; a++) {
			for (int b = a; b <= n; b++) {
				if (b > a) {
					int temp = b;
					b = a;
					a = temp;
				}
				for (int i = 1; i <= b; i++) {
					if (b % i == 0 && a % i == 0) {
						gcd = i;
					}
				}
				lcm = a * b / gcd;
				res = Math.max(res, lcm - gcd);
			}
		}
		System.out.println(res);
	}
}
