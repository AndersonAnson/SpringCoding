package pencilTest;

import java.util.Scanner;

public class CalcMinStaff {
	static int calcMinStaff(int[] start, int[] end, int n) {
		int count = n;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < i; j++) {
				if (start[i] >= end[j]) {
					count--;
					end[j] = end[i];
				}
			}
		}
		return count;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] start = new int[n];
		int[] end = new int[n];
		for (int i = 0; i < n; i++) {
			String s = in.next();
			String[] temp = s.split(",");

			start[i] = Integer.valueOf(temp[0]);
			end[i] = Integer.valueOf(temp[1]);
		}
		int res;
		res = calcMinStaff(start, end, n);
		System.out.println(String.valueOf(res));

	}
}
