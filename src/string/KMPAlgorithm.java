package string;

public class KMPAlgorithm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		KMPAlgorithm k = new KMPAlgorithm();
		String str1 = "asdfghjadsfasdfkqwertyuiopppppppzxcvbnm";
		String str2 = "qwertyui";
		int[] next = kmpNext("qwertyui");
		int index = kmpSearch(str1, str2, next);
		System.out.print(index);
	}

	// 暴力匹配算法实现
	public int violenceMatch(String str1, String str2) {
		char[] s1 = str1.toCharArray();
		char[] s2 = str2.toCharArray();
		int s1Len = s1.length;
		int s2Len = s2.length;
		int i = 0;
		int j = 0;
		while (i < s1Len && j < s2Len) {
			if (s1[i] == s2[j]) {
				i++;
				j++;

			} else {
				i = i - j + 1;
				j = 0;
			}
		}
		if (j == s2Len) {
			return i - j;
		} else {
			return -1;
		}
	}

//	写出kmp搜索算法
	public static int kmpSearch(String str1, String str2, int[] next) {
		for (int i = 0, j = 0; i < str1.length(); i++) {
			while (j > 0 && str1.charAt(i) != str2.charAt(j)) {
				j = next[j - 1];
			}
			if (str1.charAt(i) == str2.charAt(j)) {
				j++;
			}
			if (j == str2.length()) {
				return i - j + 1;
			}
		}
		return -1;
	}

//	获取到一个字符串的部分匹配值
	public static int[] kmpNext(String dest) {
		int[] next = new int[dest.length()];
		next[0] = 0;
		for (int i = 0, j = 0; i < dest.length(); i++) {
			while (j > 0 && dest.charAt(i) != dest.charAt(j)) {
				j = next[j - 1];
			}
			if (dest.charAt(i) == dest.charAt(j)) {
				j++;
			}
			next[i] = j;
		}
		return next;
	}
}
