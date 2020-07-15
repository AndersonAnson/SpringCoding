package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupAnagrams {
	public List<List<String>> groupAnagrams(String[] strs) {
		if (strs.length == 0) {
			return new ArrayList<>();
		}
		HashMap<String, List> hm = new HashMap<String, List>();
		for (String str : strs) {
			char[] ch = str.toCharArray();
			Arrays.sort(ch);
			String key = String.valueOf(ch);
			if (!hm.containsKey(key)) {
				hm.put(key, new ArrayList<>());
			}
			hm.get(key).add(str);
		}
		return new ArrayList(hm.values());
	}
}
