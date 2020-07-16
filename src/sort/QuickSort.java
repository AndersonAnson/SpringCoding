package sort;

public class QuickSort {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int[] arr = {56, 43, 9, 876, 567, 52, 12, 3, 1, 802};
        arr = QuickSort.quickSortV2(arr, 0, arr.length - 1);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void quickSort(int[] arr, int low, int high) {
        int i, j, temp, t;
        if (low > high) {
            return;
        }
        i = low;
        j = high;
        // temp���ǻ�׼λ
        temp = arr[low];
        while (i < j) {
            // �ȿ��ұߣ���������ݼ�
            while (temp <= arr[j] && i < j) {
                j--;
            }
            // �ٿ���ߣ��������ҵ���
            while (temp >= arr[i] && i < j) {
                i++;
            }
            // ������������򽻻�
            if (i < j) {
                t = arr[j];
                arr[j] = arr[i];
                arr[i] = t;
            }
        }
        // ��󽫻�׼Ϊ��i��j���λ�õ����ֽ���
        arr[low] = arr[i];
        arr[i] = temp;
        // �ݹ�����������
        quickSort(arr, low, j - 1);
        // �ݹ�����Ұ�����
        quickSort(arr, j + 1, high);
    }

    public static int[] quickSortV2(int[] array, int start, int end) {
        if (array.length < 1 || start < 0 || end >= array.length || start > end)
            return null;
        int smallIndex = partition(array, start, end);
        if (smallIndex > start)
            quickSortV2(array, start, smallIndex - 1);
        if (smallIndex < end)
            quickSortV2(array, smallIndex + 1, end);
        return array;
    }

    /**
     * ���������㷨����partition
     *
     * @param array
     * @param start
     * @param end
     * @return
     */
    public static int partition(int[] array, int start, int end) {
        int pivot = (int) (start + Math.random() * (end - start + 1));
        int smallIndex = start - 1;
        swap(array, pivot, end);
        for (int i = start; i <= end; i++)
            if (array[i] <= array[end]) {
                smallIndex++;
                if (i > smallIndex)
                    swap(array, i, smallIndex);
            }
        return smallIndex;
    }

    public static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
