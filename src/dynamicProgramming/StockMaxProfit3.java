package dynamicProgramming;

public class StockMaxProfit3 {
	public int maxProfit(int[] prices) {
		// dp[i][j]表示在0，i区间里，状态为j的最大收益，j的含义是
		// 0表示还未开始交易 1表示第1次买入一只股票 2表示第1次卖出一只股票
		// 3表示第2次买入一只股票 4表示第2次卖出一只股票D
		int len = prices.length;
		if (len < 2)
			return 0;
		int[][] dp = new int[len][5];
		dp[0][0] = 0;
		dp[0][1] = -prices[0];
		for (int i = 0; i < dp.length; i++) {
			dp[i][3] = Integer.MIN_VALUE;
		}
		// 状态转移只有 2 种情况：
		// 情况 1：什么都不做
		// 情况 2：由上一个状态转移过来
		for (int i = 1; i < len; i++) {
			dp[i][0] = 0;
			dp[i][1] = Math.max(dp[i - 1][1], dp[i - 1][0] - prices[i]);
			dp[i][2] = Math.max(dp[i - 1][2], dp[i - 1][1] + prices[i]);
			dp[i][3] = Math.max(dp[i - 1][3], dp[i - 1][2] - prices[i]);
			dp[i][4] = Math.max(dp[i - 1][4], dp[i - 1][3] + prices[i]);
		}
		// 最大值只发生在不持股的时候，因此来源有 3 个：j = 0 ,j = 2, j = 4
		int res = Math.max(0, Math.max(dp[len - 1][2], dp[len - 1][4]));
		return res;
	}
}
