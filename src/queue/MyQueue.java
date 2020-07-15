package queue;

import java.util.Stack;

public class MyQueue {
	Stack<Integer> stack;
    /** Initialize your data structure here. */
    public MyQueue() {
        stack=new Stack<>();
    }
    
    /** Push element x to the back of queue. */
    public void push(int x) {
        stack.push(x);
    }
    
    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        Stack<Integer> tmpStack=new Stack<>();
        while(stack.size()>1) {
        	int tmp=stack.pop();
        	tmpStack.add(tmp);
        }
        int ans=stack.pop();
        while(tmpStack.size()>0) {
        	stack.push(tmpStack.pop());
        }
        return ans;
    }
    
    /** Get the front element. */
    public int peek() {
    	Stack<Integer> tmpStack=new Stack<>();
        while(stack.size()>1) {
        	int tmp=stack.pop();
        	tmpStack.add(tmp);
        }
        int ans=stack.peek();
        while(tmpStack.size()>0) {
        	stack.push(tmpStack.pop());
        }
        return ans;
    }
    
    /** Returns whether the queue is empty. */
    public boolean empty() {
        return stack.isEmpty();
    }
}
