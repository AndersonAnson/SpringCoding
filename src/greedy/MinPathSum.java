package greedy;

public class MinPathSum {
	public int minPathSum(int[][] grid) {
		int width = grid[0].length;
		int height = grid.length;
		int[][] resultMap = new int[grid.length][grid[0].length];
		int result = 0;
		if (width == 1 && height == 1) {
			return grid[0][0];
		}
		// 初始化第一行
		resultMap[0][0] = grid[0][0];
		for (int j = 1; j < width; j++) {
			resultMap[0][j] = resultMap[0][j - 1] + grid[0][j];
		}

		for (int i = 1; i < height; i++) {
			resultMap[i][0] = resultMap[i - 1][0] + grid[i][0];
		}

		for (int i = 1; i < height; i++) {
			for (int j = 1; j < width; j++) {
				resultMap[i][j] = Math.min(resultMap[i - 1][j] + grid[i][j], resultMap[i][j - 1] + grid[i][j]);
			}

		}
		result = resultMap[height - 1][width - 1];
		return result;
	}
}
