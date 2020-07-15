package math;

public class Power {
	public double power(double base, int exponent) {
		if (base == 0.0) {
			return 0.0;
		}
//		ǰ�ý����Ϊ1��0��exponent��0��ʱ�����1
		double result = 1.0;
//		��ȡָ���ľ���ֵ
		int e = Math.abs(exponent);
//		����ָ���Ĵ�С �ۼƳ˷�
		for (int i = 1; i <= e; i++) {
			result = result * base;
		}
		if (exponent > 0) {
			return result;
		} else {
			return 1 / result;
		}
	}
}
