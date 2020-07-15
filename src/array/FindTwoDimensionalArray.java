package array;

public class FindTwoDimensionalArray {
    public boolean Find(int target, int[][] array) {
        int rows = array.length;
        if (rows == 0) {
            return false;
        }
        int cols = array[0].length;
        if (cols == 0) {
            return false;
        }
//		��ʼѭ��
//		�����¿�ʼ
        int i = rows - 1;
        int j = 0;

        while (i >= 0 || j <= cols - 1) {
            if (target == array[i][j]) {
                return true;
            } else if (target > array[i][j]) {
//				ȥ����һ��
                j = j + 1;
            } else {
//				ȥ����һ��
                i = i - 1;
            }
        }
        return false;
    }
}
