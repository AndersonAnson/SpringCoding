package linklist;

import java.util.HashSet;
import java.util.Stack;

public class DeleteDuplication {
	public ListNode deleteDuplication(ListNode pHead) {
		if (pHead == null)
			return null;
		// ���ҳ���ͬ��㣬���� set
		HashSet<Integer> set = new HashSet<>();
		ListNode pre = pHead;
		ListNode cur = pHead.next;
		while (cur != null) {
			if (cur.val == pre.val) {
				set.add(cur.val);
			}
			pre = cur;
			cur = cur.next;
		}
		// �ٸ�����ͬ�ڵ�ɾ��
        // ��ɾͷ��
		while (pHead != null && set.contains(pHead.val)) {
			pHead = pHead.next;
		}
		if (pHead == null) {
			return null;
		}
		pre = pHead;
		cur = pHead.next;
		// ��ɾ�м���
		while (cur != null) {
			if (set.contains(cur.val)) {
				pre.next = cur.next;
				cur = cur.next;
			} else {
				pre = cur;
				cur = cur.next;
			}
		}
		return pHead;
	}
}