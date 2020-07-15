package math;

public class AddDigits {
	public int addDigits(int num) {
		int sum = 0;
		while (num != 0) {
			sum = sum + num % 10;
			num = num / 10;
		}
		while (sum >= 10) {
			return addDigits(sum);
		}
		return sum;
	}
}
