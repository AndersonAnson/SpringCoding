package linklist;

import java.util.HashMap;

public class HasCycle {
	public boolean hasCycle(ListNode head) {
		HashMap<ListNode, Integer> m = new HashMap<>();
		while (head != null) {
			if (m.containsKey(head)) {
				return true;
			} else {
				m.put(head, head.val);
			}
			head = head.next;
		}
		return false;
	}
}
