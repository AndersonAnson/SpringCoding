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
		// �ݹ齫����������������������
		Mirror(root.left);
		Mirror(root.right);
	}
}
