package stack;

import java.util.Stack;

public class MyQueue {
	Stack<Integer> stack;

	public MyQueue() {
		stack = new Stack<>();
	}

	public void push(int x) {
		stack.push(x);
	}

	public int pop() {
		Stack<Integer> tmpStack = new Stack<>();
		while (stack.size() > 1) {
			int tmp = stack.pop();
			tmpStack.add(tmp);
		}
		int ans = stack.pop();
		while (tmpStack.size() > 0) {
			stack.push(tmpStack.pop());
		}
		return ans;
	}

	public int peek() {
		Stack<Integer> tmpStack = new Stack<>();
		while (stack.size() > 1) {
			int tmp = stack.pop();
			tmpStack.add(tmp);
		}
		int ans = stack.peek();
		while (tmpStack.size() > 0) {
			stack.push(tmpStack.pop());
		}
		return ans;
	}

	public boolean empty() {
		return stack.isEmpty();
	}
}
