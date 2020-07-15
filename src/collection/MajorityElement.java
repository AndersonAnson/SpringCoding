package collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MajorityElement {
	public int majorityElement(int[] nums) {
		HashMap<Integer, Integer> map = new HashMap<>();
		int res = nums[0];
		for (int i = 0; i < nums.length; i++) {
			if (map.containsKey(nums[i])) {
				int temp = map.get(nums[i]) + 1;
				map.put(nums[i], temp);
			} else {
				map.put(nums[i], 0);
			}
		}
		int maxFre = Integer.MIN_VALUE;
		for (Map.Entry<Integer, Integer> tmp : map.entrySet()) {
			maxFre = Math.max(maxFre, tmp.getValue());
		}
		Set<Entry<Integer, Integer>> set = map.entrySet();
		Iterator<Map.Entry<Integer, Integer>> iterator = set.iterator();
		while (iterator.hasNext()) {
			// Map.Entry是一种类型，指向map中的一个键值对组成的对象
			Map.Entry<Integer, Integer> entry = iterator.next();
			if (entry.getValue().equals(maxFre)) {
				res = entry.getKey();
			}
		}
		return res;
	}
}
