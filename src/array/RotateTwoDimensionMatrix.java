package array;

public class RotateTwoDimensionMatrix {
	public void rotate(int[][] matrix) {
		int length = matrix.length;
		// ×ªÖÃ¾ØÕó
		for (int i = 0; i < length; i++) {
			for (int j = i; j < length; j++) {
				int tmp = matrix[j][i];
				matrix[j][i] = matrix[i][j];
				matrix[i][j] = tmp;
			}
		}
		// ·´×ª¾ØÕó
		for (int i = 0; i < length; i++) {
			for (int j = 0; j < length / 2; j++) {
				int tmp = matrix[i][length - 1 - j];
				matrix[i][length - 1 - j] = matrix[i][j];
				matrix[i][j] = tmp;
			}
		}
	}
}
