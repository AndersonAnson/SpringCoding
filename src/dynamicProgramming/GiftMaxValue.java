package dynamicProgramming;

public class GiftMaxValue {
	public static int maxValue = 0;

	public int maxValue(int[][] grid) {
		findPath(grid, 0, 0);
		return maxValue;
	}

	public void findPath(int[][] grid, int i, int j) {
		maxValue = maxValue + grid[i][j];
		int m = grid.length;
		int n = grid[0].length;
		if (i == m - 1 && j == n - 1) {
			return;
		}
		if (i == m - 1) {
			findPath(grid, i, j + 1);
		} else if (j == n - 1) {
			findPath(grid, i + 1, j);
		} else {
			if (grid[i + 1][j] > grid[i][j + 1]) {
				findPath(grid, i + 1, j);
			} else {
				findPath(grid, i, j + 1);
			}
//			int tmpMax = Math.max(grid[i + 1][j], grid[i][j + 1]);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int[][] grid = { { 1, 3, 1 }, { 1, 5, 1 }, { 4, 2, 1 }, { 0, 0, 3 } };
		int[][] grid = {{12,1,9} };
		System.out.println(new GiftMaxValue().maxValue(grid));
	}

}
