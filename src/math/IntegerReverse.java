package math;

public class IntegerReverse {
	public int reverse(int x) {
		String s = String.valueOf(x);
		String ans = "";
		if (s.charAt(0) == '-') {

			for (int i = (s.length() - 1); i > 0; i--) {

				ans = ans + (s.charAt(i));
			}
			char heng = '-';
			ans = Character.toString(heng).concat(ans);
		} else {
			for (int i = (s.length() - 1); i >= 0; i--) {
				ans = ans + (s.charAt(i));
			}
		}
		Long fanzhuan = Long.valueOf(ans);
		if (fanzhuan > Integer.MAX_VALUE) {
			return 0;
		} else if (fanzhuan < Integer.MIN_VALUE) {
			return 0;
		} else {
			int returnId = new Long(fanzhuan).intValue();
			return returnId;
		}
	}
}
