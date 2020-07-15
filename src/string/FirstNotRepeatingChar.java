package string;

public class FirstNotRepeatingChar {
	public int firstNotRepeatingChar(String str) {
		if (str == null || str.length() == 0)
			return -1;
		int[] hash = new int[256];// �Á�洢ÿ���ַ���Ƶ��
		for (int i = 0; i < str.length(); i++) {
			hash[str.charAt(i)]++;// �ַ���int���Զ�ӳ�䵽256��λ��
		}
		for (int i = 0; i < str.length(); i++) {
			if (hash[str.charAt(i)] == 1) {
				return i;
			}
		}
		return -1;
	}
}
