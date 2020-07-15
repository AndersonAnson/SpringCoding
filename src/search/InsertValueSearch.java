package search;

import java.util.Arrays;

public class InsertValueSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int[] arr = new int[5];
//		for (int i = 0; i < arr.length; i++) {
//			arr[i] = (int) Math.random() * 1000;
//		}
		int[] arr= {6,8,2,56,892};
		Arrays.sort(arr);
		int index = insertValueSearch(arr, 0, arr.length - 1, 8);
		System.out.print(index);
	}

	public static int insertValueSearch(int[] arr, int left, int right, int findVal) {
		if (left > right || findVal < arr[0] || findVal > arr[arr.length - 1]) {
			return Integer.MIN_VALUE;
		}
		int mid = left + (right - left) * (findVal - arr[left]) / (arr[right] - arr[left]);
		int midVal = arr[mid];
		if (findVal > midVal) {
			return insertValueSearch(arr, mid + 1, right, findVal);
		} else if (findVal < midVal) {
			return insertValueSearch(arr, left, mid - 1, findVal);
		} else {
			return mid;
		}
	}

}
