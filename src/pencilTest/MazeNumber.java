package pencilTest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class MazeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		HashMap<String, ArrayList<Integer>> lenMap = new HashMap<>();
		HashMap<String, ArrayList<Integer>> weightMap = new HashMap<>();
		int number = 0;
		for (int i = 1; i <= n; i++) {
			number = sc.nextInt();
			ArrayList<Integer> lenList = new ArrayList<>();
			for (int j = 1; j <= number; j++) {
				lenList.add(sc.nextInt());

			}
			lenMap.put(String.valueOf(i), lenList);
			ArrayList<Integer> weightList = new ArrayList<>();
			for (int j = 1; j <= number; j++) {
				weightList.add(sc.nextInt());
			}
			weightMap.put(String.valueOf(i), weightList);
		}
		// 处理完数据
		// 开辟一个新数据
		int[] dp = new int[number];
		for (String s : lenMap.keySet()) {
			ArrayList<Integer> temp = lenMap.get(s);

		}
	}

}
