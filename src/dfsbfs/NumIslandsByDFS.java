package dfsbfs;

public class NumIslandsByDFS {
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
					num_islands++;
					dfs(grid, r, c);
				}
			}
		}

		return num_islands;
	}

	void dfs(char[][] grid, int r, int c) {
		if (r < 0 || c < 0 || r >= ROWS || c >= COLS || grid[r][c] == '0') {
			return;
		}

		grid[r][c] = '0';
		dfs(grid, r - 1, c);
		dfs(grid, r + 1, c);
		dfs(grid, r, c - 1);
		dfs(grid, r, c + 1);
	}

}
