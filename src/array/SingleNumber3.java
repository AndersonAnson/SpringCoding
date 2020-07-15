package array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class SingleNumber3 {
	public int[] singleNumber(int[] nums) {
		List<Integer> res = new ArrayList<>();
		HashMap<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			if (!map.containsKey(nums[i])) {
				map.put(nums[i], 1);
			} else {
				int fre = map.get(nums[i]);
				fre++;
				map.put(nums[i], fre);
			}
		}
		for (Integer key : map.keySet()) {
			if (map.get(key) == 1) {
				res.add(key);
			}
		}
		int[] ans = res.stream().mapToInt(Integer::valueOf).toArray();
		return ans;
	}
}
