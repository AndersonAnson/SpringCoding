package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class GetLeastNumbers {
	public ArrayList<Integer> getLeastNumbers_Solution(int[] input, int k) {
		ArrayList<Integer> ans = new ArrayList<Integer>();
		if (k > input.length || k == 0) {
			return ans;
		}
//		PriorityQueue<Integer> q = new PriorityQueue<Integer>(k, new Comparator<Integer>() {
//			@Override
//			public int compare(Integer o1, Integer o2) {
//				// TODO Auto-generated method stub
//				return o2 - o1;//¹¹½¨´ó¶¥¶Ñ
//			}
//		});
		PriorityQueue<Integer> q = new PriorityQueue<>(k, (x, y) -> (y - x));
		for (int i = 0; i < input.length; i++) {
			q.add(input[i]);
			if (q.size() > k) {
				q.poll();
			}
		}
		for (Integer i : q) {
			ans.add(i);
		}
		return ans;
	}
}
