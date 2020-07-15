package string;

import java.util.Scanner;

public class StringPattern {
	public static boolean stringPattern() {
		Scanner in = new Scanner(System.in);
		String s1 = in.nextLine();
		String s2 = in.nextLine();
		in.close();
		for (int i = 0; i < s2.length(); i++) {
			if (s2.charAt(i) == s1.charAt(i)) {
				continue;
			} else {
				if (s1.charAt(i) == '?') {
					continue;
				}
				if (s1.charAt(i) == '*') {
					if (i + 1 <= s1.length()) {
						char tmp = s1.charAt(i + 1);
						int s2temp = s1.indexOf(tmp, i);
						i = s2temp;
						continue;
					}
					return true;
				} else {
					return false;
				}
			}
		}
		return true;
	}
	public static void main(String[] args) {
		stringPattern();
	}
}
