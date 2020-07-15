package math;

public class TrailingZeroes {
	public int trailingZeroes(int n) {
		int c = (int) (Math.log(n) / Math.log(5));
		int ans = 0;
		for (int i = 1; i <= c; i++) {
			int d = (int) (Math.pow(5, i));
			ans += n / d;
		}
		return ans;
	}
}
