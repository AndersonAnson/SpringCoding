package dynamicProgramming;

public class Massage {
	public int massage(int[] nums) {
		// 确定状态 对于每个预约分为选和不选
		// 选的话dp[i]=dp[i-2]+nums[i]
		// 不选的话dp[i]=dp[i-1]
		// 然后求Math.max
		int[] dp = new int[nums.length + 1];
		dp[0] = 0;
		for (int i = 1; i < dp.length; i++) {
			if (i == 1) {
				dp[1] = nums[i - 1];
			} else {
				dp[i] = Math.max(dp[i - 2] + nums[i - 1], dp[i - 1]);
			}
		}
		return dp[nums.length];
	}

	public static void main(String[] args) {
		int[] nums = { 1, 2, 3, 1 };
		System.out.println(new Massage().massage(nums));
	}
}
