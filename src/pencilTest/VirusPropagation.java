package pencilTest;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.TreeSet;

public class VirusPropagation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int f = sc.nextInt();
		int res = 0;
		TreeSet<Integer> tempSet = new TreeSet<>();
		TreeSet<Integer> virusSet = new TreeSet<>();
		int flag = 0;
		int temp = -1;
		for (int i = 1; i <= m; i++) {
			int q = sc.nextInt();
			for (int j = 1; j <= q; j++) {
				temp = sc.nextInt();
				tempSet.add(temp);
				if (temp == f) {
					flag = 1;
				}
				if (flag == 1) {
					while (!tempSet.isEmpty()) {
						virusSet.add(tempSet.first());
						tempSet.remove(tempSet.first());
					}
				}
			}
		}
		for (Integer i : virusSet) {
			res++;
		}
		System.out.println(res);
	}

}
