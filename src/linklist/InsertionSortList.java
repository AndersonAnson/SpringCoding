package linklist;

public class InsertionSortList {
	public ListNode insertionSortList(ListNode head) {
		if (head == null || head.next == null) {
			return head;
		}
		// 创建dummy用于遍历链表
		ListNode dummy = new ListNode(-1);
		dummy.next = head;
		ListNode cur = head.next;
		head.next = null;
		while (cur != null) {
			ListNode p = dummy;
			while (p.next != null && p.next.val < cur.val) {
				p = p.next;
			}
			ListNode tmp = cur.next;
			cur.next = p.next;
			p.next = cur;
			cur = tmp;
		}
		return dummy.next;
	}
}
