package DFSBFS;

import java.util.LinkedList;
import java.util.Queue;

public class NumIslandsByBFS2 {
	public static int ROWS = 0;
	public static int COLS = 0;

	public int numIslands(char[][] grid) {
		if (grid == null || grid.length == 0) {
			return 0;
		}
		ROWS = grid.length;
		COLS = grid[0].length;
		int num_islands = 0;
		for (int r = 0; r < ROWS; ++r) {
			for (int c = 0; c < COLS; ++c) {
				if (grid[r][c] == '1') {
					++num_islands;
					grid[r][c] = '0'; // mark as visited
					Queue<Integer> neighbors = new LinkedList<>();
					neighbors.add(r * COLS + c);
					while (!neighbors.isEmpty()) {
						int id = neighbors.remove();
						int row = id / COLS;
						int col = id % COLS;
						if (row - 1 >= 0 && grid[row - 1][col] == '1') {
							neighbors.add((row - 1) * COLS + col);
							grid[row - 1][col] = '0';
						}
						if (row + 1 < ROWS && grid[row + 1][col] == '1') {
							neighbors.add((row + 1) * COLS + col);
							grid[row + 1][col] = '0';
						}
						if (col - 1 >= 0 && grid[row][col - 1] == '1') {
							neighbors.add(row * COLS + col - 1);
							grid[row][col - 1] = '0';
						}
						if (col + 1 < COLS && grid[row][col + 1] == '1') {
							neighbors.add(row * COLS + col + 1);
							grid[row][col + 1] = '0';
						}
					}
				}
			}
		}

		return num_islands;
	}
}
