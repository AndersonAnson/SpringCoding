package math;

public class TwoSum {
	public int[] twoSum(int[] numbers, int target) {
		int[] res = new int[2];
		int start = 0;
		int end = numbers.length - 1;
		while (start < end) {
			int sum = numbers[start] + numbers[end];
			if (sum == target) {
				res[0] = start + 1;
				res[1] = end + 1;
				return res;
			} else if (sum < target) {
				start++;
			} else {
				end--;
			}
		}
		return res;
	}
}
