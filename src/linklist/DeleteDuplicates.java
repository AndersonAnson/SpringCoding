package linklist;

public class DeleteDuplicates {
	public ListNode deleteDuplicates(ListNode head) {
		ListNode p = head;
		while (p != null && p.next != null) {
			if (p.val == p.next.val) {
				ListNode node = p.next;
				p.next = p.next.next;
				node.next = null;
			} else {
				p = p.next;
			}
		}
		return head;
	}
}
