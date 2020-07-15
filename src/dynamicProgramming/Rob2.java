package dynamicProgramming;

import java.util.Arrays;

public class Rob2 {
	public int rob(int[] nums) {
		if (nums.length == 0)
			return 0;
		if (nums.length == 1)
			return nums[0];
		int ans1 = myRob(Arrays.copyOfRange(nums, 0, nums.length - 1));// 不抢最后一个
		int ans2 = myRob(Arrays.copyOfRange(nums, 1, nums.length));// 不抢第一个
		return Math.max(ans1, ans2);
	}

	public int myRob(int[] nums) {
		int pre = 0, cur = 0, tmp;
		for (int x : nums) {
			tmp = cur;
			cur = Math.max(x + pre, cur);
			pre = tmp;
		}
		return cur;
	}
}
