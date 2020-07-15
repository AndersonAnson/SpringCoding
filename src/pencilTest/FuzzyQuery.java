package pencilTest;

import java.util.Scanner;

public class FuzzyQuery {
	public static final String[] pattern = { "surprise", "happy", "ctrip", "travel", "wellcome", "student", "system",
			"program", "editor" };

	public static int minDistance(String s1, String s2) {
		int m = s1.length(), n = s2.length();
		int[][] dp = new int[m + 1][n + 1];
		for (int i = 1; i <= m; i++) {
			dp[i][0] = i;
		}
		for (int j = 1; j <= n; j++) {
			dp[0][j] = j;
		}
		for (int i = 1; i <= m; i++) {
			for (int j = 1; j <= n; j++) {
				if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
					dp[i][j] = dp[i - 1][j - 1];
				} else {
					dp[i][j] = Math.min(dp[i - 1][j] + 1, Math.min(dp[i][j - 1] + 1, dp[i - 1][j - 1] + 1));
				}
			}

		}
		return dp[m][n];
	}
//	public static int minDistance(String str1, String str2) {
//		int lenStr1 = str1.length();
//		int lenStr2 = str2.length();
//		int[][] d = new int[lenStr1 + 1][lenStr2 + 1];
//		if (str1.length() * str2.length() == 0) {
//			return lenStr1 * lenStr2;
//		}
//		for (int i = 0; i < lenStr1 + 1; i++) {
//			d[i][0] = i;
//		}
//		for (int j = 0; j < lenStr2 + 1; j++) {
//			d[0][j] = j;
//		}
//		for (int i = 1; i < lenStr1 + 1; i++) {
//			for (int j = 1; j < lenStr2 + 1; j++) {
//				int left = d[i - 1][j] + 1;
//				int down = d[i][j - 1] + 1;
//				int leftDown = d[i - 1][j - 1];
//				if (str1.charAt(i - 1) != str2.charAt(j - 1)) {
//					leftDown = leftDown + 1;
//				}
//				d[i][j] = Math.min(left, Math.min(down, leftDown));
//			}
//		}
//		return d[lenStr1][lenStr2];
//	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int min = Integer.MAX_VALUE;
		while (true) {
			String str = in.next();
			for (int i = 0; i < pattern.length; i++) {
				int count = minDistance(str, pattern[i]);
				if (count <= 2) {
					System.out.println(pattern[i]);
				}
//				min = Math.min(min, count);
			}
			System.out.println(new String(""));
		}
	}

}
