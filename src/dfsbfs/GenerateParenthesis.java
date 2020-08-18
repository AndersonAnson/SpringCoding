package dfsbfs;

import java.util.ArrayList;
import java.util.List;

public class GenerateParenthesis {
	public List<String> generateParenthesis(int n) {
		List<String> ans = new ArrayList<>();
		backTrack(ans, "", 0, 0, n);
		return ans;
	}

	public void backTrack(List<String> ans, String cur, int open, int close, int max) {
		if (cur.length() == max * 2) {
			ans.add(cur);
			return;
		}
		if (open < max)
			backTrack(ans, cur + "(", open + 1, close, max);
		if (close < open)
			backTrack(ans, cur + ")", open, close + 1, max);
	}
}
