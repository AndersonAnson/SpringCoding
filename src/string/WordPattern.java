package string;

import java.util.HashMap;
import java.util.Map;

public class WordPattern {
	public boolean wordPattern(String pattern, String str) {
		String[] arrStr = str.split(" ");
		if (pattern.length() != arrStr.length) {
			return false;
		}
		Map<Character, String> map = new HashMap<>();
		for (int i = 0; i < pattern.length(); i++) {
			if (!map.containsKey(pattern.charAt(i))) {
				if (map.containsValue(arrStr[i])) {
					return false;
				}
				map.put(pattern.charAt(i), arrStr[i]);
			} else {
				if (!map.get(pattern.charAt(i)).equals(arrStr[i])) {
					return false;
				}
			}
		}
		return true;
	}
}
