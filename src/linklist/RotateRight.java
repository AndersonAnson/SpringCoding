package linklist;

public class RotateRight {
	public ListNode rotateRight(ListNode head, int k) {
		if (head == null)
			return null;
		if (head.next == null)
			return head;
		int n = 1, step = 0;
		ListNode p = head;
		ListNode newHead;
		while (p.next != null) {
			n++;
			p = p.next;
		}
		System.out.println(n);
		p.next = head;
		if (k >= n) {
			step = k % n;
		} else {
			step = k;
		}
		int newHeadLocation = n - step;
		int i = 1;
		p = head;
		while (true) {

			if (i == newHeadLocation) {
				newHead = p.next;
				p.next = null;
				break;
			}
			i++;
			p = p.next;
		}
		return newHead;
	}
}
