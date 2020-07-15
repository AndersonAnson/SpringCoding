package string;

public class RegMatch {
	public boolean match(char[] str, char[] pattern) {
		// ���߽�
		if (str == null || pattern == null) {
			return false;
		}
		// ��������ָ��ֱ�ָ��str��pattern
		int indexOfStr = 0;
		int indexOfPattern = 0;
		return matchHelper(str, indexOfStr, pattern, indexOfPattern);
	}

	public boolean matchHelper(char[] str, int indexOfStr, char[] pattern, int indexOfPattern) {
		// �жϱ߽�����,ָ���������
		if (indexOfStr == str.length && indexOfPattern == pattern.length) {
			return true;
		}
		// indexOfPattern�ȵ�β����ƥ��ʧ��
		if (indexOfPattern == pattern.length && indexOfStr < str.length) {
			return false;
		}
		// pattern�ĵڶ����ַ�Ϊ'*',�ҵ�һ���ַ�ƥ��,�߽�Ϊģʽָ��δ�ﵽĩβ
		if (indexOfPattern + 1 < pattern.length && pattern[indexOfPattern + 1] == '*') {
			if ((indexOfStr != str.length && str[indexOfStr] == pattern[indexOfPattern])
					|| (indexOfStr != str.length && pattern[indexOfPattern] == '.')) {
				return matchHelper(str, indexOfStr, pattern, indexOfPattern + 2)
						|| matchHelper(str, indexOfStr + 1, pattern, indexOfPattern + 2)
						|| matchHelper(str, indexOfStr + 1, pattern, indexOfPattern);
			} else {
				// ��һ���ַ���ƥ��,patternֱ���ƶ���λ
				return matchHelper(str, indexOfStr, pattern, indexOfPattern + 2);
			}
		}
		// pattern�ĵڶ����ַ���Ϊ'*',�ҵ�һ���ַ�ƥ��
		if ((indexOfStr != str.length && str[indexOfStr] == pattern[indexOfPattern])
				|| (indexOfStr != str.length && pattern[indexOfPattern] == '.')) {
			return matchHelper(str, indexOfStr + 1, pattern, indexOfPattern + 1);
		} else {
			// ��һ���ַ���ƥ��
			return false;
		}

	}
}
