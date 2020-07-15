package math;

import java.util.Scanner;

public class RectangleOverlap {
	/*
	 * ���ۺ���������ص�����Ҳ����������ɡ� ������ȡ����n�ľ����е������� ���Ա����ߵĽ��㼴�ɡ�
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] X_leftDown = new int[n];
		int[] Y_leftDown = new int[n];
		int[] X_rightUp = new int[n];
		int[] Y_rightUp = new int[n];
		for (int i = 0; i < n; i++) {
			X_leftDown[i] = in.nextInt();
		}
		for (int i = 0; i < n; i++) {
			Y_leftDown[i] = in.nextInt();
		}
		for (int i = 0; i < n; i++) {
			X_rightUp[i] = in.nextInt();
		}
		for (int i = 0; i < n; i++) {
			Y_rightUp[i] = in.nextInt();
		}
		int ans = 0;
		int cnt = 0;
		for (int x : X_leftDown) {
			for (int y : Y_leftDown) {
				for (int i = 0; i < n; i++) {
					if (x >= X_leftDown[i] && x < X_rightUp[i] && y >= Y_leftDown[i] && y < Y_rightUp[i]) {
						cnt++;
					}
				}
				if (cnt > ans) {
					ans = cnt;
				}
				cnt = 0;
			}
		}
		System.out.println(ans);
	}

}
