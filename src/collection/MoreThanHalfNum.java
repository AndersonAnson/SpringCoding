package collection;

import java.util.HashMap;

public class MoreThanHalfNum {
	public int moreThanHalfNum_Solution(int[] array) {
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
//		����һ��hashmap�����洢ÿ�����ֳ��ֵĴ��� ������������ ���������µ�hashmap��
//		Ȼ����hashmap��Ѱ�ҳ����������ֵ�Ϳ���
		int count = 0;
		for (int i = 0; i < array.length; i++) {
			if (hm.containsKey(array[i])) {
				count = hm.get(array[i]);
				count++;
				hm.put(array[i], count);
			} else {
				hm.put(array[i], 0);
			}
		}
		int max = Integer.MIN_VALUE;
		int res = 0;
		for (Integer i : hm.keySet()) {
			if (max <= hm.get(i)) {
				max = hm.get(i);
				res = i;
			}
		}
		if (max < (array.length / 2)) {
			return 0;
		}
		return res;
	}
}
