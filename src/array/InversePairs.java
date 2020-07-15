package array;

public class InversePairs {
	private int cnt;

	private void MergeSort(int[] array, int start, int end) {
		if (start >= end) {
			return;
		}
		int mid = (start + end) / 2;
		MergeSort(array, start, mid);
		MergeSort(array, mid + 1, end);
		MergeOne(array, start, mid, end);
	}

	private void MergeOne(int[] array, int start, int mid, int end) {
		int[] temp = new int[end - start + 1];
		int k = 0, i = start, j = mid + 1;
		while (i <= mid && j <= end) {
			if (array[i] <= array[j]) {
				// ���ǰ���Ԫ��С�ں���Ĳ��ܹ��������
				temp[k++] = array[i++];
			} else {
				// ���ǰ���Ԫ�ش��ں���ģ���ô��ǰ��Ԫ��֮���Ԫ�ض��ܺͺ����Ԫ�ع��������
				temp[k++] = array[j++];
				cnt = (cnt + (mid - i + 1)) % 1000000007;
			}
		}
		while (i <= mid) {
			temp[k++] = array[i++];
		}
		while (j <= end) {
			temp[k++] = array[j++];
		}
		for (int l = 0; l < k; l++) {
			array[start + l] = temp[l];
		}
	}

	public int inversePairs(int[] array) {
		MergeSort(array, 0, array.length - 1);
		return cnt;
	}

}
