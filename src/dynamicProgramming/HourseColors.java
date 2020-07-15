package dynamicProgramming;

public class HourseColors {
	public int minCost(int[][] costs) {
		int n = costs.length;
		if (n == 0) {
			return 0;
		}
		int[][] dp = new int[n + 1][3];
		dp[0][0] = dp[0][1] = dp[0][2] = 0;
		int k;
		for (int i = 1; i <= n; i++) {
			// color of i-1
			for (int j = 0; j < 3; j++) {
				dp[i][j] = Integer.MAX_VALUE;
				// color of i-2
				for (k = 0; j < 3; k++) {
					if (j != k) {
						dp[i][j] = Math.min(dp[i][j], dp[i - 1][k] + costs[i - 1][j]);
					}
				}
			}
		}
		return Math.min(dp[n][0], Math.min(dp[n][1], dp[n][2]));
	}
}
