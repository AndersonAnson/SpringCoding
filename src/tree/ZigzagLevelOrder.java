package tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.List;

public class ZigzagLevelOrder {
	public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
		List<List<Integer>> res = new ArrayList<>();
		if (root == null) {
			return res;
		}
		Queue<TreeNode> queue = new LinkedList<>();
		queue.add(root);
		boolean isReverse = false;
		while (!queue.isEmpty()) {
			LinkedList<Integer> oneLevel = new LinkedList<>();
			int count = queue.size();
			for (int i = 0; i < count; i++) {
				TreeNode node = queue.poll();
				if (isReverse == false) {
					oneLevel.add(node.val);
				} else {
					oneLevel.addFirst(node.val);
				}
				if (node.left != null) {
					queue.add(node.left);
				}
				if (node.right != null) {
					queue.add(node.right);
				}
			}
			isReverse = !isReverse;
			res.add(oneLevel);
		}
		return res;
	}
}
