package tree;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class SerializeAndDeSer {
	// Encodes a tree to a single string.
	public String serialize(TreeNode root) {
		if (root == null) {
			return "[]";
		}
		Queue<String> res = new LinkedList<>();
		Queue<TreeNode> queue = new LinkedList<>();
		queue.offer(root);
		res.offer(String.valueOf(root.val));
		while (!queue.isEmpty()) {
			TreeNode node = queue.poll();
			if (node.left != null) {
				queue.offer(node.left);
				res.offer(String.valueOf(node.left.val));
			} else {
				res.offer("null");
			}
			if (node.right != null) {
				queue.offer(node.right);
				res.offer(String.valueOf(node.right.val));
			} else {
				res.offer("null");
			}

		}
		StringBuffer sb = new StringBuffer();
		sb.append("[");
		while (!res.isEmpty()) {
			sb.append(res.poll());
			if (!res.isEmpty()) {
				sb.append(",");
			}
		}
		sb.append("]");
		System.out.print(sb.toString());
		return sb.toString();
	}

	// Decodes your encoded data to tree.
	public TreeNode deserialize(String data) {
		data = data.substring(1, data.length() - 1);
		if (data.length() == 0) {
			return null;
		}
		Queue<String> ls = new LinkedList<>(Arrays.asList(data.split(",")));
		Queue<TreeNode> queue = new LinkedList<>();
		TreeNode root = null;
		while (!ls.isEmpty()) {
			String res = ls.poll();
			if (root == null) {
				root = new TreeNode(Integer.valueOf(res));
				queue.offer(root);
				continue;
			}
			TreeNode father = queue.poll();
			if (!res.equals("null")) {
				TreeNode curr = new TreeNode(Integer.valueOf(res));
				father.left = curr;
				queue.offer(curr);
			}
			res = ls.poll();
			if (!res.equals("null")) {
				TreeNode curr = new TreeNode(Integer.valueOf(res));
				father.right = curr;
				queue.offer(curr);
			}
		}
		return root;
	}
}
