package linklist;

public class ReverseBetween {
	public ListNode reverseBetween(ListNode head, int m, int n) {
		if (m > n || m < 1 || n < 1)
			return head;
		ListNode cur = head;
		ListNode top = null, end = null;
		int len = 0;
		// �ҵ�ǰһ���ڵ� top���ͺ�һ���ڵ� end
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
		// ��������������ת
		while (len >= 0) {
			next = nodeH.next;
			// ����ת�����������һ���ڵ����ӵ� end ��
			nodeH.next = end;
			end = nodeH;
			nodeH = next;
			len--;
		}
		// ����ת����������ӵ� top ��
		if (top == null)
			return end;
		else
			top.next = end;
		return head;
	}
}
