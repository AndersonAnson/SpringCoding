package pencilTest;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class XiaoCangShooting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int round = s.nextInt();
		double p = s.nextDouble();
		double q = s.nextDouble();
		double ratio = p / q;
		List<Integer> mark = new LinkedList<Integer>();
		for (int i = 0; i < round; i++) {
			mark.add(s.nextInt());
		}
	}

}
