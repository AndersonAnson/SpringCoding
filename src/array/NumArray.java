package array;

import java.util.HashMap;
import java.util.Map;

public class NumArray {
	int[] arr;

	public NumArray(int[] nums) {
		arr = nums;
	}

	public int sumRange(int i, int j) {
		int sum = 0;
		for (; i <= j; i++) {
			sum = sum + arr[i];
		}
		return sum;
	}
}
