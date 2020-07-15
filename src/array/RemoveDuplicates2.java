package array;

public class RemoveDuplicates2 {
	public int removeDuplicates(int[] nums) {
		if (nums.length <= 2) {
			return nums.length;
		}
		int slowptr = 1;
		for (int fastptr = 2; fastptr < nums.length; fastptr++) {
			if (nums[slowptr - 1] != nums[fastptr]) {
				slowptr++;
				nums[slowptr] = nums[fastptr];
			}
		}
		return slowptr + 1;
	}
}
