package tree;

public class SumNumbers {
	public int sumNumbers(TreeNode root) {// 129Ã‚ªÿÀ›∑®
		if (root == null) {
			return 0;
		}
		int sum = sumNumbersHelper(root, 0);
		return sum;
	}

	public int sumNumbersHelper(TreeNode root, int sum) {
		int cursum = sum * 10 + root.val;
		if (root.left == null && root.right == null) {
			return cursum;
		}
		int ans = 0;
		if (root.left != null) {
			ans += sumNumbersHelper(root.left, cursum);
		}
		if (root.right != null) {
			ans += sumNumbersHelper(root.right, cursum);
		}
		return ans;
	}
}
