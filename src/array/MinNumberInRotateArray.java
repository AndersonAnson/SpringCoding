package array;

public class MinNumberInRotateArray {
    public int minNumberInRotateArray(int[] array) {
        if (array.length == 0) {
            return 0;
        }
        int left = 0;
        int right = array.length - 1;

        while (left < right) {
            int mid = (left + right) / 2;
//			������ڵ�������
            if (array[mid] > array[right]) {
                left = mid + 1;
            } else if (array[mid] < array[right]) {
                right--;
            } else {
                right = mid;
            }
        }
        return array[left];
    }
}
