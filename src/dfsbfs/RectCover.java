package dfsbfs;

public class RectCover {
	public int rectCover(int target) {
//		�õݹ� �����ʼֵ �͵ݹ����
		if (target <= 2) {
			return target;
		} else {
			return rectCover(target - 1) + rectCover(target - 2);
		}
	}
}
