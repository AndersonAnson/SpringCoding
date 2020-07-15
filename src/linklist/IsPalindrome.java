package linklist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class IsPalindrome {
	public boolean isPalindrome(ListNode head) {
		List<Integer> list = new ArrayList<>();
		List<Integer> anotherList = new ArrayList<>();
		while (head != null) {
			list.add(head.val);
			anotherList.add(head.val);
			head = head.next;
		}
		Collections.reverse(list);
		if (list.equals(anotherList)) {
			return true;
		} else {
			return false;
		}
	}
}
