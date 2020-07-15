package linklist;

import java.util.Stack;

public class ReversePrintLinkList {
//	逆序打印单链表
//	方式1 先反转单链表 然后再遍历打印 但是问题是会破环原来的单链表的结构，不建议
//	方式2 用栈实现逆序打印
	public void ReversePrintList(SingleLinkListNode head) {
//		声明一个栈
		Stack<SingleLinkListNode> stack=new Stack<>();
		SingleLinkListNode dummy=head;
		while(dummy.next!=null) {
			stack.push(dummy.next);
			dummy=dummy.next;
		}
		while(!stack.isEmpty()) {
			System.out.println(stack.pop().value);
		}
	}
}
