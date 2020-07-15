package linklist;

public class ReverseBetween {
	public ListNode reverseBetween(ListNode head, int m, int n) {
		if (m > n || m < 1 || n < 1)
			return head;
		ListNode cur = head;
		ListNode top = null, end = null;
		int len = 0;
		// 找到前一个节点 top，和后一个节点 end
		while (cur != null) {
			len++;
			top = (len == (m - 1)) ? cur : top;
			end = (len == (n + 1)) ? cur : end;
			cur = cur.next;
		}

		if (len == 1)
			return head;
		ListNode nodeH = top == null ? head : top.next, next = null;
		len = n - m;
		// 进行正常的链表反转
		while (len >= 0) {
			next = nodeH.next;
			// 将反转后的链表的最后一个节点链接到 end 上
			nodeH.next = end;
			end = nodeH;
			nodeH = next;
			len--;
		}
		// 将反转后的链表链接到 top 上
		if (top == null)
			return end;
		else
			top.next = end;
		return head;
	}
}
