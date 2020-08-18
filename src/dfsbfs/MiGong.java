package dfsbfs;

public class MiGong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		����һ����ά����
		int[][] map = new int[8][7];
//		ʹ��1��ʾǽ
		for (int i = 0; i < 7; i++) {
			map[0][i] = 1;
			map[7][i] = 1;
		}
		for (int i = 0; i < 8; i++) {
			map[i][0] = 1;
			map[i][6] = 1;
		}
		map[1][2] = 1;
		map[2][2] = 1;
//		map[3][1] = 1;
//		map[3][2] = 1;
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 7; j++) {
				System.out.print(map[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
		setWay(map,1,1);
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 7; j++) {
				System.out.print(map[i][j] + " ");
			}
			System.out.println();
		}
	}

//	С���1��1����
//	С���ܵ�6��5��˵���ҵ�ͨ·
//	0û���߹� 1��ʾǽ 2��ʾ������ 3��ʾ�õ��Ѿ��߹��˵����߲�ͨ
	public void down(int[][] map, int i, int j) {
		// ��������
		if (map[i + 1][j] != 1) {
			if (map[i + 1][j] == 0) {
				map[i + 1][j] = 2;
			}
		}
	}

	public static boolean setWay(int[][] map, int i, int j) {
		if (map[6][5] == 2) {
			return true;
		} else {
			// �����ǰ����㻹û����
			if (map[i][j] == 0) {
//				������-����-����-�������
				map[i][j] = 2;
//				������
				if (setWay(map, i, j - 1)) {
					return true;
				}
//				������
				else if (setWay(map, i - 1, j)) {
					return true;
				} 
//				��������
				else if (setWay(map, i + 1, j)) {
					return true;
				}
//				������
				else if (setWay(map, i, j + 1)) {
					return true;
				}

				else {
					map[i][j] = 3;
					return false;
				}
			} else {
//				 �����1
				return false;
			}
		}

	}
}
