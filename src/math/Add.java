package math;

public class Add {
	public static int add(int num1, int num2) {
		int result = 0;
		int carry = 0;
		do {
			result = num1 ^ num2; // 不带进位的加法
			carry = (num1 & num2) << 1; // 进位
			num1 = result;
			num2 = carry;
		} while (carry != 0); // 进位不为0则继续执行加法处理进位
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(add(88,21));
	}
}
