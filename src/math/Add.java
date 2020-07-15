package math;

public class Add {
	public static int add(int num1, int num2) {
		int result = 0;
		int carry = 0;
		do {
			result = num1 ^ num2; // ������λ�ļӷ�
			carry = (num1 & num2) << 1; // ��λ
			num1 = result;
			num2 = carry;
		} while (carry != 0); // ��λ��Ϊ0�����ִ�мӷ������λ
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(add(88,21));
	}

}
