package greedy;

import java.util.Scanner;

public class CoinExchange {
	public static final int[] coin = { 1, 4, 5 };
	public static final int[] coin2 = { 1, 5, 4 };

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		Integer total = Integer.valueOf(in.nextInt());
		int total2 = total;
		int[] ans = new int[3];
		int needNum = 0;
		for (int i = coin.length - 1; i >= 0; i--) {
			needNum = total / coin[i];
			if (total % coin[i] > 0) {
				total = total - (coin[i] * needNum);
			} else {
				total = 0;
			}
			ans[i] = needNum;
		}
		in.close();
		// È¥³ý1
		int[] ans2 = new int[3];
		int needNum2 = 0;
		for (int i = coin2.length - 1; i >= 0; i--) {
			needNum2 = total2 / coin2[i];
			if (total2 % coin2[i] > 0) {
				total2 = total2 - (coin2[i] * needNum2);
			} else {
				total2 = 0;
			}
			ans2[i] = needNum2;
		}

		for (int i = 0; i < 2; i++) {
			System.out.print(ans[i]);
			System.out.print(',');
		}
		System.out.print(ans[2]);
		System.out.println();
		
		for (int i = 0; i < 2; i++) {
			System.out.print(ans2[i]);
			System.out.print(',');
		}
		System.out.print(ans2[2]);
	}

}
