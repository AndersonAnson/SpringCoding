package olddfsbfs;

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
				// ����ǵ����е�һ���㣬����û�б����ʹ�
				// ������Ϊ (i,j) �ĵ㿪ʼ���й�����ȱ���
				if (!marked[i][j] && grid[i][j] == '1') {
					count++;
					LinkedList<Integer> queue = new LinkedList<>();
					// С���ɣ�������ת��Ϊһ�����֣����򣬵���һ�������
					queue.addLast(i * COLS + j);
					// ע�⣺����Ҫ������Ѿ����ʹ�
					marked[i][j] = true;
					while (!queue.isEmpty()) {
						int cur = queue.removeFirst();
						int curX = cur / COLS;
						int curY = cur % COLS;
						// �õ� 4 �����������
						for (int k = 0; k < 4; k++) {
							int newX = curX + directions[k][0];
							int newY = curY + directions[k][1];
							// �����Խ�硢û�б����ʹ������һ�Ҫ��½�أ��Ҿͼ���������У�������е�ͬʱ��Ҫ�ǵñ���Ѿ����ʹ�
							if (inArea(newX, newY) && grid[newX][newY] == '1' && !marked[newX][newY]) {
								queue.addLast(newX * COLS + newY);
								// ���ر�ע�⡿�ڷ�������Ժ�Ҫ���ϱ�ǳ��Ѿ����ʹ�������Ҳ��ʮ������ģ�����ֻҪ�����˶��У�����綼������������������ڳ����е�ʱ���ٱ��
								// ���ر�ע�⡿����ǳ����е�ʱ���ٱ�ǣ�����ɺܶ��ظ��Ľ�������У�����ظ��Ĳ�������仰�����û��д�Եط�����������س�ʱ��
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
