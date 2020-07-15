package recursion;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class WordBreak {
	public static Set<String> wordSet;
	public static Boolean[] memo;

	public boolean wordBreak(String s, List<String> wordDict) {
		wordSet = new HashSet<>(wordDict);
		memo = new Boolean[s.length()];
		boolean res = helper(s, 0);
		return res;
	}

	public boolean helper(String s, int start) {
		if (start == s.length()) {
			return true;
		}
		if (memo[start] != null) {
			return memo[start];
		}
		for (int end = start + 1; end <= s.length(); end++) {
			if (wordSet.contains(s.substring(start, end)) && helper(s, end)) {
				return memo[start] = true;
			}
		}
		return memo[start] = false;
	}
}
