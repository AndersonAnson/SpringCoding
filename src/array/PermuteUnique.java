package array;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class PermuteUnique {
	public List<List<Integer>> permuteUnique(int[] nums) {
		List<List<Integer>> res = new ArrayList<>();
		int visited[] = new int[nums.length];
		backtrackUnique(res, nums, new ArrayList<Integer>(), visited);
		res = new ArrayList<List<Integer>>(new HashSet<List<Integer>>(res));
		return res;
	}

	private void backtrackUnique(List<List<Integer>> res, int[] nums, ArrayList<Integer> tmp, int[] visited) {
		if (tmp.size() == nums.length) {
			res.add(new ArrayList<>(tmp));
			return;
		}
		for (int i = 0; i < nums.length; i++) {
			if (visited[i] == 1) {
				continue;
			}
			visited[i] = 1;
			tmp.add(nums[i]);
			backtrackUnique(res, nums, tmp, visited);
			visited[i] = 0;
			tmp.remove(tmp.size() - 1);
		}
	}
}
