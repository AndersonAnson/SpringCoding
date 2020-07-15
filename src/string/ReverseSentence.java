package string;

public class ReverseSentence {
	public String reverseSentence(String str) {
		if (str.length() <= 0) {
			return "";
		}
		// ��ת��������
		StringBuffer st1 = new StringBuffer(str);
		st1.reverse();
		// ��Ž��
		StringBuffer result = new StringBuffer();
		int j = 0;
		// ��ǿո���
		int blankNum = 0;
		for (int i = 0; i < st1.length(); i++) {
			// 1�����пո���û�е������һ������ʱ
			if (st1.charAt(i) == ' ' && (i != st1.length() - 1)) {
				blankNum++;
				StringBuffer st2 = new StringBuffer(st1.substring(j, i));
				result.append(st2.reverse().toString()).append(" ");
				j = i + 1;
			}
			// 2�����пո��ҵ������һ������ʱ
			if (blankNum != 0 && i == (st1.length() - 1)) {
				StringBuffer st3 = new StringBuffer(st1.substring(j, i + 1));
				result.append(st3.reverse());
			}
		}
		// �ո���Ϊ0ʱ��ֱ�ӷ���ԭ�ַ���
		if (blankNum == 0) {
			return str;
		}
		return result.toString();
	}
}
