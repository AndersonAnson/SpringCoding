package tree;

import java.util.ArrayList;
import java.util.List;

public class InorderTraversal {
	public List<Integer> inorderTraversal(TreeNode root) {
		List<Integer> res = new ArrayList<>();
		qiuInOrder(res, root);
		return res;
	}

	public void qiuInOrder(List<Integer> res, TreeNode root) {
		if (root != null) {
			if (root.left != null) {
				qiuInOrder(res, root.left);
			}
			res.add(root.val);
			if (root.right != null) {
				qiuInOrder(res, root.right);
			}
		}

	}
}
