package array;

import java.util.Arrays;

public class SingleNumber {
	public int singleNumber(int[] nums) {
		int res = 0;
		Arrays.sort(nums);
		for (int i = 0; i < nums.length;) {
			if (i == nums.length - 1) {
				res = nums[i];
				break;
			} else if (nums[i] == nums[i + 1]) {
				i = i + 2;
			} else {
				res = nums[i];
				break;
			}
		}
		return res;
	}
}
