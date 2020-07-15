package array;

public class StrStr {
	public int strStr(String haystack, String needle) {
		int ans = 0;
		if (needle.isEmpty()) {
			return 0;
		}
		int index = haystack.indexOf(needle);
		if (index != -1) {
			ans = index;
		} else {
			ans = -1;
		}
		return ans;
	}
}
