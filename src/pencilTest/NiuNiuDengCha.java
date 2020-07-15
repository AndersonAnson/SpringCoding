package pencilTest;

import java.util.Arrays;
import java.util.Scanner;

public class NiuNiuDengCha {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long[] a = new long[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextLong();
		}
		int flag = 0;
		long[] dp = new long[a.length - 1];
		for (int i = 0; i <= a.length - 2; i++) {
			if (a[i + 1] - a[i] <= 0) {
				flag = -1;
				break;
			}
			dp[i] = a[i + 1] - a[i];
		}
		Arrays.sort(dp);
		int i = 1;
		for (; i < dp.length; i++) {
			if (dp[i] == 0 || dp[i] % dp[0] != 0) {
				flag = -1;
				break;
			} else {
				continue;
			}
		}
		if (flag == -1) {
			System.out.println(-1);
		} else {
			System.out.println(dp[0]);
		}
	}

}
