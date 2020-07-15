package tree;

public class MaxDepth {
	int maxDepth = 0;
	public int maxDepth(TreeNode root) {
		if (root == null) {
			return 0;
		}
		DFS(root, 0);
		return maxDepth;
	}

	public void DFS(TreeNode node, int level) {
		if (node != null) {
			level++;
			maxDepth = Math.max(level, maxDepth);
			if (node.left != null) {
				DFS(node.left, level);
			}
			if (node.right != null) {
				DFS(node.right, level);
			}
		}
	}
}
