package string;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class FindSubstring {
	public List<Integer> findSubstring(String s, String[] words) {
		List<Integer> ans = new ArrayList<>();
		if (s == null || s.length() == 0 || words == null || words.length == 0) {
			return ans;
		}
		HashMap<String, Integer> map = new HashMap<>();
		int one_word = words[0].length();
		int word_num = words.length;
		for (String word : words) {
			map.put(word, map.getOrDefault(word, 0) + 1);
		}
		for (int i = 0; i < one_word; i++) {
			int left = i;
			int right = i;
			int count = 0;
			HashMap<String, Integer> tempMap = new HashMap<>();
			while (right + one_word <= s.length()) {
				String w = s.substring(right, right + one_word);
				tempMap.put(w, tempMap.getOrDefault(w, 0) + 1);
				right += one_word;
				count++;
				while (tempMap.getOrDefault(w, 0) > map.getOrDefault(w, 0)) {
					String t_w = s.substring(left, left + one_word);
					count--;
					tempMap.put(t_w, tempMap.getOrDefault(t_w, 0) - 1);
					left += one_word;
				}
				if (count == word_num) {
					ans.add(left);
				}
			}
		}
		return ans;
	}
}
