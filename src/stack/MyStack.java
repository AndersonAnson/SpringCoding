package stack;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class MyStack {
	Queue<Integer> queue;
	int top;
	/** Initialize your data structure here. */
    public MyStack() {
        queue=new LinkedList<>();
    }
    
    /** Push element x onto stack. */
    public void push(int x) {
        top=x;
        queue.add(top);
    }
    
    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        Queue<Integer> tmp=new LinkedList<>();
        int oldTop=top;
        int size=queue.size();
        for(int i=0;i<size-1;i++) {
        	top=queue.remove();
        	tmp.offer(top);
        }
        queue=tmp;
        return oldTop;
    }
    
    /** Get the top element. */
    public int top() {
        return top;
    }
    
    /** Returns whether the stack is empty. */
    public boolean empty() {
        return queue.isEmpty();
    }
}
