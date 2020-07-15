package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSum {
	public List<List<Integer>> combinationSum(int[] candidates, int target) {
		List<List<Integer>> ans = new ArrayList<List<Integer>>();
		Arrays.sort(candidates);
		backTrack(candidates, target, ans, 0, new ArrayList<Integer>());
		return ans;
	}

	private void backTrack(int[] candidates, int target, List<List<Integer>> res, int i, ArrayList<Integer> tempList) {
		if (target < 0) {
			return;
		}
		if (target == 0) {
			res.add(new ArrayList<>(tempList));
			return;
		}
		for (int start = i; start < candidates.length; start++) {
			if (target < candidates[start]) {
				break;
			}
			tempList.add(candidates[start]);
			backTrack(candidates, target - candidates[start], res, start, tempList);
			tempList.remove(tempList.size() - 1);
		}
	}
}
