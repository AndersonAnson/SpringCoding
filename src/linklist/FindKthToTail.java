package linklist;

public class FindKthToTail {
	public ListNode findKthToTail(ListNode head, int k) {
		if (head == null || k == 0) {
			return null;
		}
		ListNode fast = head;
		ListNode slow = head;
		int count = 1;
//		����һ����ָ��
//		����һ����ָ��
//		����ָ�����˵�k-1��ʱ�� ��ָ�뿪ʼ��
//		�����ָ���Ƿ��ƶ���
		int flag = 0;
		while (fast.next != null) {
			// �����ƶ�
			if (count == k) {
				flag = 1;
			}
			fast = fast.next;
			if (flag == 1) {
				slow = slow.next;
			}
			count++;
		}
		if (count < k) {
			return null;
		} else {
			return slow;
		}

	}
}
