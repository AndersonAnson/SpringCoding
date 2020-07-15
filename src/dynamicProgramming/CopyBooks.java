package dynamicProgramming;

public class CopyBooks {
	public int copyBooks(int[] pages, int k) {
		int n = pages.length;
		if (n == 0) {
			return 0;
		}
		int[][] dp = new int[k + 1][n + 1];
		int i, j, m;
		dp[0][0] = 0;
		for (i = 1; i <= n; i++) {
			dp[0][i] = Integer.MAX_VALUE;
		}
		for (m = 1; m <= k; m++) {
			dp[m][0] = 0;
			for (i = 1; i <= n; i++) {
				dp[m][i] = Integer.MAX_VALUE;
				int sum = 0;
				for (j = i; j >= 0; j--) {
					dp[m][i] = Math.min(dp[m][i], Math.max(dp[m - 1][j], sum));
					if (j > 0) {
						sum = sum + pages[j - 1];
					}
				}
			}
		}
		return dp[k][n];
	}

}
