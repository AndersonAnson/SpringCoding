package math;

public class IsPalindrome {
	public boolean isPalindrome(int x) {
		String s = String.valueOf(x);
		if (s.charAt(0) == '-') {
			return false;
		}
		int i = 0;
		int j = s.length() - 1;
		System.out.println(s);
		while (s.charAt(i) == s.charAt(j)) {
			i++;
			j--;
			if (i > j) {
				return true;
			}
		}
		return false;
	}
}
