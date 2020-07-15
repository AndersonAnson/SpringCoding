package array;

public class SortColors {
	public void sortColors(int[] nums) {
		int length = nums.length;
		int p0 = 0, curr = 0, p2 = length - 1;
		int temp;
		while (curr <= p2) {
			if (nums[curr] == 0) {
				temp = nums[p0];
				nums[p0] = nums[curr];
				nums[curr] = temp;
				p0++;
				curr++;
			} else if (nums[curr] == 2) {
				temp = nums[p2];
				nums[p2] = nums[curr];
				nums[curr] = temp;
				p2--;
			} else {
				curr++;
			}
		}
	}
}
