package recursion;

public class MiGong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		创建一个二维数组
		int[][] map = new int[8][7];
//		使用1表示墙
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

//	小球从1，1出发
//	小球能到6，5就说明找到通路
//	0没有走过 1表示墙 2表示可以走 3表示该点已经走过了但是走不通
	public void down(int[][] map, int i, int j) {
		// 先向下走
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
			// 如果当前这个点还没有走
			if (map[i][j] == 0) {
//				按照下-》右-》上-》左策略
				map[i][j] = 2;
//				向上走
				if (setWay(map, i, j - 1)) {
					return true;
				}
//				向左走
				else if (setWay(map, i - 1, j)) {
					return true;
				} 
//				先向下走
				else if (setWay(map, i + 1, j)) {
					return true;
				}
//				向右走
				else if (setWay(map, i, j + 1)) {
					return true;
				}

				else {
					map[i][j] = 3;
					return false;
				}
			} else {
//				 如果是1
				return false;
			}
		}

	}
}
