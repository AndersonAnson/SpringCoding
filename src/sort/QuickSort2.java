package sort;

public class QuickSort2 {
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

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1230, 23147, 2353222, 5, 7, 21362, 343124, 4, 21232, 2, 76897698, 9, 19 };
		quickSort(arr, 0, arr.length - 1);
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

	}

}