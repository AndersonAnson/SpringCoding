package greedy;

public class MaxArea {
	public int maxArea(int[] height) {
		int maxArea = 0;
		int zuo = 0;
		int you = height.length - 1;
		while (zuo < you) {
			int gao = Math.min(height[zuo], height[you]);
			int kuan = you - zuo;
			maxArea = Math.max(maxArea, kuan * gao);
			if (height[zuo] < height[you]) {
				zuo++;
			} else
				you--;
		}
		return maxArea;
	}
}
