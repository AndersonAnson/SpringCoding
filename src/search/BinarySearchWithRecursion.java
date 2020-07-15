package search;

import java.util.ArrayList;
import java.util.List;

public class BinarySearchWithRecursion {
	static ArrayList<Integer> responseList = new ArrayList<Integer>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 7, 7, 7, 8, 9, 10 };
//		ArrayList<Integer> res = new ArrayList<>();
		int res = midSearch(arr, 0, arr.length - 1, 2);
		System.out.print(res);
	}

	public static int midSearch(int[] arr, int left, int right, int val) {
		if (left > right) {
			return -1;
		}
		int mid = (left + right) / 2;
		int midVal = arr[mid];
		if (midVal < val) {
			return midSearch(arr, mid + 1, right, val);
		} else if (midVal > val) {
			return midSearch(arr, left, mid - 1, val);
		} else {
			return mid;
		}
	}
}
