package linklist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

public class PrintListFromTailToHead {
	public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
		ArrayList<Integer> ans = new ArrayList<>();
		Stack<Integer> stack = new Stack<Integer>();
		while (listNode != null) {
			stack.push(listNode.val);
			listNode = listNode.next;
		}
		while (!stack.empty()) {
			ans.add(stack.pop());
		}
		return ans;
	}
}
