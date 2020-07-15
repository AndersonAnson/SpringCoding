package dynamicProgramming;

public class CakeNumber {
	/**
	 * 
	 * @param n int���� ֻʣ��һֻ�����ʱ�����ڵ�n�췢���ģ�
	 * @return int����
	 */
	public int cakeNumber(int n) {
		// write code here
		int x = 1, y = 1;
		for (int i = 1; i <= n - 1; i++) {
			y = (int) Math.floor((3 * x + 3) / 2);
			x = y;
		}
		return y;
	}

	public static void main(String[] args) {
		System.out.println(new CakeNumber().cakeNumber(4));
	}
}
