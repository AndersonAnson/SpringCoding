package linklist;

public class ReverseList {
	public ListNode reverseList(ListNode head) {
//    	����һ��ͷ���ָ�������
//    	����һ���½ڵ�ָ��������
//    	����ͷ�巨
		ListNode oldDummy = head;
		ListNode newDummy = new ListNode(0);
//    	��ʼ��һ��������
		while (oldDummy != null) {
//			�����ֻ�
			ListNode temp = oldDummy.next;
			oldDummy.next = newDummy.next;
			newDummy.next = oldDummy;
			oldDummy = temp;
		}
		return newDummy.next;
	}
}
