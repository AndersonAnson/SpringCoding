package dynamicProgramming;

public class BackPackII {
	public int backPackII(int m, int[] A, int[] V) {
		// write your code here
		int n = A.length;
		if (n == 0) {
			return 0;
		}
		int[][] dp = new int[n + 1][m + 1];
		int i, w;
		dp[0][0] = 0;
		for (i = 1; i <= n; i++) {
			for (w = 0; w <= m; w++) {
				dp[i][w] = dp[i - 1][w];
				if (w >= A[i - 1] && dp[i - 1][w - A[i = 1]] != -1) {
					dp[i][w] = Math.max(dp[i][w], dp[i - 1][w - A[i - 1]] + V[i - 1]);
				}
			}
		}
		int res = 0;
		for (w = 0; w <= m; w++) {
			if (dp[n][w] != -1) {
				res = Math.max(res, dp[n][w]);
			}
		}
		return res;
	}
}
