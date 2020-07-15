package dynamicProgramming;

public class NumDecodings2 {
	public int numDecodings(String s) {
		// 设dp[i]表示前i个字符串有多少种解码总数
		// 有两种选择 和前面的拼或者不拼
		// 拼的话dp[i]=dp[i-2] 不拼的话dp[i]=dp[i-1]
		if (s.length() == 0) {
			return 1;
		}
		char[] arr = s.toCharArray();
		int n = arr.length;
		int[] dp = new int[n + 1];
		dp[0] = 1;
		for (int i = 1; i <= n; i++) {
			dp[i] = 0;
			if (arr[i - 1] <= '9' && arr[i - 1] >= '1') {
				dp[i] = dp[i - 1];
			}
			if (i > 1) {
				int temp = 10 * (arr[i - 2] - '0') + arr[i - 1] - '0';
				if (temp <= 26 && temp >= 10) {
					dp[i] = dp[i] + dp[i - 2];
				}
			}
		}
		return dp[n];
	}

	public static void main(String[] args) {
		System.out.println(new NumDecodings2().numDecodings("226"));
	}
}
