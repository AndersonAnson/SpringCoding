package string;

public class IsIsomorphic {
	public boolean isIsomorphic(String s, String t) {
		char[] ch1 = s.toCharArray();
		char[] ch2 = t.toCharArray();
		for (int i = 0; i < s.length(); i++) {
			if (s.indexOf(ch1[i]) != t.indexOf(ch2[i])) {
				return false;
			}
		}
		return true;
	}
}
