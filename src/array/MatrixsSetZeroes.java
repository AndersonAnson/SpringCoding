package array;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class MatrixsSetZeroes {
	public void setZeroes(int[][] matrix) {
		int R = matrix.length;
		int C = matrix[0].length;
		Set<Integer> rowSet = new HashSet<Integer>();
		Set<Integer> columnSet = new HashSet<Integer>();
		for (int i = 0; i < R; i++) {
			for (int j = 0; j < C; j++) {
				if (matrix[i][j] == 0) {
					rowSet.add(i);
					columnSet.add(j);
				}
			}
		}
		Iterator<Integer> rowIterator = rowSet.iterator();
		Iterator<Integer> columnIterator = columnSet.iterator();
		while (rowIterator.hasNext()) {
			int rowFlag = rowIterator.next();
			for (int j = 0; j < C; j++) {
				matrix[rowFlag][j] = 0;
			}
		}
		while (columnIterator.hasNext()) {
			int colFlag = columnIterator.next();
			for (int i = 0; i < R; i++) {
				matrix[i][colFlag] = 0;
			}
		}
	}
}
