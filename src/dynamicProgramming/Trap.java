package dynamicProgramming;

public class Trap {
	public int trap(int[] height) {
		int ans = 0;
		for (int i = 1; i < height.length; i++) {
			int maxLeft = 0;
			for (int j = i - 1; j >= 0; j--) {
				if (height[j] > maxLeft) {
					maxLeft = height[j];
				}
			}
			int maxRight = 0;
			for (int j = i + 1; j < height.length; j++) {
				if (height[j] > maxRight) {
					maxRight = height[j];
				}
			}
			int min = Math.min(maxLeft, maxRight);
			if (min > height[i]) {
				ans = ans + (min - height[i]);
			}
		}
		return ans;
	}
}
