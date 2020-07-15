package tree;

import java.util.HashMap;

public class ReConstructFromPreOrderInOrder {
	int pre_idx = 0;
	int[] preorder;
	int[] inorder;
	HashMap<Integer, Integer> m = new HashMap<Integer, Integer>();

	public TreeNode helper(int in_left, int in_right) {
		if (in_left == in_right) {
			return null;
		}
		int rootVal = preorder[pre_idx];
		TreeNode root = new TreeNode(rootVal);
		int index = m.get(rootVal);
		pre_idx++;
		root.left = helper(in_left, index);
		root.right = helper(index + 1, in_right);
		return root;
	}

	public TreeNode buildTree(int[] preorder, int[] inorder) {
		this.preorder = preorder;
		this.inorder = inorder;
		int idx = 0;
		for (Integer val : this.inorder) {
			m.put(val, idx);
			idx++;
		}
		return helper(0, inorder.length);
	}
}
