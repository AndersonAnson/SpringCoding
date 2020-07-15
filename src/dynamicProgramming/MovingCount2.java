package dynamicProgramming;

public class MovingCount2 {
	// ͳ���ܹ��ߵ��Ĵ���
	public int count = 0;

	// �ж������Ƿ����Ҫ��
	public boolean isValid(int row, int col, int threshold) {
		int sum = 0;
		while (row > 0) {
			sum += row % 10;
			row = row / 10;
		}
		while (col > 0) {
			sum += col % 10;
			col = col / 10;
		}
		if (sum > threshold)
			return false;
		else
			return true;
	}

	public void help(int i, int j, int threshold, int rows, int cols, int[][] flag) {
		if (i < 0 || i >= rows || j < 0 || j >= cols)
			return;// ������겻�����򲻼���
		if (flag[i][j] == 1)
			return;// ������������ʹ��򲻼���
		if (!isValid(i, j, threshold)) {
			flag[i][j] = 1;// ���������������Ч�ԣ��򲻼������ұ���Ƿ��ʵ�
			return;
		}
		// �����ǹ�����ȱ�������������ȱ���������һ��Ҫ֪����ʱ�����һ��������ֹ����Ҳ����Ҫ�ܹ�ֹͣ��
		// ��Ȼ����ͻ�������ѭ�������һ����������������Ŀ����Ҫע��ĵط�
		flag[i][j] = 1;
		count++;
		help(i - 1, j, threshold, rows, cols, flag);// �����������ҽڵ�
		help(i + 1, j, threshold, rows, cols, flag);
		help(i, j - 1, threshold, rows, cols, flag);
		help(i, j + 1, threshold, rows, cols, flag);
	}

	public int movingCount(int threshold, int rows, int cols) {
		int[][] flag = new int[rows][cols];
		help(0, 0, threshold, rows, cols, flag);
		return count;
	}
}
