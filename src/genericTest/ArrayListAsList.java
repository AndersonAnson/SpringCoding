package genericTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListAsList {
	public static void main(String[] args) {
//		List<List<Integer>> list = new ArrayList<>();
//		for (int num = 0; num < 10; ++num) {
//			list.add(new ArrayList<Integer>(Arrays.asList(num, num + 1)));
//		}
//		System.out.println(list);
		
		List<List<Integer>> list = new ArrayList<>();
        for (int num=0; num<5; ++num){
            list.add(new ArrayList<Integer>(Arrays.asList(num, num+1)));
        }
        System.out.println(list);

        int[] nums = new int[]{11, 12, 13, 14, 15};
        list.add(new ArrayList(Arrays.asList(nums)));
        System.out.println(list);

        Integer[] nums1 = new Integer[]{11, 12, 13, 14, 15};
        list.add(new ArrayList<Integer>(Arrays.asList(nums1)));
        System.out.println(list);
	}
}
