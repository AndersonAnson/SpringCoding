package math;

import java.util.Scanner;

public class MathPair {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		long n = in.nextInt();
		long k = in.nextInt();
		long count = 0;
		if (k == 0) {
			count = n * n;
		} else {
			// ����Ҫ����k,����һ���Ǵ�k+1��ʼ�ġ�
			for (long y = k + 1; y <= n; y++) {
				// �����Ǵ�0��y-1ѭ���ģ�
				// ����ÿ��yֵ��x��1��n����n/y������ѭ��,
				// ÿ������ѭ����ֻ��y-k�����������ġ�
				count += (n / y) * (y - k);
				// ʣ��һ��������������ѭ�����ж��ⲿ�����������Ƿ����k
				if (n % y >= k)
					count += n % y - k + 1;
			}
		}
		System.out.println(count);
	}
}
