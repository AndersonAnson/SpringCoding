package tree;

import java.util.ArrayList;
import java.util.List;

public class IsSameTree {
	public boolean isSameTree(TreeNode p, TreeNode q) {
		boolean ans = false;
		List<Integer> pTree = new ArrayList<>();
		List<Integer> qTree = new ArrayList<>();
		judgeSameTree(p, pTree);
		judgeSameTree(q, qTree);
		System.out.println(pTree);
		System.out.println(qTree);
		if (pTree.equals(qTree)) {
			ans = true;
		} else {
			ans = false;
		}
		return ans;
	}

	public void judgeSameTree(TreeNode node, List<Integer> treeToArray) {
		if (node != null) {
			treeToArray.add(node.val);
			if (node.left != null) {
				judgeSameTree(node.left, treeToArray);
			} else {
				treeToArray.add(null);
			}
			if (node.right != null) {
				judgeSameTree(node.right, treeToArray);
			} else {
				treeToArray.add(null);
			}
		}
	}
}
