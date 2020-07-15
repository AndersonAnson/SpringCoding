package array;

import java.util.Arrays;

public class SingleNumber2 {
	public int singleNumber(int[] nums) {
		int res = 0;
		Arrays.sort(nums);
		for (int i = 0; i < nums.length;) {
			if (i == nums.length - 1) {
				res = nums[i];
				break;
			} else if (nums[i] == nums[i + 1] && nums[i] == nums[i + 2]) {
				i = i + 3;
			} else {
				res = nums[i];
				break;
			}
		}
		return res;
	}
}
