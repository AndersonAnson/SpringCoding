package dynamicProgramming;

import java.util.Arrays;

public class NumSquares {
	public int numSquares(int n) {
		// dp[n]=min(dp(n-k)+1)k是n之前的穷举完全平方数
		int[] dp = new int[n + 1];
		Arrays.fill(dp, Integer.MAX_VALUE);
		dp[0] = 0;
		int maxSquareIndex = (int) Math.sqrt(n) + 1;
		int[] square = new int[maxSquareIndex];
		for (int i = 1; i < square.length; i++) {
			square[i] = i * i;
		}
		for (int i = 1; i < dp.length; i++) {
			for (int j = 1; j < maxSquareIndex; j++) {
				if (i < square[j]) {
					break;
				}
				dp[i] = Math.min(dp[i], dp[i - square[j]] + 1);
			}
		}
		return dp[n];
	}
	public static void main(String[] args) {
		System.out.println((int)Math.floor(Math.sqrt(15)));
	}
}
