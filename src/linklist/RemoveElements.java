package linklist;

public class RemoveElements {
	public ListNode removeElements(ListNode head, int val) {
		ListNode dummy = new ListNode(0);
		dummy.next = head;
		ListNode node = dummy;
		while (node.next != null) {
			ListNode tmp = node.next;
			if (tmp.val == val) {
				node.next = tmp.next;
				continue;
			}
			node = node.next;
		}
		return dummy.next;
	}
}
