package dynamicProgramming;

public class MovingCount {
	public static boolean[][] visited;
	public static int ROWS = 0;
	public static int COLS = 0;
	public static int K = 0;
	public static int RES = 0;

	public int movingCount(int threshold, int rows, int cols) {
		visited = new boolean[rows][cols];
		K = threshold;
		ROWS = rows;
		COLS = cols;
		move(0, 0);
		return RES;
	}

	public void move(int i, int j) {
		RES++;
		visited[i][j] = true;
		if (i + 1 <= ROWS - 1 && judgeEnter(i + 1) + judgeEnter(j) <= K && visited[i + 1][j] == false) {
			move(i + 1, j);
		}
		if (i - 1 >= 0 && judgeEnter(i - 1) + judgeEnter(j) <= K && visited[i - 1][j] == false) {
			move(i - 1, j);
		}
		if (j + 1 <= COLS - 1 && judgeEnter(i) + judgeEnter(j + 1) <= K && visited[i][j + 1] == false) {
			move(i, j + 1);
		}
		if (j - 1 >= 0 && judgeEnter(i) + judgeEnter(j - 1) <= K && visited[i][j - 1] == false) {
			move(i, j - 1);
		}
		return;
	}

	public int judgeEnter(int x) {
		int ans = 0;
		while (x != 0) {
			ans = ans + x % 10;
			x = x / 10;
		}
		return ans;
	}

	public static void main(String[] args) {
		System.out.println(new MovingCount().movingCount(15, 20, 20));
	}
}
