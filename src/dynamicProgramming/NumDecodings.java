package dynamicProgramming;

public class NumDecodings {
	public int numDecodings(String s) {
		// write your code here
		char[] arr = s.toCharArray();
		int n = arr.length;
		if (n == 0) {
			return 1;
		}
		int[] dp = new int[n + 1];
		dp[0] = 1;
		for (int i = 1; i <= n; i++) {
			dp[i] = 0;
			if (arr[i - 1] >= '1' && arr[i - 1] <= '9') {
				dp[i] = dp[i] + dp[i - 1];
			}
			if (i > 1) {
				int j = 10 * (arr[i - 2] - '0') + arr[i - 1] - '0';
				if (j >= 10 && j <= 26) {
					dp[i] = dp[i] + dp[i - 2];
				}
			}
		}
		return dp[n];
	}
}
