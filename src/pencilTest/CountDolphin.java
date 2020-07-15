package pencilTest;

import java.util.Scanner;

public class CountDolphin {
	public static long[] dp;

	static long countDolphin(int n, int m, int[] birthYear, int x) {
		dp = new long[x + 1];
		return count(n, x, birthYear);
	}

	static boolean judge(int year, int[] birthYear) {
		for (int i = 0; i < birthYear.length; i++) {
			if (year == birthYear[i]) {
				return true;
			}
		}
		return false;
	}

	static long count(int n, int year, int[] birthYear) {
		if (year == 0) {
			return n;
		}
		if (judge(year, birthYear)) {
			dp[year] = count(n, year - 1, birthYear) + count(n, year - 1, birthYear);
		}
		dp[year] = count(n, year - 1, birthYear);
		return 0;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		long res;

		int _n;
		_n = Integer.parseInt(in.nextLine().trim());

		int _m;
		_m = Integer.parseInt(in.nextLine().trim());

		int _birthYear_size = 0;
		_birthYear_size = Integer.parseInt(in.nextLine().trim());
		int[] _birthYear = new int[_birthYear_size];
		int _birthYear_item;
		for (int _birthYear_i = 0; _birthYear_i < _birthYear_size; _birthYear_i++) {
			_birthYear_item = Integer.parseInt(in.nextLine().trim());
			_birthYear[_birthYear_i] = _birthYear_item;
		}

		int _x;
		_x = Integer.parseInt(in.nextLine().trim());

		res = countDolphin(_n, _m, _birthYear, _x);
		System.out.println(String.valueOf(res));

	}
}
