
package linklist;

public class MergeTwoLinkedList {
	public ListNode merge(ListNode list1, ListNode list2) {
//		定义一个新的结点
		ListNode list3 = new ListNode(0);
		ListNode head = list3;
		list3.next = null;
//		如果list1小于list2 那么加入list1 否则加入list2
		while (list1 != null && list2 != null) {
			if (list1.val < list2.val) {
				list3.next = list1;
				list1 = list1.next;
			} else {
				list3.next = list2;
				list2 = list2.next;
			}
			list3 = list3.next;
		}
		if (list1 != null)
			list3.next = list1;
		if (list2 != null)
			list3.next = list2;
		return head.next;
	}
}
