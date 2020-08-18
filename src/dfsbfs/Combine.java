package dfsbfs;

import java.util.LinkedList;
import java.util.List;

public class Combine {
	List<List<Integer>> output = new LinkedList<>();
	int n, k;

	public List<List<Integer>> combine(int n, int k) {
		this.n = n;
		this.k = k;
		backTrack(1, new LinkedList<Integer>());
		return output;
	}

	public void backTrack(int first, LinkedList<Integer> curr) {
		if (curr.size() == k) {
			output.add(new LinkedList(curr));
		}
		for (int i = first; i < n + 1; i++) {
			curr.add(i);
			backTrack(i + 1, curr);
			curr.removeLast();
		}
	}
}
