package array;

public class SearchInsert {
	public int searchInsert(int[] nums, int target) {
		int i = 0;
		int flag = 0;
		for (; i < nums.length; i++) {
			if (target < nums[i]) {
				flag = i;
				return flag;
			}
			if (target > nums[i]) {
				flag = i;
				if (i == nums.length - 1) {
					flag = i + 1;
					return flag;
				}
			}
			if (target == nums[i]) {
				flag = i;
				return flag;
			}
		}
		return flag;
	}
}
