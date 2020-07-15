package array;

import java.util.Arrays;

public class MaximumGap {
	public int maximumGap(int[] nums) {
		int res = 0;
		if (nums.length == 1 || nums.length == 0) {
			return res;
		}
		Arrays.sort(nums);
		int max = Integer.MIN_VALUE;
		for (int i = 1; i < nums.length; i++) {
			int cha = nums[i] - nums[i - 1];
			max = Math.max(max, cha);
		}
		res = max;
		return res;
	}
}
