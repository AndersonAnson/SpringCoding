package math;

public class CanWinNim {
	public boolean canWinNim(int n) {
		if (n % 4 == 0) {
			return false;
		}
		return true;
	}
}
