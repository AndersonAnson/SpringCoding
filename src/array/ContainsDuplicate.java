package array;

import java.util.HashMap;

public class ContainsDuplicate {
	public boolean containsDuplicate(int[] nums) {
		HashMap<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			if (map.containsKey(nums[i])) {
				return true;
			} else {
				map.put(nums[i], 1);
			}
		}
		return false;
	}
}