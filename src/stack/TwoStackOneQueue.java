package stack;

import java.util.ArrayList;
import java.util.Stack;

public class TwoStackOneQueue {
	Stack<Integer> stack1 = new Stack<Integer>();
	Stack<Integer> stack2 = new Stack<Integer>();

	public void push(int node) {
		stack1.push(node);
	}

	public int pop() {
		while (stack1.size() > 1) {
			stack2.push(stack1.pop());
		}
		int ans = stack1.pop();
		while (stack2.size() != 0) {
			stack1.push(stack2.pop());
		}
		return ans;
	}

	public static void main(String[] args) {
		ArrayList<Integer> ans = new ArrayList<>();
		TwoStackOneQueue tqq=new TwoStackOneQueue();
		tqq.push(1);
		tqq.push(2);
		tqq.push(3);
		ans.add(tqq.pop());
		ans.add(tqq.pop());
		tqq.push(4);
		ans.add(tqq.pop());
		tqq.push(5);
		ans.add(tqq.pop());
		ans.add(tqq.pop());
	}
}
