package string;

public class IsPalindrome {
	public boolean isPalindrome(String s) {
		if (s.length() == 0 || s.isEmpty()) {
			return true;
		}
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < s.length(); i++) {
			if ((s.charAt(i) >= 48 && s.charAt(i) <= 57) || (s.charAt(i) >= 65 && s.charAt(i) <= 90)
					|| (s.charAt(i) >= 97 && s.charAt(i) <= 122)) {
				sb.append(s.charAt(i));
			}
		}
		String unreverse = sb.toString();
		String reverse = sb.reverse().toString();
		if (unreverse.equalsIgnoreCase(reverse)) {
			return true;
		}
		return false;
	}
}
