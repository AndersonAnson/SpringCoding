package stack;

import java.util.Scanner;

public class Stack {
//	用数组实现
	int maxSize;
	int[] arr;
	int top = -1;

	public Stack(int size) {
		this.maxSize = size;
		this.arr = new int[size];
	}

	public void push(int val) {
		if (!isFull()) {
			top++;
			arr[top] = val;
		}
	}

	public int peek() {
		return arr[top];
	}

	public int pop() {
		if (!isEmpty()) {
			int value = arr[top];
			top--;
			return value;

		}
		return -9999;
	}

	public void show() {
		if (isEmpty()) {
			return;
		}
		for (int i = top; i >= 0; i--) {
			System.out.print(arr[i] + " ");
		}
	}

	public boolean isFull() {
		return top == maxSize - 1;
	}

	public boolean isEmpty() {
		return top == -1;
	}

//	返回运算符的优先级
	public int priority(char oper) {
		if (oper == '*' || oper == '/') {
			return 1;
		} else if (oper == '+' || oper == '-') {
			return 0;
		} else {
			return -1;
		}
	}

	public boolean isOper(char val) {
		return val == '+' || val == '-' || val == '*' || val == '/';
	}

	public int cal(int num1, int num2, int oper) {
		int res = 0;
		switch (oper) {
		case '+':
			res = num1 + num2;
			break;
		case '-':
			res = num2 - num1;
			break;
		case '*':
			res = num1 * num2;
			break;
		case '/':
			res = num2 / num1;
			break;
		default:
			break;
		}
		return res;
	}

	public static void main(String[] args) {
		Stack stack = new Stack(10);
		Scanner scanner = new Scanner(System.in);
		while (true) {
			int val = scanner.nextInt();
			if (val == -1) {
				break;
			} else {
				stack.push(val);
			}
		}
		stack.show();

	}
}
