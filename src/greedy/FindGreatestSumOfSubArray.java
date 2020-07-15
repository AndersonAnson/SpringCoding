package greedy;

public class FindGreatestSumOfSubArray {
	public int findGreatestSumOfSubArray(int[] array) {
//        ��ͷ��ʼ���� ����õ��Ĵ𰸴���0�ͱ��� ����õ��Ĵ�С��0���ӵ�
		int maxVal = Integer.MIN_VALUE;
		maxVal = array[0];
		for (int i = 1; i < array.length; i++) {
			if (array[i - 1] > 0) {
				array[i] = array[i - 1] + array[i];
			}
			maxVal = Math.max(maxVal, array[i]);
		}
		return maxVal;
	}
}
