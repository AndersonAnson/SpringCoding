package sort;

import java.util.Date;

public class InsertionSort {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
//		��һ�˾��ǰ��������������
        int[] arr = {56, 43, 9, 876, 567, 52, 12, 3, 1, 8002};
        arr = InsertionSort.insertionSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static int[] insertionSort(int[] array) {
        if (array.length == 0)
            return array;
        int current;
        for (int i = 0; i < array.length - 1; i++) {
            current = array[i + 1];
            int preIndex = i;
            while (preIndex >= 0 && current < array[preIndex]) {
                array[preIndex + 1] = array[preIndex];
                preIndex--;
            }
            array[preIndex + 1] = current;
        }
        return array;
    }

    public static void insertionSortV2(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
//			����һ�����������
            int insertVal = arr[i];
            int insertIndex = i - 1;
//			��insertVal�ҵ������λ��
//			�ȱ�֤insertIndex��insertVal�Ҳ���λ�ò�ԼԽ��
            while (insertIndex >= 0 && insertVal < arr[insertIndex]) {
                arr[insertIndex + 1] = arr[insertIndex];
                insertIndex--;
            }
            arr[insertIndex + 1] = insertVal;
        }
    }
}
