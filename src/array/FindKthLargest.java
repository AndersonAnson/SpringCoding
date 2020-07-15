package array;

import java.util.Comparator;
import java.util.PriorityQueue;

public class FindKthLargest {
	public int findKthLargest(int[] nums, int k) {
//		PriorityQueue<Integer> heap = new PriorityQueue<Integer>((n1, n2) -> n1 - n2);
		// 构建小顶堆 默认小顶堆
		PriorityQueue<Integer> heap = new PriorityQueue<Integer>();
//		PriorityQueue<Integer> heap = new PriorityQueue<Integer>(k, new Comparator<Integer>() {
//			@Override
//			public int compare(Integer o1, Integer o2) {
//				// TODO Auto-generated method stub
//				return o2 - o1;//构建大顶堆
//			}
//		});
		for (int n : nums) {
			heap.add(n);
			if (heap.size() > k) {
				heap.poll();
			}
		}
		return heap.poll();
	}
}
