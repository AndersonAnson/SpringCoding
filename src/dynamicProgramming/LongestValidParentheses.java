package dynamicProgramming;

public class LongestValidParentheses {
	public int longestValidParentheses(String s) {
		// dp表示前i个字符结尾的最长有效子字符串长度
		// 如果是）那么dp[i]=dp[i-2]+2;
		// 如果是）并且s[i-1]=')',那么dp[i]=dp[i-1]+dp[i-dp[i-1]-2]+2
		char[] arr = s.toCharArray();
		int max = 0;
		int[] dp = new int[arr.length];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] == ')') {
				if (arr[i - 1] == '(') {
					if (i >= 2) {
						dp[i] = dp[i - 2] + 2;
					} else {
						dp[i] = 2;
					}
				} else if (i - dp[i - 1] > 0 && arr[i - dp[i - 1] - 1] == '(') {
					if ((i - dp[i - 1]) >= 2) {
						dp[i] = dp[i - 1] + dp[i - dp[i - 1] - 2] + 2;
					} else {
						dp[i] = dp[i - 1] + 2;
					}
				}
				max = Math.max(max, dp[i]);
			}
		}
		return max;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
