package array;

public class NumberOf1Between1AndN {
	public int NumberOf1Between1AndN_Solution(int n) {
		int count = 0;
		for (int i = n; i >= 1; i--) {
			String s = String.valueOf(i);
			// ����ÿ���ַ�����
			char[] ch = s.toCharArray();
			for (int j = 0; j < ch.length; j++) {
				if (ch[j] == '1') {
					count++;
				}
			}
		}
		return count;
	}
}
