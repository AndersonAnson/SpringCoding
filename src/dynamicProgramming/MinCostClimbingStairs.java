package dynamicProgramming;

public class MinCostClimbingStairs {
	public int minCostClimbingStairs(int[] cost) {
		// F[i]表示前i个阶梯的最小花费
		// F[i]=F[i-2]+cost[i]或者F[i]=F[i-1]+cost[i]取两个的最小值
		int[] dp = new int[cost.length];
		dp[0] = cost[0];
		dp[1] = cost[1];
		for (int i = 2; i < dp.length; i++) {
			dp[i] = Math.min(dp[i - 2] + cost[i], dp[i - 1] + cost[i]);
		}
		if (dp[dp.length - 1] > dp[dp.length - 2]) {
			return dp[dp.length - 2];
		}
		return dp[dp.length - 1];
	}
}
