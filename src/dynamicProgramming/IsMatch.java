package dynamicProgramming;

public class IsMatch {
	public boolean isMatch(String s, String p) {
		char[] A = s.toCharArray();
		char[] B = p.toCharArray();
		int i, j;
		int m = A.length;
		int n = B.length;
		boolean[][] dp = new boolean[m + 1][n + 1];
		for (i = 0; i <= m; i++) {
			for (j = 0; j <= n; j++) {
				if (i == 0 && j == 0) {
					dp[i][j] = true;
					continue;
				}
				if (j == 0) {
					dp[i][j] = false;
					continue;
				}
				dp[i][j] = false;
				if (B[j - 1] != '*') {
					if (i > 0 && (B[j - 1] == '.' || A[i - 1] == B[j - 1])) {
						dp[i][j] = dp[i - 1][j - 1];
					}
				} else {
					if (j > 1) {
						dp[i][j] |= dp[i][j - 2];
					}
					if (i > 0 && j > 1) {
						if (B[j - 2] == '.' || A[i - 1] == B[j - 2]) {
							dp[i][j] |= dp[i - 1][j];
						}
					}
				}
			}
		}
		return dp[m][n];
	}
}
