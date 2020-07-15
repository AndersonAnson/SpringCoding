package pencilTest;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class HeroAndGuai {
	public static boolean inArea(int x, int y, int n, int m) {
		return x >= 0 && x < n && y >= 0 && y < m;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[][] map = new int[n][m];
		String[] s = new String[n];
		for (int i = 0; i < n; i++) {
			s[i] = sc.next();
		}
		for (int i = 0; i < s.length; i++) {
			for (int j = 0; j < s[i].length(); j++) {
				if (s[i].charAt(j) == '1') {
					map[i][j] = 1;
				} else {
					map[i][j] = 0;
				}
			}
		}

		int[][] dist = new int[n][m];
		boolean[][] visit = new boolean[n][m];
		int[][] directions = { { -1, 0 }, { 0, -1 }, { 1, 0 }, { 0, 1 } };
		int tempDist = 1;
		for (int r = 0; r < n; r++) {
			for (int c = 0; c < m; c++) {
				if (map[r][c] == 0) {
					dist[r][c] = 0;
				} else {
					map[r][c] = 0;
					Queue<Integer> q = new LinkedList<>();
					q.add(r * m + c);
					visit[r][c] = true;
					while (!q.isEmpty()) {
						int id = q.remove();
						int row = id / m;
						int col = id % m;
						for (int k = 0; k < 4; k++) {
							row = row + directions[k][0];
							col = col + directions[k][1];
							if (inArea(row, col, n, m) && map[row][col] == '1' && !visit[row][col]) {
								q.add(row * m + col);
								tempDist++;
								visit[row][col] = true;
							} else {
								dist[r][c] = tempDist;
								break;
							}
						}
						break;
					}
				}
			}
			tempDist = 1;
		}
		for (int i = 0; i < dist.length; i++) {
			for (int j = 0; j < dist[0].length; j++) {
				System.out.print(dist[i][j] + " ");
			}
			System.out.println();
		}
	}

}
