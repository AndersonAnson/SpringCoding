package math;

public class CompareVersion {
	public int compareVersion(String version1, String version2) {
		String[] v1 = version1.split("\\.");
		String[] v2 = version2.split("\\.");
		for (int i = 0, j = 0; i < version1.length() || j < version2.length(); i++, j++) {
			int n1, n2;
			if (i < v1.length) {
				n1 = Integer.valueOf(v1[i]);
			} else {
				n1 = 0;
			}
			if (j < v2.length) {
				n2 = Integer.valueOf(v2[j]);
			} else {
				n2 = 0;
			}
			if (n1 == n2) {
				continue;
			} else {
				return n1 > n2 ? 1 : -1;
			}
		}
		return 0;
	}
}
