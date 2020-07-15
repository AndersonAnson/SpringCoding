package DFSBFS;

import java.util.LinkedList;

public class NumIslandsByBFS {
	private static int ROWS;
	private static int COLS;

	public int numIslands(char[][] grid) {
		int[][] directions = { { -1, 0 }, { 0, -1 }, { 1, 0 }, { 0, 1 } };

		ROWS = grid.length;
		if (ROWS == 0) {
			return 0;
		}
		COLS = grid[0].length;
		boolean[][] marked = new boolean[ROWS][COLS];
		int count = 0;
		for (int i = 0; i < ROWS; i++) {
			for (int j = 0; j < COLS; j++) {
				// 如果是岛屿中的一个点，并且没有被访问过
				// 从坐标为 (i,j) 的点开始进行广度优先遍历
				if (!marked[i][j] && grid[i][j] == '1') {
					count++;
					LinkedList<Integer> queue = new LinkedList<>();
					// 小技巧：把坐标转换为一个数字
					// 否则，得用一个数组存
					queue.addLast(i * COLS + j);
					// 注意：这里要标记上已经访问过
					marked[i][j] = true;
					while (!queue.isEmpty()) {
						int cur = queue.removeFirst();
						int curX = cur / COLS;
						int curY = cur % COLS;
						// 得到 4 个方向的坐标
						for (int k = 0; k < 4; k++) {
							int newX = curX + directions[k][0];
							int newY = curY + directions[k][1];
							// 如果不越界、没有被访问过、并且还要是陆地，我就继续放入队列，放入队列的同时，要记得标记已经访问过
							if (inArea(newX, newY) && grid[newX][newY] == '1' && !marked[newX][newY]) {
								queue.addLast(newX * COLS + newY);
								// 【特别注意】在放入队列以后，要马上标记成已经访问过，语义也是十分清楚的：反正只要进入了队列，你迟早都会遍历到它
								// 而不是在出队列的时候再标记
								// 【特别注意】如果是出队列的时候再标记，会造成很多重复的结点进入队列，造成重复的操作，这句话如果你没有写对地方，代码会严重超时的
								marked[newX][newY] = true;
							}
						}
					}
				}
			}

		}
		return count;
	}

	private boolean inArea(int x, int y) {
		return x >= 0 && x < ROWS && y >= 0 && y < COLS;
	}
}
