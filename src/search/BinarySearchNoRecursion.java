package search;

public class BinarySearchNoRecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 1, 3, 8, 10, 18, 67, 100 };
		int index = binarySearch(arr, 18);
		System.out.print(index);
	}

	public static int binarySearch(int[] arr, int target) {
		int left = 0;
		int right = arr.length - 1;
		while (left <= right) {
			int mid = (left + right) / 2;
			if (arr[mid] == target) {
				return mid;
			} else if (arr[mid] > target) {
				right = mid - 1;
			} else {
				left = mid + 1;
			}
		}
		return -1;
	}
}
