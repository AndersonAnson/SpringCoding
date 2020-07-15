package seaData;

import java.util.ArrayList;
import java.util.Scanner;

public class StringToCross {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s = in.next();
		int start = 0;
		in.close();
		ArrayList<Long> list = new ArrayList<>();
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '*') {
				Long temp = Long.valueOf(s.substring(start, i));
				list.add(temp);
				start = i + 1;
			}
			if (i == s.length() - 1) {
				Long temp = Long.valueOf(s.substring(start));
				list.add(temp);
			}
		}
		Long mul = (long) 1;
		for (Long l : list) {
			mul = l * mul;
		}
		System.out.print(mul);
	}
}
