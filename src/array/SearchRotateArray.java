package array;

public class SearchRotateArray {
	public int search(int[] nums, int target) {
		int low = 0, high = nums.length - 1;
		while (low < high) {
			int middle = (low + high) / 2;
			if ((nums[0] > target) ^ (nums[0] > nums[middle] ^ (target > nums[middle]))) {
				low = middle + 1;
			} else {
				high = middle;
			}
		}
		return low == high && nums[low] == target ? low : -1;
	}
}
