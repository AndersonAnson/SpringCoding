package dynamicProgramming;

public class Massage {
	public int massage(int[] nums) {
		// ȷ��״̬ ����ÿ��ԤԼ��Ϊѡ�Ͳ�ѡ
		// ѡ�Ļ�dp[i]=dp[i-2]+nums[i]
		// ��ѡ�Ļ�dp[i]=dp[i-1]
		// Ȼ����Math.max
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
