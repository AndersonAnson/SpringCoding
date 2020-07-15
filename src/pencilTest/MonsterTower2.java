package pencilTest;

import java.util.Arrays;
import java.util.Scanner;

public class MonsterTower2 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int D = in.nextInt();
		Node[] monsters = new Node[n];
		for (int i = 0; i < n; i++) {
			monsters[i] = new Node();
			monsters[i].A = in.nextInt();
		}
		for (int i = 0; i < n; i++) {
			monsters[i].B = in.nextInt();
		}
		Arrays.sort(monsters, (x, y) -> (x.A == y.A ? y.B - x.B : x.A - y.A));
		int i = 0;
		int j = n - 1;
		int res = 0;
		while (i <= j) {
			if (D > monsters[i].A) {
				i++;
				D++;
			} else {
				res += monsters[j].B;
				D++;
				j--;
			}
		}
		System.out.println(res);
	}

	static class Node {
		public int A;
		public int B;
	}

}
