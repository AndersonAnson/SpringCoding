package linklist;

public class DeleteDuplicates2 {
	public ListNode deleteDuplicates(ListNode head) {
		if (head == null || head.next == null) {
			return head;
		}
		ListNode dummy = new ListNode(-1);
		dummy.next = head;
		ListNode slow = dummy;
		ListNode fast = head;
		while (fast != null) {
			if (fast.next == null || fast.val != fast.next.val) {
				if (slow.next == fast) {
					slow = fast;
				} else {
					slow.next = fast.next;
				}
			}

			fast = fast.next;

		}
		return dummy.next;
	}
}
