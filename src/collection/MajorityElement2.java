package collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MajorityElement2 {
	public List<Integer> majorityElement(int[] nums) {
		List<Integer> res = new ArrayList<>();
		int n = nums.length;
		HashMap<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			if (!map.containsKey(nums[i])) {
				map.put(nums[i], 1);
			} else {
				int fre = map.get(nums[i]);
				fre++;
				map.put(nums[i], fre++);
			}
		}
		System.out.println(map);
		for (Integer key : map.keySet()) {
			if (map.get(key) > n / 3) {
				res.add(key);
			}
		}
		return res;
	}
}
