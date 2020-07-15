package math;

public class MyPow {
	public double myPow(double x, int n) {
		long N = n;
		if (N < 0) {
			x = 1 / x;
			N = -N;
		}
		double ans;
		ans = Math.pow(x, N);
		return ans;
	}
}
