package pencilTest;

import java.util.Scanner;

public class NumberExchange {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Long a = s.nextLong();
		int[] input = new int[9];
		for (int i = 0; i < 9; i++) {
			input[i] = s.nextInt();
		}
		char one = (char) (input[0] + '0');
		char two = (char) (input[1] + '0');
		char three = (char) (input[2] + '0');
		char four = (char) (input[3] + '0');
		char five = (char) (input[4] + '0');
		char six = (char) (input[5] + '0');
		char seven = (char) (input[6] + '0');
		char eight = (char) (input[7] + '0');
		char nine = (char) (input[8] + '0');
		StringBuilder stb = new StringBuilder(String.valueOf(a));
		for (int i = 0; i < stb.length(); i++) {
			if (stb.charAt(i) == '1') {
				stb.replace(i, i + 1, one + "");
				continue;
			} else if (stb.charAt(i) == '2') {
				stb.replace(i, i + 1, two + "");
				continue;
			} else if (stb.charAt(i) == '3') {
				stb.replace(i, i + 1, three + "");
				continue;
			} else if (stb.charAt(i) == '4') {
				stb.replace(i, i + 1, four + "");
				continue;
			} else if (stb.charAt(i) == '5') {
				stb.replace(i, i + 1, five + "");
				continue;
			} else if (stb.charAt(i) == '6') {
				stb.replace(i, i + 1, six + "");
				continue;
			} else if (stb.charAt(i) == '7') {
				stb.replace(i, i + 1, seven + "");
				continue;
			} else if (stb.charAt(i) == '8') {
				stb.replace(i, i + 1, eight + "");
				continue;
			} else if (stb.charAt(i) == '9') {
				stb.replace(i, i + 1, nine + "");
				continue;
			}
		}
		System.out.println(stb.toString());
	}
}
