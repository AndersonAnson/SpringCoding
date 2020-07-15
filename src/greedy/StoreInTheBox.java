package greedy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class StoreInTheBox {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String input = s.next();
		String[] str = input.split(",");
		ArrayList<Integer> list = new ArrayList<>();
		for (int i = 0; i < str.length; i++) {
			list.add(Integer.valueOf(str[i]));
		}
		int numBox = 0;
		boolean[] visited = new boolean[list.size()];
		int max=0;
		for (int i = 0; i < list.size(); i++) {
			max=max+list.get(i);
			if(max%3==0) {
				
			}
			if (list.get(i) % 3 == 0) {
				int temp = list.get(i) / 3;
				numBox = numBox + temp;
				visited[i] = true;
			}
		}
		
//		Collections.sort(list);
		System.out.println(numBox);
	}
}
