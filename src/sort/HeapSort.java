package sort;

import java.util.Arrays;

public class HeapSort {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int[] arr = {56, 43, 9, 876, 567, 5221, 12, 3, 1, 8020};
        arr = HeapSort.heapSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }

    // ����ȫ�ֱ��������ڼ�¼����array�ĳ��ȣ�
    static int len;

    public static int[] heapSort(int[] array) {
        len = array.length;
        if (len < 1)
            return array;
        // 1.����һ������
        buildMaxHeap(array);
        // 2.ѭ��������λ�����ֵ����ĩλ������Ȼ�������µ�������
        while (len > 0) {
            swap(array, 0, len - 1);
            len--;
            adjustToMaxHeap(array, 0);
        }
        return array;
    }

    public static void buildMaxHeap(int[] array) {
        // �����һ����Ҷ�ӽڵ㿪ʼ���Ϲ�������
        // forѭ������д�����һ�㣺i�����������������ֱ�2i+1��2(i+1)
        for (int i = (len / 2 - 1); i >= 0; i--) {
            adjustToMaxHeap(array, i);
        }
    }

    public static void adjustToMaxHeap(int[] array, int i) {
        int maxIndex = i;
        // ������������������������ڸ��ڵ㣬�����ָ��ָ��������
        if (i * 2 < len && array[i * 2] > array[maxIndex])
            maxIndex = i * 2; // ��л���ѽ�����֮ǰ��i*2+1
        // ������������������������ڸ��ڵ㣬�����ָ��ָ��������
        if (i * 2 + 1 < len && array[i * 2 + 1] > array[maxIndex])
            maxIndex = i * 2 + 1; // ��л���ѽ�����֮ǰ��i*2+2
        // ������ڵ㲻�����ֵ���򽫸��ڵ������ֵ���������ҵݹ�����븸�ڵ㽻����λ�á�
        if (maxIndex != i) {
            swap(array, maxIndex, i);
            adjustToMaxHeap(array, maxIndex);
        }
    }

    public static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

//	��һ�����飨��������������һ���󶥶�
	public static void heapSortV2(int arr[]) {
//		���������й����һ���󶥶�
		int temp = 0;
		for (int i = arr.length / 2 - 1; i >= 0; i--) {
			adjustHeap(arr, i, arr.length);
		}

		for (int j = arr.length - 1; j > 0; j--) {
			temp = arr[j];
			arr[j] = arr[0];
			arr[0] = temp;
//			���������
//			֮��Ҫ����adjust
			adjustHeap(arr, 0, j);
		}
		System.out.println(Arrays.toString(arr));
	}

	/**
	 * ��ɽ���i��Ӧ�ķ�Ҷ�ӽڵ���������ɴ󶥶�
	 *
	 * @param arr������������
	 * @param i��ʾ��Ҷ�ӽڵ�������������
	 * @param length         ��ʾ�Զ��ٸ�Ԫ�ؼ�������
	 */
	public static void adjustHeap(int arr[], int i, int length) {
		int temp = arr[i];
//		��ʼ����
		for (int k = i * 2 + 1; k < length; k = k * 2 + 1) {
			if (arr[k] < arr[k + 1]) {// ˵�����ӽڵ��ֵС�����ӽڵ�
				k++;
			}
			if (arr[k] > temp) {
				arr[i] = arr[k];
				i = k;
			} else {
				break;
			}
		}
//		��forѭ���������Ѿ�����iΪ���ڵ���������ֵ�����˾ֲ��Ķ���
		arr[i] = temp;
	}

}
