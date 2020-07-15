package tree;

import java.util.ArrayList;
import java.util.List;

import linklist.ListNode;

public class SortedListToBST {
	public TreeNode sortedListToBST(ListNode head) {
		ArrayList<Integer> arrayList = new ArrayList<>();
		while (head != null) {
			arrayList.add(head.val);
			if (head.next != null) {
				head = head.next;
			} else {
				break;
			}
		}
		System.out.println(arrayList);
		return this.sortedArrayToBST(arrayList, 0, arrayList.size());
	}

	public TreeNode sortedArrayToBST(List<Integer> arrayList, int start, int end) {
		if (start == end) {
			return null;
		}
		int mid = (start + end) >>> 1;
		TreeNode node = new TreeNode(arrayList.get(mid));
		node.left = this.sortedArrayToBST(arrayList, start, mid);
		node.right = this.sortedArrayToBST(arrayList, mid + 1, end);
		return node;
	}
}
