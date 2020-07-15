package array;

public class RemoveDuplicates {
	public int removeDuplicates(int[] nums) {
		int i = 0;
		int j = 1;
		if (nums.length == 0) {
			return 0;
		}
		for (; j < nums.length; j++) {
			if (nums[i] != nums[j]) {
				i++;
				nums[i] = nums[j];
			}
		}
		i++;
		return i;

	}
}
