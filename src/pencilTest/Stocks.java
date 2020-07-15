package pencilTest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;

public class Stocks {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		HashMap<String, ArrayList<Integer>> map = new HashMap<>();
		for (int i = 1; i <= n; i++) {
			int color = sc.nextInt();
			ArrayList<Integer> list = new ArrayList<>();
			for (int j = 1; j <= color; j++) {

				list.add(sc.nextInt());
			}
			map.put(String.valueOf(i), list);
		}
		sc.close();
		int big = 0;
		int one = 0;
		for (String s : map.keySet()) {
			ArrayList<Integer> temp = map.get(s);
			big = 0;
			for (Integer i : temp) {
//				if (i == 0) {
//					big--;
//				}
				if (i == 1) {
					one++;
				}
				if (i > 1) {
					big++;
				}
			}
			if (big == 0) {
				System.out.println(-1);
			} else if (big > 0) {
//				System.out.println(temp.size() + 1);
				System.out.println(big + 1);
			}

		}
	}
}
