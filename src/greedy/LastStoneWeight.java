package greedy;

import java.util.Arrays;

public class LastStoneWeight {
	public int lastStoneWeight(int[] stones) {
		if (stones.length == 1) {
			return stones[0];
		}
		int right = stones.length - 1;
		Arrays.sort(stones);
		while (stones[right - 1] != 0) {
			int x = stones[right - 1];
			int y = stones[right];
			if (x == y) {
				stones[right - 1] = stones[right] = 0;
			} else {
				stones[right - 1] = 0;
				stones[right] = y - x;
			}
			Arrays.sort(stones);
		}
		return stones[right];
	}
}
