package math;

public class ReverseBits {
	public int reverseBits(int n) {
		// �������Ķ����������ɵ͵���λ���ȡ��
		// ����iλ
		int result = 0;
		for (int i = 0; i <= 32; i++) {
			int tmp = n >> i;// ����iλ
			tmp = tmp & 1;// ȡ��Чλ
			tmp = tmp << (31 - i);// Ȼ��ͨ��λ���㽫����õ���ת���λ��
			result |= tmp;// ����������ٴ�ͨ�������ϵ�һ��
		}
		return result;
	}
}
