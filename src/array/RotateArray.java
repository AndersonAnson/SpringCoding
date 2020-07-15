package array;

public class RotateArray {
	public void rotate(int[] nums, int k) {
		int len = nums.length;
		int[] extra = new int[len];
		for (int i = 0; i < len; i++) {
			int index = (i + k) % len;
			extra[index] = nums[i];
			System.out.println(extra);
		}
		for (int i = 0; i < len; i++) {
			nums[i] = extra[i];
		}
	}
}
