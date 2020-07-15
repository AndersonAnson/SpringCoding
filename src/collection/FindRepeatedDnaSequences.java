package collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class FindRepeatedDnaSequences {
	public List<String> findRepeatedDnaSequences(String s) {
		List<String> res = new ArrayList<>();
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		if (s.length() < 10) {
			return res;
		}
		for (int i = 0; i <= s.length() - 10; i++) {
			int start = i;
			String tmp = s.substring(start, start + 10);
			System.out.println(tmp);
			if (map.containsKey(tmp)) {
				Integer fre = map.get(tmp);
				map.put(tmp, fre + 1);
			} else {
				map.put(tmp, 1);
			}
		}
		Iterator<String> iterator = map.keySet().iterator();
		while (iterator.hasNext()) {
			String key = iterator.next();
			if (map.get(key) > 1) {
				res.add(key);
			}
		}
		return res;
	}
}
