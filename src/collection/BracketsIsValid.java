package collection;

import java.util.HashMap;
import java.util.Stack;

public class BracketsIsValid {
	private HashMap<Character, Character> mappings;

	public void Solution(){
        this.mappings=new HashMap<Character,Character>();
        this.mappings.put(')','(');
        this.mappings.put('}','{');
        this.mappings.put(']','[');
    }

	public boolean isValid(String s) {
		Stack<Character> st = new Stack<Character>();
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (this.mappings.containsKey(c)) {
				char topElement = st.empty() ? '#' : st.pop();
				if (topElement != this.mappings.get(c)) {
					return false;
				}

			} else {
				st.push(c);
			}
		}
		return st.isEmpty();
	}
}
