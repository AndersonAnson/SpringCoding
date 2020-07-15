package recursion;

import org.junit.Test;

public class HasPath {
    boolean[] visited = null;

    public boolean hasPath(char[] matrix, int rows, int cols, char[] str) {
        visited = new boolean[matrix.length];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (walk(matrix, rows, cols, str, i, j, 0)) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean walk(char[] matrix, int rows, int cols, char[] str, int row, int col, int len) {
        if (matrix[row * cols + col] != str[len] || visited[row * cols + col] == true)
            return false;
        if (len == str.length - 1)
            return true;
        visited[row * cols + col] = true;// 访问过了
        // 向上走
        if (row > 0 && walk(matrix, rows, cols, str, row - 1, col, len + 1))
            return true;
        // 向下走
        if (row < rows - 1 && walk(matrix, rows, cols, str, row + 1, col, len + 1))
            return true;
        // 向右走
        if (col < cols - 1 && walk(matrix, rows, cols, str, row, col + 1, len + 1))
            return true;
        // 向左走
        if (col > 0 && walk(matrix, rows, cols, str, row, col - 1, len + 1))
            return true;
        visited[row * rows + col] = false;
        return false;
    }

    @Test
    public static char[][] printMatrix(char[] matrix, int rows, int cols) {
        char[][] bigMatrix = new char[rows][cols];
        int row = -1;
        int col = 0;
        // 遍历matrix字符数组
        for (int i = 0; i < matrix.length; i++) {
            if (i % cols == 0) {
                row++;
                col = 0;
            }
            bigMatrix[row][col] = matrix[i];
            col++;
        }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(bigMatrix[i][j] + " ");
            }
            System.out.println();
        }
        return bigMatrix;
    }

    public static void main(String[] args) {
        char[] input = {'a', 'b', 'c', 'e', 's', 'f', 'c', 's', 'a', 'd', 'e', 'e'};
        char[] input2 = {'b', 'c', 'c', 'e', 'd', 's'};
        System.out.print(new HasPath().hasPath(input, 3, 4, input2));
    }
}
