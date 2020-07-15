package stack;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		创建一个只存放数字的栈
//		创建一个只存放符号的栈
		String exp = "3+8*2-1";
		Stack numStack = new Stack(10);
		Stack operStack = new Stack(10);
		int index = 0;
		char ch = ' ';
		int res = 0;

		while (true) {
			ch = exp.substring(index, index + 1).charAt(0);
			if (operStack.isOper(ch)) {
				if (!operStack.isEmpty()) {
					if (operStack.priority(ch) == 0) {
						int num1 = numStack.pop();
						int num2 = numStack.pop();
						char oper = (char) operStack.pop();
						res = numStack.cal(num1, num2, oper);
					} else {
						operStack.push(ch);
					}
				} else {
					operStack.push(ch);
				}
			} else {
				numStack.push(ch - 48);
			}
			index++;
			if (index == exp.length()) {
				break;
			}
		}
		while (true) {
			if (operStack.isEmpty()) {
				break;
			}
			int num1 = numStack.pop();
			int num2 = numStack.pop();
			char oper = (char) operStack.pop();
			res = numStack.cal(num1, num2, oper);
			numStack.push(res);
		}
		System.out.println(res);
	}

}
