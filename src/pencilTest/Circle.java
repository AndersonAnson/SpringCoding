package pencilTest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Circle {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int input = s.nextInt();
		ArrayList<Double> list = new ArrayList<>();
		for (int i = 0; i < input; i++) {
			list.add(s.nextDouble());
		}
		int count = 1;
		double sum = 0;
		double area = 0.5f;
		double temp = 1;
		for (int i = 0; i < list.size(); i++) {
			if (count == 1) {
				temp = Math.pow(list.get(i), 2);
				area = Math.PI * temp;
			} else if (count % 2 == 0) {
				count++;
				continue;
			} else if (count % 2 != 0) {
				double small = list.get(i - 1);
				double big = list.get(i);
				area = Math.PI * (big - small) * (big + small);
			}
			count++;
			sum = sum + area;
		}
		System.out.println(String.format("%.5f", sum));
	}
}
