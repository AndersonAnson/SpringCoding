package tree;

public class IsSymmetrical {
	boolean isSymmetrical(TreeNode pRoot) {
		if (pRoot == null) {
			return true;
		} else {
			return judge(pRoot.left, pRoot.right);
		}
	}

	public boolean judge(TreeNode node1, TreeNode node2) {
		if (node1 == null && node2 == null) {
			return true;
		} else if (node1 == null || node2 == null) {
			return false;
		}
		if (node1.val != node2.val) {
			return false;
		} else {
			return judge(node1.left, node2.right) && judge(node1.right, node2.left);
		}
	}
}
