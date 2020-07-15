package array;

public class MinSubArrayLen {
	public int minSubArrayLen(int s, int[] nums) {
		int start = 0, end = nums.length - 1;
		int ans = Integer.MAX_VALUE;
		int sum = 0;
		for (int i = 0; i <= end; i++) {
			sum = sum + nums[i];
			while (sum >= s) {
				ans = Math.min(ans, i - start + 1);
				sum = sum - nums[start];
				start++;
			}
		}
		if (ans == Integer.MAX_VALUE) {
			return 0;
		} else {
			return ans;
		}
	}
}
