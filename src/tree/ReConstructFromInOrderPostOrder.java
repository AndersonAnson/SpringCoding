package tree;

public class ReConstructFromInOrderPostOrder {
	public TreeNode buildTree(int[] inorder, int[] postorder) {
		int inLen = inorder.length;
		int postLen = postorder.length;
		if (inLen != postLen) {
			throw new RuntimeException();
		}
		TreeNode ans = buildTree(inorder, 0, inLen - 1, postorder, 0, postLen - 1);
		return ans;
	}

	private TreeNode buildTree(int[] inorder, int inLeft, int inRight, int[] postorder, int postLeft, int postRight) {
		if (inLeft > inRight || postLeft > postRight) {
			return null;
		}
		int pivot = postorder[postRight];
		int pivotIndex = inLeft;
		while (inorder[pivotIndex] != pivot) {
			pivotIndex++;
		}
		TreeNode root = new TreeNode(pivot);
		root.left = buildTree(inorder, inLeft, pivotIndex - 1, postorder, postLeft,
				postRight - inRight + pivotIndex - 1);
		root.right = buildTree(inorder, pivotIndex + 1, inRight, postorder, postRight - inRight + pivotIndex,
				postRight - 1);
		return root;
	}
}
