package math;

public class MissingNumber {
	public int missingNumber(int[] nums) {
		int expectedSum = ((nums.length + 1) * nums.length) / 2;
		int actSum = 0;
		for (int num : nums) {
			actSum = actSum + num;
		}
		return expectedSum - actSum;
	}
}
