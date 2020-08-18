package dfsbfs;

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
        visited[row * cols + col] = true;// ���ʹ���
        // ������
        if (row > 0 && walk(matrix, rows, cols, str, row - 1, col, len + 1))
            return true;
        // ������
        if (row < rows - 1 && walk(matrix, rows, cols, str, row + 1, col, len + 1))
            return true;
        // ������
        if (col < cols - 1 && walk(matrix, rows, cols, str, row, col + 1, len + 1))
            return true;
        // ������
        if (col > 0 && walk(matrix, rows, cols, str, row, col - 1, len + 1))
            return true;
        visited[row * rows + col] = false;
        return false;
    }

    public static void main(String[] args) {
        char[] input = {'a', 'b', 'c', 'e', 's', 'f', 'c', 's', 'a', 'd', 'e', 'e'};
        char[] input2 = {'b', 'c', 'c', 'e', 'd', 's'};
        System.out.print(new HasPath().hasPath(input, 3, 4, input2));
    }
}
