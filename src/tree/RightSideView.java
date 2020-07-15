package tree;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Stack;

public class RightSideView {
	public List<Integer> rightSideView(TreeNode root) {
		HashMap<Integer, Integer> rightmostValueAtDepth = new HashMap<Integer, Integer>();
		int maxDepth = -1;
		Stack<TreeNode> nodeStack = new Stack<TreeNode>();
		Stack<Integer> depthStack = new Stack<Integer>();
		nodeStack.push(root);
		depthStack.push(0);
		while (!nodeStack.isEmpty()) {
			TreeNode node = nodeStack.pop();
			int depth = depthStack.pop();
			if (node != null) {
				maxDepth = Math.max(maxDepth, depth);
				if (!rightmostValueAtDepth.containsKey(depth)) {
					rightmostValueAtDepth.put(depth, node.val);
				}
				nodeStack.push(node.left);
				nodeStack.push(node.right);
				depthStack.push(depth + 1);
				depthStack.push(depth + 1);
			}
		}
		List<Integer> res = new ArrayList<>();
		for (int depth = 0; depth <= maxDepth; depth++) {
			res.add(rightmostValueAtDepth.get(depth));
		}
		return res;
	}
}
