package stack;

import java.util.Stack;

public class IsPopOrder {
	public boolean isPopOrder(int[] pushA, int[] popA) {
//		�½�һ��ջ��������Aѹ��ջ�У���ջ��Ԫ�ص�������Bʱ���ͽ����ջ����ѭ������ʱ���ж�ջ�Ƿ�Ϊ�գ���Ϊ���򷵻�true.
		if (pushA.length == 0 || popA.length == 0 || pushA.length != popA.length) {
			return false;
		}
		Stack<Integer> stack = new Stack<Integer>();
		int j = 0;
		for (int i = 0; i < pushA.length; i++) {
			// ��pushAԪ��ѹ��ջ��
			stack.push(pushA[i]);
			while (!stack.isEmpty() && stack.peek() == popA[j]) {
				stack.pop();
				j++;
			}
		}
		return stack.isEmpty();
	}
}
