package math;

import java.util.Arrays;

public class CountPrimes {
	public int countPrimes(int n) {
		// 用厄拉多塞筛选法。
		boolean[] isPrim = new boolean[n];
		Arrays.fill(isPrim, true);
		for (int i = 2; i * i < n; i++) {
			if (isPrim[i] == true) {
				for (int j = i * i; j < n; j = j + i) {
					isPrim[j] = false;
				}
			}
		}
		int count = 0;
		for (int i = 2; i < n; i++) {
			if (isPrim[i] == true) {
				count++;
			}
		}
		return count;
	}
}
