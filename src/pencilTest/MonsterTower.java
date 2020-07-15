package pencilTest;

import java.util.Scanner;

public class MonsterTower {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int D = sc.nextInt();
		int[] A = new int[n];
		int[] B = new int[n];
		for (int i = 0; i < n; i++) {
			A[i] = sc.nextInt();
		}
		for (int i = 0; i < n; i++) {
			B[i] = sc.nextInt();
		}
		int total = 0;
		int[] dp = new int[n + 1];
		dp[0] = 0;
		for (int i = 1; i < dp.length; i++) {
			if (D > A[i - 1]) {
				dp[i] = dp[i - 1];
			} else if (D <= A[i - 1]) {
				dp[i] = dp[i - 1] + B[i - 1];
			}
			D++;
		}
		total = dp[n];
		System.out.println(total);
	}

}
