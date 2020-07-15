package dynamicProgramming;

import java.util.Scanner;

public class DividedByThree {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int count = 0;
		int temp;
		for (int i = n; i <= m; i++) {
			temp = i % 3;
			temp = temp % 2;
			if (temp == 0) {
				count++;
			}
//			if (i % 3 % 2 == 0) {
//				count++;
//			}
		}
		System.out.println(count);
	}
}
