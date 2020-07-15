package pencilTest;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class SubOrderCount {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int input = s.nextInt();
		List<Integer> list = new LinkedList<>();
		for (int i = 0; i < input; i++) {
			list.add(s.nextInt());
		}
	}
}
