package linklist;

import java.util.HashMap;

public class HasCycle2 {
	public ListNode detectCycle(ListNode head) {
		HashMap<ListNode, Integer> m = new HashMap<>();
		while (head != null) {
			if (m.containsKey(head)) {
				ListNode res = head;
				return res;
			} else {
				m.put(head, head.val);
			}
			head = head.next;
		}
		return null;
	}
}
