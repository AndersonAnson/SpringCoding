package dynamicProgramming;

public class Rob {
	public int rob(int[] nums) {
		int prevMax = 0;
		int currMax = 0;
		for (int i = 0; i < nums.length; i++) {
			int temp = currMax;
			currMax = Math.max(prevMax + nums[i], currMax);
			prevMax = temp;
		}
		return currMax;
	}
}
