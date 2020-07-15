package alibaba;

import java.util.Scanner;

public class XiaoQiang {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		long oldX = 1;
		int month = in.nextInt();
		int i = 1;
		while (i <= month) {
			oldX = oldX + oldX * 6;
			i++;
		}
		System.out.println(oldX * 2);
	}

}
