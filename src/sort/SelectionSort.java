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
				if (array[j] < array[minIndex]) // �ҵ���С����
					minIndex = j; // ����С������������
			}
			int temp = array[minIndex];
			array[minIndex] = array[i];
			array[i] = temp;
		}
		return array;
	}

//	ѡ������һ���������С-1������
//	ÿһ����������һ��ѭ����ѭ���Ĺ��򣨴��룩
//	�ȼٶ����������С����
//	Ȼ��ͺ����ÿ�����Ƚϣ�ѡ����С��������ǰ��Ľ���
	public static void selectSort(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			int min = arr[i];
			int minIndex = i;
			for (int j = i + 1; j < arr.length; j++) {
//				�ҳ��������С������
				if (arr[j] < min) {
					min = arr[j];
					minIndex = j;
				}
			}
//			���н�����������
			if (minIndex != i) {
				arr[minIndex] = arr[i];
				arr[i] = min;
			}

		}

	}
}
