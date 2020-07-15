package alibaba;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class DengChaJuZhen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int q = sc.nextInt();
		int[][] matrix = new int[n][m];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				matrix[i][j] = sc.nextInt();
			}
		}
//		for (int i = 0; i < n; i++) {
//			for (int j = 0; j < m; j++) {
//				System.out.print(matrix[i][j] + "\t");
//			}
//			System.out.println();
//		}
		// 定义一个行差值数组
		int[] rowDiff = new int[n];
		// 定义一个列差值数组
		int[] colDiff = new int[m];
		Arrays.fill(rowDiff, 0);
		Arrays.fill(colDiff, 0);
		int count = 0;
		HashMap<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < n; i++) {
			count = 0;
			for (int j = 0; j < m; j++) {
				if (matrix[i][j] != 0) {
					count++;
					if (map.containsKey(i)) {
						int temp = map.get(i);
						rowDiff[i] = (matrix[i][j] - temp) / count;
						break;
					}
					map.put(i, matrix[i][j]);

				} else {
					continue;
				}
			}

		}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				matrix[i][j] = matrix[i][0] + rowDiff[i] * j;
			}
		}
		map.clear();
		for (int j = 0; j < m; j++) {
			count = 0;
			for (int i = 0; i < n; i++) {
				if (matrix[i][j] != 0) {
					count++;
					if (map.containsKey(j)) {
						int temp = map.get(j);
						colDiff[j] = (matrix[i][j] - temp) / count;
						break;
					}
					map.put(j, matrix[i][j]);
				} else {
					continue;
				}
			}

		}
		for (int i = 0; i < q; i++) {
			int row = sc.nextInt();
			int col = sc.nextInt();
			row = row - 1;
			col = col - 1;
			if (rowDiff[row] == 0 && colDiff[col] == 0) {
				System.out.println("Unkonwn");
			} else {
				System.out.println(matrix[row][col]);
			}
		}
	}

}
