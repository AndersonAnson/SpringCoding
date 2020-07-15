package tree;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

public class ZigzagPrintTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {
		int layer = 1;
		LinkedList<TreeNode> q = new LinkedList<>();
		ArrayList<ArrayList<Integer>> res = new ArrayList<>();
		if (pRoot != null) {
			q.add(pRoot);
		}
		while (!q.isEmpty()) {
			int size = q.size();
			ArrayList<Integer> list = new ArrayList<>();
			for (int i = 0; i < size; i++) {
				TreeNode tn = q.poll();
				if (tn == null)
					continue;
				if (layer % 2 == 0) {
					list.add(0, tn.val);
				} else {
					list.add(tn.val);
				}
				q.offer(tn.left);
				q.offer(tn.right);
			}
			if (list.size() != 0) {
				res.add(list);
			}
			layer++;
		}
		return res;
	}
}
