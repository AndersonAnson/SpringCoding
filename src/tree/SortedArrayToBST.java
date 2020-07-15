package tree;

public class SortedArrayToBST {
	public TreeNode sortedArrayToBST(int[] nums) {
		return this.sortedArrayToBST(nums, 0, nums.length);
	}

	public TreeNode sortedArrayToBST(int[] nums, int start, int end) {
		if (start == end) {
			return null;
		}
		int mid = (start + end) >>> 1;
		TreeNode node = new TreeNode(nums[mid]);
		node.left = this.sortedArrayToBST(nums, start, mid);
		node.right = this.sortedArrayToBST(nums, mid + 1, end);
		return node;
	}
}
