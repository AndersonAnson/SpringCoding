package tree;

import java.util.LinkedList;
import java.util.List;

public class BinaryTreePaths {
	public List<String> binaryTreePaths(TreeNode root) {
		LinkedList<String> paths = new LinkedList<String>();

		if (root == null) {
			return paths;
		}
		LinkedList<TreeNode> nodeStack = new LinkedList<>();
		LinkedList<String> pathStack = new LinkedList<>();
		nodeStack.add(root);
		pathStack.add(Integer.toString(root.val));
		TreeNode node;
		String path;
		while (!nodeStack.isEmpty()) {
			node = nodeStack.pollLast();
			path = pathStack.pollLast();

			if (node.left == null && node.right == null) {
				paths.add(path);
			}
			if (node.left != null) {
				nodeStack.addLast(node.left);
				pathStack.addLast(path + "->" + Integer.toString(node.left.val));
			}
			if (node.right != null) {
				nodeStack.addLast(node.right);
				pathStack.addLast(path + "->" + Integer.toString(node.right.val));
			}
		}
		return paths;
	}
}
