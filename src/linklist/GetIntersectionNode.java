package linklist;

import java.util.HashMap;

public class GetIntersectionNode {
	public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
		HashMap<ListNode, ListNode> m = new HashMap<>();
		while (headA != null) {
			m.put(headA, headA);
			if (headA.next != null) {
				headA = headA.next;
			} else {
				break;
			}
		}
		while (headB != null) {
			if (m.containsKey(headB)) {
				return headB;
			} else {
				headB = headB.next;
			}
		}
		return null;
	}
}
