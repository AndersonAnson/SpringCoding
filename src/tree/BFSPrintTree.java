package tree;

import java.util.ArrayList;
import java.util.LinkedList;

public class BFSPrintTree {
	public ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {
		ArrayList<ArrayList<Integer>> res = new ArrayList<>();
		LinkedList<TreeNode> q = new LinkedList<>();
		// 用队列
		if (pRoot == null) {
			return res;
		}
		q.add(pRoot);

		while (!q.isEmpty()) {
			int size = q.size();
			ArrayList<Integer> rowList = new ArrayList<>();
			for (int i = 0; i < size; i++) {// 按层输出
				TreeNode tn = q.poll();
				if (tn == null) {
					continue;
				}
				rowList.add(tn.val);
				if (tn.left != null) {
					q.offer(tn.left);
				}
				if (tn.right != null) {
					q.offer(tn.right);
				}

			}
			res.add(rowList);
		}

		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
