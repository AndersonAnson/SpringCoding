package math;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class LetterCombinations {
	public List<String> letterCombinations(String digits) {
		LinkedList<String> ans = new LinkedList<String>();
		String[] array = new String[] { "0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };
		if (digits.isEmpty()) {
			return ans;
		}
		ans.add("");
		for (int i = 0; i < digits.length(); i++) {
			int shuzi = Character.getNumericValue(digits.charAt(i));
			while (ans.peek().length() == i) {
				String t = ans.remove();
				System.out.println(t);
				for (char s : array[shuzi].toCharArray()) {
					ans.add(t + s);

				}
			}
		}
		return ans;
	}
}
