package sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

public class RadixSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 56, 43, 9, 876, 567, 5221, 12, 3, 1, 8020 };
		RadixSort.radixSort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

	public static int[] radixSort(int[] array) {
		if (array == null || array.length < 2)
			return array;
		// 1.������������λ����
		int max = array[0];
		for (int i = 1; i < array.length; i++) {
			max = Math.max(max, array[i]);
		}
		int maxDigit = 0;
		while (max != 0) {
			max /= 10;
			maxDigit++;
		}
		int mod = 10, div = 1;
		ArrayList<ArrayList<Integer>> bucketList = new ArrayList<ArrayList<Integer>>();
		for (int i = 0; i < 10; i++)
			bucketList.add(new ArrayList<Integer>());
		for (int i = 0; i < maxDigit; i++, mod *= 10, div *= 10) {
			for (int j = 0; j < array.length; j++) {
				int num = (array[j] % mod) / div;
				bucketList.get(num).add(array[j]);
			}
			int index = 0;
			for (int j = 0; j < bucketList.size(); j++) {
				for (int k = 0; k < bucketList.get(j).size(); k++)
					array[index++] = bucketList.get(j).get(k);
				bucketList.get(j).clear();
			}
		}
		return array;
	}

//	public static void radixSort(int[] arr) {
////		����һ����ά���飬��ʾ10��Ͱ��ÿ��Ͱ����һ��һά����
////		���ÿռ任ʱ��  Ϊ�˱�֤Ͱ����� ֻ����arr.length
//		int max = arr[0];
//		for (int i = 1; i < arr.length; i++) {
//			if (arr[i] > max) {
//				max = arr[i];
//			}
//		}
//		int maxDigit = (max + "").length();
//		int[][] bucket = new int[10][arr.length];
//		int[] bucketElementCounts = new int[10];
//		for (int i = 0; i < maxDigit; i++) {
////			Ϊ�˼�¼ÿ��Ͱ�У�ʵ�ʴ���˶��ٸ����ݣ����Ƕ���һ��һά��������¼����Ͱ��ÿ�η�������ݸ���
//			for (int j = 0, n = 1; j < arr.length; j++, n = n * 10) {
//				int digitOfElement = ((arr[j] / n) % 10);
//				bucket[digitOfElement][bucketElementCounts[digitOfElement]] = arr[j];
//				bucketElementCounts[digitOfElement]++;
//			}
//			int index = 0;
////			����Ͱ��˳�� ����ÿһ��Ͱ ����Ͱ�����ݷ��뵽ԭ��������
//			for (int k = 0; k < bucketElementCounts.length; k++) {
//				if (bucketElementCounts[k] != 0) {
//					for (int m = 0; m < bucketElementCounts[k]; m++) {
//						arr[index++] = bucket[k][m];
//					}
//				}
//				bucketElementCounts[k] = 0;
//			}
//		}
//
//	}
}
