package dynamicProgramming;

public class MaxSubArray {
	public int maxSubArray(int[] nums) {
		int maxValue = nums[0];
		int sum = nums[0];
		for (int i = 1; i < nums.length; i++) {
			if (nums[i] + sum > nums[i]) {
				sum = sum + nums[i];// 如果总和大于0了 就加入进来
			} else {
				sum = nums[i];// 小于0就重置
			}
			maxValue = Math.max(sum, maxValue);
		}
		return maxValue;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 1, 2 };
		System.out.println(new MaxSubArray().maxSubArray(nums));
	}

}
