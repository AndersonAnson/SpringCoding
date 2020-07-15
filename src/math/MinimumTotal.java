package math;
import java.util.*;
public class MinimumTotal {
	int row;
	Integer[][] memo;

	public int minimumTotal(List<List<Integer>> triangle) {
		row = triangle.size();
		memo = new Integer[row][row];
		return helper(0, 0, triangle);
	}

	public int helper(int level, int column, List<List<Integer>> triangle) {
		if (memo[level][column] != null) {
			return memo[level][column];
		}
		if (level == row - 1) {
			return memo[level][column] = triangle.get(level).get(column);
		}
		int left = helper(level + 1, column, triangle);
		int right = helper(level + 1, column + 1, triangle);
		return memo[level][column] = Math.min(left, right) + triangle.get(level).get(column);
	}
}
