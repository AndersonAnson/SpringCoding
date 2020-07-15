package pencilTest;

import java.util.ArrayList;
import java.util.Scanner;

public class DollQianZhui {
	public static double[][] sum;
	public static double[] start;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		int K = s.nextInt();
		
		start = new double[N];
		for (int i = 0; i < N; i++) {
			start[i] = s.nextDouble();
		}
		s.close();
		sum = new double[K + 1][N + 1];
		double res = searchSum(K, N);
		System.out.println((int) res);
	}

	public static double searchSum(int i, int j) {
		if (i == 0 && j == 1) {
			sum[i][j] = start[0];
			return sum[i][j];
		}
		if (i == 0 && j == 2) {
			sum[i][j] = start[1];
			return sum[i][j];
		}
		if (i == 0 && j == 3) {
			sum[i][j] = start[2];
			return sum[i][j];
		}
		if (i == 0 && j == 4) {
			sum[i][j] = start[3];
			return sum[i][j];
		}
		for (int k = 1; k <= j; k++) {
			sum[i][j] = sum[i][j] + searchSum(i - 1, k);

		}
		return sum[i][j];
	}

}
