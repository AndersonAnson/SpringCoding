package linklist;

public class ReverseLinkList {
	// ��ת����
	// �ȶ��巴ת�����ͷ���dummy
	// ��ͷ��β����ԭ��������ÿ����һ���ڵ㣬�ͽ���ȡ�������µ��������ǰ��

	public void Reverse(SingleLinkListNode head) {
//		����һ��ͷ���
		SingleLinkListNode dummy = new SingleLinkListNode(0);
		dummy.next = null;
		
		SingleLinkListNode cur = head.next;
		while (true) {
			if (cur != null) {
//				��curָ��������Ųһ��λ�� ����temp��¼��ǰ��λ��
				SingleLinkListNode temp = cur;
				cur = cur.next;
//				��ͷ��β����ԭ��������ÿ����һ���ڵ㣬�ͽ���ȡ�������µ��������ǰ��
				temp.next = dummy.next;
				dummy.next = temp;
			} else {
				break;
			}
		}
	}
}
