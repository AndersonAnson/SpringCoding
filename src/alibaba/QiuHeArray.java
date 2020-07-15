package alibaba;

import java.util.Scanner;

public class QiuHeArray {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[][] matrix = new int[3][n];
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < n; j++) {
				matrix[i][j] = in.nextInt();
			}
		}
		in.close();
	}
}
