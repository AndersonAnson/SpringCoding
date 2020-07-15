package tree;

public class MirrorBinaryTree {
	public void Mirror(TreeNode root) {
		if (root == null) {
			return;
		}
		TreeNode temp = new TreeNode(1);
		temp = root.left;
		root.left = root.right;
		root.right = temp;
		// 递归将两给子树的左右子树镜像
		Mirror(root.left);
		Mirror(root.right);
	}
}
