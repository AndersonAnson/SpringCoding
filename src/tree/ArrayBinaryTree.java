package tree;

public class ArrayBinaryTree {
	private int[] arr;

	public void preOrder(int index) {
		if (arr == null || arr.length == 0) {
			return;
		}
		System.out.println(arr[index]);
		if (2 * index + 1 < arr.length) {
			preOrder(2 * index + 1);
		}
		if (2 * index + 2 < arr.length) {
			preOrder(2 * index + 2);
		}
	}
}
