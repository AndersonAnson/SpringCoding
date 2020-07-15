package recursion;

public class ComputeArea {
	public int computeArea(int A, int B, int C, int D, int E, int F, int G, int H) {
		if (A > E) {
			return computeArea(E, F, G, H, A, B, C, D);
		}
		int area = 0;
		if (B >= H || D <= F || C <= E) {
			area = Math.abs((C - A)) * Math.abs((D - B)) + Math.abs((G - E)) * Math.abs((H - F));
			return area;
		}
		int left = Math.max(A, E);
		int right = Math.min(C, G);
		int up = Math.min(D, H);
		int down = Math.max(B, F);
		System.out.println(down);
		area = Math.abs((C - A)) * Math.abs((D - B)) + Math.abs((G - E)) * Math.abs((H - F))
				- Math.abs(up - down) * Math.abs(right - left);
		return area;
	}
}
