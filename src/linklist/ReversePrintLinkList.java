package linklist;

import java.util.Stack;

public class ReversePrintLinkList {
//	�����ӡ������
//	��ʽ1 �ȷ�ת������ Ȼ���ٱ�����ӡ ���������ǻ��ƻ�ԭ���ĵ�����Ľṹ��������
//	��ʽ2 ��ջʵ�������ӡ
	public void ReversePrintList(SingleLinkListNode head) {
//		����һ��ջ
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
