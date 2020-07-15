package collection;

public class IntToRoman {
	public String intToRoman(int num) {
		int[] values = { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };
		String[] strs = { "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" };
		StringBuilder ans = new StringBuilder();
		for (int i = 0; i < values.length; i++) {
			int a = num / values[i];
			if (a == 0) {
				continue;
			}
			for (int j = a; j > 0; j--) {
				ans.append(strs[i]);
			}
			num = num - (a * values[i]);
			if (num == 0)
				break;
		}
		return ans.toString();
	}
}
