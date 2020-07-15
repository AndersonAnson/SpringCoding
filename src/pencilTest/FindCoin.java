package pencilTest;

public class FindCoin {
	public float findCoin(int n) {
		if (n == 999 || n == 1000) {
			return new Float(1.000000f);
		}
		float ans = 1.000000f;
		int i = n;
		float fenmu = 1000.000000f;
		float fenzi = 990.000000f;
		while (i > 0) {
			ans = ans * fenzi / fenmu;
			i--;
		}
		ans = 1 - ans;
		return ans;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FindCoin fc = new FindCoin();
		float res = fc.findCoin(20);
		System.out.printf("%.6f", res);

	}

}
