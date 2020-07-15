package math;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class FindContinuousSequence {
	public ArrayList<ArrayList<Integer>> findContinuousSequence(int sum) {
		ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
		for (int i = 1; i < sum; i++) {
			int temp = 0;
			int j = i;
			while (temp < sum) {
				temp += j;
				j++;
			}
			if (temp == sum) {// ����ҵ�����ô��Ҫ��������ӵ���������С�
				ArrayList<Integer> newArray = new ArrayList<Integer>();
				for (int k = i; k < j; k++)
					newArray.add(k);
				result.add(newArray);
			}
		}
		return result;
	}

	public static void main(String[] args) {
		FindContinuousSequence f = new FindContinuousSequence();
		System.out.print(f.findContinuousSequence(100));
	}
}
