package pencilTest;

import java.util.Scanner;

public class TreeUp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] weight = new int[n];
		int[][] edge = new int[n - 1][2];
		for (int i = 0; i < n; i++) {
			weight[i] = sc.nextInt();
		}
		for (int i = 0; i < n - 1; i++) {
			edge[i][0] = sc.nextInt();
			edge[i][1] = sc.nextInt();

		}
		sc.close();
		// dp[]
		int[] dp = new int[n];
		dp[0] = 1;
		// ±éÀúedge
		for (int i = 0; i < n - 1; i++) {
			int head = edge[i][0];
			int tail = edge[i][1];
			if (weight[head - 1] >= weight[tail - 1]) {
				dp[tail - 1] = dp[head - 1];
				continue;
			} else {
				dp[tail - 1] = dp[head - 1] + 1;
			}
		}
		int res = Integer.MIN_VALUE;
		for (int i = 0; i < dp.length; i++) {
			res = Math.max(res, dp[i]);
		}
		System.out.println(res);
	}

}
