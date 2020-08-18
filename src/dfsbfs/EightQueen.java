package dfsbfs;

public class EightQueen {
//	����һ������
	int max = 20;
	int[] array = new int[max];
	int count = 0;
	int judgeCount = 0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EightQueen eq = new EightQueen();
		System.out.println(System.currentTimeMillis());
		eq.check(0);
		System.out.println(System.currentTimeMillis());
		System.out.println(eq.count);
		System.out.println(eq.judgeCount);
	}

	public void check(int n) {
//		�ڰ˸��ʺ��Ѿ��ź���
		if (n == max) {
//			print();
			count++;
			return;
		}
//		���η���ʺ�
		for (int i = 0; i < max; i++) {
//			�Ȱѻʺ�ŵ����еĵ�1��
			array[n] = i;
//			�ж����λ�õĵ�n���ʺ��Ƿ��ͻ
			if (judge(n)) {
				check(n + 1);
			}
//			�����ͻ����ִ��array[n-1];
		}
	}

//	���ûʺ��Ƿ��ǰ����Ѿ��ݷõĻʺ��ͻ
	public boolean judge(int n) {
		judgeCount++;
		for (int i = 0; i < n; i++) {
//			�ж��Ƿ���ͬһ��
//			�ж��Ƿ���ͬһ��б��
			if (array[i] == array[n] || Math.abs(n - i) == Math.abs(array[n] - array[i])) {
				return false;
			}
		}
		return true;
	}

	public void print() {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}
}
