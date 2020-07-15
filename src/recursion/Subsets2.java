package recursion;

import java.util.ArrayList;
import java.util.List;

public class Subsets2 {
	public List<List<Integer>> res = new ArrayList<>();

	public List<List<Integer>> subsets(int[] nums) {
		backtrack(0, nums, new ArrayList<Integer>());
		return res;
	}

	private void backtrack(int i, int[] nums, ArrayList<Integer> temp) {
		res.add(new ArrayList<>(temp));
		for (int j = i; j < nums.length; j++) {
			temp.add(nums[j]);
			backtrack(j + 1, nums, temp);
			temp.remove(temp.size() - 1);
		}
	}
}
