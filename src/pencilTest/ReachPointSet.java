package pencilTest;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Stack;

public class ReachPointSet {
	public Map<Integer, Boolean> states = new HashMap<Integer, Boolean>();
	public Stack<Integer> stack = new Stack();

	public int getNextNode(int start, int end, int x, int y) {
		int nextNode = -1;
		if (y == -1) {
			int n = start;
			if (!states.get(n)) {
				return n;
			}
			return -1;
		}
		return -1;
	}

	public void visit(int x, int y) {

	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String input = in.nextLine();
		String[] splitSet = input.split("|");
		String edgeSet = splitSet[0];
		String startPoint = splitSet[1];
		String endPoint = splitSet[2];
		String[] split2Set = edgeSet.split(",");
	}
}
