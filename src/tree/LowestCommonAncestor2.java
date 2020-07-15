package tree;

public class LowestCommonAncestor2 {
	private TreeNode ansRecurseTree = null;

	public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
		this.recurseTree(root, p, q);
		return this.ansRecurseTree;
	}

	public boolean recurseTree(TreeNode currentNode, TreeNode p, TreeNode q) {
		if (currentNode == null) {
			return false;
		}
		int left = this.recurseTree(currentNode.left, p, q) ? 1 : 0;
		int right = this.recurseTree(currentNode.right, p, q) ? 1 : 0;
		int mid = (currentNode == p || currentNode == q) ? 1 : 0;
		if (mid + left + right >= 2) {
			this.ansRecurseTree = currentNode;
		}
		return (mid + left + right > 0);
	}
}
