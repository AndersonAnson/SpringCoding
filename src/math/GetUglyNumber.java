package math;

public class GetUglyNumber {
	public int GetUglyNumber_Solution(int index) {
		if (index == 1)
			return 0;
		if (index == 0)
			return 0;
		int[] dp = new int[index];
		dp[0] = 1;
		int i2 = 0, i3 = 0, i5 = 0;
		for (int i = 1; i < index; i++) {
			int min = Math.min(2 * dp[i2], Math.min(3 * dp[i3], 5 * dp[i5]));
			if (min == dp[i2] * 2) {
				i2++;
			}
			if (min == dp[i3] * 3) {
				i3++;
			}
			if (min == dp[i5] * 5) {
				i5++;
			}
			dp[i] = min;
		}
		return dp[index - 1];
	}

	public static boolean adjustUglyNumber(int num) {
		if (num == 1 || num == 2 || num == 3 || num == 5) {
			return true;
		} else {
			if (num % 2 == 0) {
				return adjustUglyNumber(num = num / 2);
			}
			if (num % 3 == 0) {
				return adjustUglyNumber(num = num / 3);
			}
			if (num % 5 == 0) {
				return adjustUglyNumber(num = num / 5);
			}
		}
		return false;
	}
}
