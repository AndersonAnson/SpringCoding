package sort;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 56, 43, 9, 876, 567, 52, 12, 3, 1, 8002 };
		arr = BubbleSort.bubbleSort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

	public static int[] bubbleSort(int[] array) {
		if (array.length == 0)
			return array;
		for (int i = 0; i < array.length; i++)
			for (int j = 0; j < array.length - 1 - i; j++)
				if (array[j + 1] < array[j]) {
					int temp = array[j + 1];
					array[j + 1] = array[j];
					array[j] = temp;
				}
		return array;
	}

//	public static void bubbleSort(int[] arr) {
//		int temp = 0;
//		boolean flag = false;
//		for (int i = 0; i < arr.length - 1; i++) {
//			for (int j = 0; j < arr.length - 1 - i; j++) {
//				if (arr[j] > arr[j + 1]) {
//					flag = true;
//					temp = arr[j + 1];
//					arr[j + 1] = arr[j];
//					arr[j] = temp;
//				}
//			}
////			System.out.println("第" + (i + 1) + "趟排序为" + Arrays.toString(arr));
////			如果没有交换过 flag就false
//			if (!flag) {
//				break;
//			}
////			交换过就就是true
//			else {
//				flag = false;
//			}
//		}
//	}
}
