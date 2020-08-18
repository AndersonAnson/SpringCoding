package dfsbfs;

import java.util.ArrayDeque;
import java.util.HashSet;
import java.util.Queue;
import java.util.Set;

public class NumSquaresByBFS {
	public int numSquares(int n) {
		Queue<Integer> queue = new ArrayDeque<>();
		// ���� set ����ŷ��ظ���Ԫ��
		Set<Integer> visited = new HashSet<>();
		queue.add(n);
		// ���� level ��¼��ȫƽ�����ĸ���
		int level = 0;
		while (!queue.isEmpty()) {
			int len = queue.size();
			// ÿ����Ԫ����Ӿʹ�����ʣ����ƽ����
			level++;
			for (int i = 0; i < len; i++) {
				int node = queue.poll();
				for (int j = 1; j * j <= node; j++) {
					int next = node - j * j;
					if (next == 0) {
						return level;
					}
					// ��� set ����û�д�ŵ�ǰԪ�أ���������,�� set
					if (!visited.contains(next)) {
						queue.add(next);
						visited.add(next);
					}
				}
			}
		}
		return 0;
	}

	public int numSquares2(int n) {
		int minSqrt = (int) Math.sqrt(n);
		Queue<Integer> q = new ArrayDeque<>();
		int step = 0;
		q.add(0);
		while (!q.isEmpty()) {
			step++;
			int size = q.size();
			for (int i = 0; i < size; i++) {
				int front = q.poll();
				for (int j = 1; j <= minSqrt; j++) {
					int sum = front + j * j;
					if (sum == n)
						return step;
					if (sum > n)
						continue;
					q.add(sum);
				}
			}
		}
		return -1;
	}
}
