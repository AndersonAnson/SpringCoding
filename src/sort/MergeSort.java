package sort;

import java.util.Arrays;
import java.util.Date;

public class MergeSort {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int[] arr = {56, 43, 9, 876, 567, 52, 12, 3, 1, 8001};
        arr = MergeSort.mergeSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }


    public static int[] mergeSort(int[] array) {
        if (array.length < 2) return array;
        int mid = array.length / 2;
        int[] left = Arrays.copyOfRange(array, 0, mid);
        int[] right = Arrays.copyOfRange(array, mid, array.length);
        return merge(mergeSort(left), mergeSort(right));
    }

    /**
     * �鲢���򡪡�����������õ������ϳ�һ����������
     *
     * @param left
     * @param right
     * @return
     */
    public static int[] merge(int[] left, int[] right) {
        int[] result = new int[left.length + right.length];
        for (int index = 0, i = 0, j = 0; index < result.length; index++) {
            if (i >= left.length)
                result[index] = right[j++];
            else if (j >= right.length)
                result[index] = left[i++];
            else if (left[i] > right[j])
                result[index] = right[j++];
            else
                result[index] = left[i++];
        }
        return result;
    }

    /**
     * @param arr
     * @param left
     * @param right
     * @param temp
     */
    public static void mergeSortV2(int[] arr, int left, int right, int[] temp) {
        if (left < right) {
            int mid = (left + right) / 2;
            mergeSortV2(arr, left, mid, temp);
            mergeSortV2(arr, mid + 1, right, temp);
            mergeV2(arr, left, mid, right, temp);
        }
    }

    /**
     * @param arr   ����ĵ�ԭʼ����
     * @param left  ����������еĳ�ʼ����
     * @param mid   �м�����
     * @param right �ұ�����
     * @param temp  ��ת������
     */
    public static void mergeV2(int[] arr, int left, int mid, int right, int[] temp) {
        int i = left;
        int j = mid + 1;
        int t = 0;// ָ��temp����ĵ�ǰ����
        while (i <= mid && j <= right) {
            if (arr[i] <= arr[j]) {
                temp[t] = arr[i];
                t = t + 1;
                i = i + 1;
            }
//			���ұ��������еĵ�ǰԪ�� ��䵽temp����
            else {
                temp[t] = arr[j];
                t = t + 1;
                j = j + 1;
            }
        }
        while (i <= mid) {
            temp[t] = arr[i];
            t++;
            i++;
        }
        while (j <= right) {
            temp[t] = arr[j];
            t++;
            j++;
        }

//		��temp�����Ԫ�ؿ�����arr
        t = 0;
        int tempLeft = left;
        while (tempLeft <= right) {
            arr[tempLeft] = temp[t];
            t++;
            tempLeft++;
        }
    }
}
