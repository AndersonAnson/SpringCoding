package math;

public class ReverseBits {
	public int reverseBits(int n) {
		// 将给定的二进制数，由低到高位逐个取出
		// 右移i位
		int result = 0;
		for (int i = 0; i <= 32; i++) {
			int tmp = n >> i;// 右移i位
			tmp = tmp & 1;// 取有效位
			tmp = tmp << (31 - i);// 然后通过位运算将其放置到反转后的位置
			result |= tmp;// 将上述结果再次通过运算结合到一起
		}
		return result;
	}
}
