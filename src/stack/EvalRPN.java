package stack;
import java.util.Stack;
public class EvalRPN {
	public int evalRPN(String[] tokens) {
		Stack<Integer> s = new Stack<>();
		Integer answer = 0;
		if (tokens.length == 1) {
			return Integer.valueOf(tokens[0]);
		}
		for (int i = 0; i < tokens.length; i++) {
			if (tokens[i].equals("+")) {
				Integer first = s.pop();
				Integer second = s.pop();
				answer = first + second;
				System.out.println(answer);
				s.add(answer);
			} else if (tokens[i].equals("*")) {
				Integer first = s.pop();
				Integer second = s.pop();
				answer = first * second;
				System.out.println(answer);
				s.add(answer);
			} else if (tokens[i].equals("/")) {
				Integer first = s.pop();
				Integer second = s.pop();
				answer = second / first;
				System.out.println(answer);
				s.add(answer);
			} else if (tokens[i].equals("-")) {
				Integer first = s.pop();
				Integer second = s.pop();
				answer = second - first;
				System.out.println(answer);
				s.add(answer);
			} else {
				s.add(Integer.valueOf(tokens[i]));
			}
		}
		return answer;
	}
}
