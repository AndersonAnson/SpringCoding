package pencilTest;

import java.util.LinkedList;
import java.util.Scanner;

public class ReturnSeries {
	public static long MAX = Long.MIN_VALUE;
	public static int INDEX = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		// LinkedList<Long> list = new LinkedList<>();
		long[] list = new long[n];
		for (int i = 0; i < n; i++) {
			Long temp = sc.nextLong();
			list[i] = temp;
		}
		int count = 0;
		MAX = returnMax(list);
		while (MAX >= n) {
			count++;
			for (int i = 0; i < list.length; i++) {
				if (i == INDEX) {
					list[i] = list[i] - n;
				} else {
					list[i] = list[i] + 1;
				}
				MAX = returnMax(list);
			}
		}
		System.out.println(count);
	}

	public static long returnMax(long[] arr) {
		MAX = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > MAX) {
				INDEX = i;
			}
			MAX = Math.max(MAX, arr[i]);
		}
		return MAX;
	}
}
