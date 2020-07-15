package tree;

import java.util.ArrayList;
import java.util.List;

public class KthSmallest {
	public int Smallest(TreeNode root, int k) {
		List<Integer> inOrder = new ArrayList<>();
		inOrderForkthSmallest(inOrder, root);
		int ans = 0;
		ans = inOrder.get(k - 1);
		return ans;
	}

	public void inOrderForkthSmallest(List<Integer> list, TreeNode root) {
		if (root == null) {
			return;
		}
		if (root != null) {
			if (root.left != null) {
				inOrderForkthSmallest(list, root.left);
			}
			list.add(root.val);
			if (root.right != null) {
				inOrderForkthSmallest(list, root.right);
			}
		}
	}
}
