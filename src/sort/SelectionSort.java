package sort;

import java.util.Arrays;
import java.util.Date;

public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 56, 43, 9, 876, 567, 52, 12, 3, 1, 8002 };
		arr = SelectionSort.selectionSort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

	public static int[] selectionSort(int[] array) {
		if (array.length == 0)
			return array;
		for (int i = 0; i < array.length; i++) {
			int minIndex = i;
			for (int j = i; j < array.length; j++) {
				if (array[j] < array[minIndex]) // 找到最小的数
					minIndex = j; // 将最小数的索引保存
			}
			int temp = array[minIndex];
			array[minIndex] = array[i];
			array[i] = temp;
		}
		return array;
	}

//	选择排序一共有数组大小-1轮排序
//	每一轮排序又是一个循环，循环的规则（代码）
//	先假定这个数是最小的数
//	然后和后面的每个数比较，选出最小的数，和前面的交换
	public static void selectSort(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			int min = arr[i];
			int minIndex = i;
			for (int j = i + 1; j < arr.length; j++) {
//				找出后面的最小的数字
				if (arr[j] < min) {
					min = arr[j];
					minIndex = j;
				}
			}
//			进行交换两个数字
			if (minIndex != i) {
				arr[minIndex] = arr[i];
				arr[i] = min;
			}

		}

	}
}
