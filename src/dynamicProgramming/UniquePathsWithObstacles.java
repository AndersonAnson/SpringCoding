package dynamicProgramming;

public class UniquePathsWithObstacles {
	public int uniquePathsWithObstacles(int[][] obstacleGrid) {
		int R = obstacleGrid.length;
		int C = obstacleGrid[0].length;
		;
		if (obstacleGrid[0][0] == 1) {
			return 0;
		}
		obstacleGrid[0][0] = 1;
		for (int i = 1; i < R; i++) {
			if (obstacleGrid[i][0] == 0 && obstacleGrid[i - 1][0] == 1) {
				obstacleGrid[i][0] = 1;
			} else {
				obstacleGrid[i][0] = 0;
			}

		}
		for (int j = 1; j < C; j++) {
			if (obstacleGrid[0][j] == 0 && obstacleGrid[0][j - 1] == 1) {
				obstacleGrid[0][j] = 1;
			} else {
				obstacleGrid[0][j] = 0;
			}
		}
		for (int i = 1; i < R; i++) {
			for (int j = 1; j < C; j++) {
				if (obstacleGrid[i][j] == 0) {
					obstacleGrid[i][j] = obstacleGrid[i - 1][j] + obstacleGrid[i][j - 1];
				} else {
					obstacleGrid[i][j] = 0;
				}
			}
		}
		return obstacleGrid[R - 1][C - 1];
	}
}
