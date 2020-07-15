package linklist;

public class ReverseLinkList {
	// 反转链表
	// 先定义反转链表的头结点dummy
	// 从头到尾遍历原来的链表，每遍历一个节点，就将其取出并放新的链表的最前端

	public void Reverse(SingleLinkListNode head) {
//		定义一个头结点
		SingleLinkListNode dummy = new SingleLinkListNode(0);
		dummy.next = null;
		
		SingleLinkListNode cur = head.next;
		while (true) {
			if (cur != null) {
//				让cur指针线往后挪一个位置 先用temp记录当前的位置
				SingleLinkListNode temp = cur;
				cur = cur.next;
//				从头到尾遍历原来的链表，每遍历一个节点，就将其取出并放新的链表的最前端
				temp.next = dummy.next;
				dummy.next = temp;
			} else {
				break;
			}
		}
	}
}
