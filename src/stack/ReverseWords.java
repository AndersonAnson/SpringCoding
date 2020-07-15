package stack;

import java.util.Stack;

public class ReverseWords {
	public String reverseWords(String s) {
		Stack<String> stack = new Stack<>();
		StringBuilder sb = new StringBuilder();
		s = s + ' ';
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == ' ') {
				if (sb.length() != 0) {
					stack.push(sb.toString());
					sb = new StringBuilder();
				}
			} else {
				sb.append(s.charAt(i));
			}
		}
		if (stack.isEmpty()) {
			return "";
		}
		StringBuilder res = new StringBuilder();
		res.append(stack.pop());
		while (!stack.empty()) {
			res.append(' ');
			res.append(stack.pop());
		}
		return res.toString();
	}
}
