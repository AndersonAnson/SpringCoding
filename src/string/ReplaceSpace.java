package string;

public class ReplaceSpace {
	public static void main(String[] args) {
		String res = replaceSpace(new StringBuffer("dslafj ladsfjl"));
		System.out.println(res);
	}

	public static String replaceSpace(StringBuffer str) {
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ' ') {
				str.replace(i, i + 1, "%20");
			}
		}
		return str.toString();
	}
}
