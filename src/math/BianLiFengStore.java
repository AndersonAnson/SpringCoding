package math;

import java.util.ArrayList;
import java.util.Scanner;

public class BianLiFengStore {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String input = in.next();
		String[] str = input.split(",");
		ArrayList<Integer> list = new ArrayList<>();
		for (int i = 0; i < str.length; i++) {
			list.add(Integer.valueOf(str[i]));
		}
		String res = "";
		System.out.println(list);
		int start = 0;
		int end = 1;

		boolean flag = true;
		for (int i = 0; i < list.size(); i++) {
			if (i == 0) {
				res = String.valueOf(list.get(i) - 30) + ",";
			}
			if (i == list.size() - 1) {
				res = res + String.valueOf(list.get(i) + 30);
			}
			// open
			if (i % 2 == 0) {
				if (list.get(i) - list.get(i - 1) <= 60) {
					continue;
				}
				res = res + String.valueOf(list.get(i) - 30) + ",";
			}
			if (i % 2 != 0) {
				if (list.get(i + 1) - list.get(i) <= 60) {
					continue;
				}
				res = res + String.valueOf(list.get(i) + 30) + ",";
			}
//			if (list.get(i + 1) - list.get(i) <= 60) {
//				i = i + 2;
//			}
//			if (flag == false) {
//				res = String.valueOf(list.get(i) - 30) + ",";
//				flag = true;
//			}
//			
//			if (flag == true) {
//				res = String.valueOf(list.get(i) + 30) + ",";
//				flag = false;
//			}
		}
		System.out.println(res);

	}
}
