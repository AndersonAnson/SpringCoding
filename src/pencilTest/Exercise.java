package pencilTest;

public class Exercise {
	public static double findMid(int[] arr1, int[] arr2) {
		int len1 = arr1.length;
		int len2 = arr2.length;
		int[] newArr = new int[len1 + len2];
		int i = 0, j = 0, k = 0;
		// ����������
//		���arr1С��arr2 �Ͱ�arr1��newarr��
		while (i < len1 && j < len2) {
			if (arr1[i] < arr2[j]) {
				newArr[k] = arr1[i];
				k++;
				i++;
			} else {
				newArr[k] = arr2[j];
				k++;
				j++;
			}
		}
//		��ʣ�µķ���newarr��
		while (i < len1) {
			newArr[k] = arr1[i];
			k++;
			i++;
		}
		while (j < len2) {
			newArr[k] = arr2[j];
			k++;
			j++;
		}
//		��������� �ͷ���len/2 �����ż���ͷ���len-1/2
		int newLen = newArr.length;
		for (i = 0; i < newLen; i++) {
			System.out.println(newArr[i]);
		}
//		System.out.println(newArr);
		if (newLen % 2 != 0) {
			return newArr[newLen / 2];
		} else {
			int pre = (newLen - 1) / 2;
			int aft = pre + 1;
			return (newArr[pre] + newArr[aft]) / 2;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = { 1, 2, 3 };
		int[] arr2 = { 4, 5 };
//		System.out.println(findMid(arr1, arr2));
		Integer A=null;
		int b=A;
		System.out.println(b);
	}

}
