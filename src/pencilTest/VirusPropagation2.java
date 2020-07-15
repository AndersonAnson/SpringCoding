package pencilTest;

import java.util.Scanner;

public class VirusPropagation2 {
	public static int count;
	public static int[] set;

	public static int find(int p) {
		if (p < 0 || p >= count) {
			return -1;
		} else {
			return set[p];
		}
	}

	public static void union(int p, int q) {
		int pPos = find(p);
		int qPos = find(q);
		if (pPos == qPos) {
			return;
		}
		for (int i = 0; i < count; i++) {
			if (set[i] == pPos) {
				set[i] = qPos;
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int f = sc.nextInt();
		count = n;
		set = new int[n];
		for (int i = 0; i < n; i++) {
			set[i] = i;
		}
		for (int i = 0; i < m; i++) {
			int num = sc.nextInt();
			int last = sc.nextInt();
			for (int j = 1; j < num; j++) {
				int cur = sc.nextInt();
				union(cur, last);
				last = cur;
			}
		}
		int res = 0;
		for (int i = 0; i < n; i++) {
			if (set[i] == set[f]) {
				res++;
			}
		}
		System.out.println(res);
	}

}
