package string;

public class IsNumeric {
	public static final char[] pattern = { '+', '-', 'e', 'E' };

	public boolean isNumeric(char[] str) {
		boolean point = false, exp = false;// ��־С�����ָ��
		for (int i = 0; i < str.length; i++) {
			if (str[i] == '+' || str[i] == '-') {// +-�ź���ض�Ϊ���� �� ����Ϊ.��-.123 = -0.123��
				if (i + 1 == str.length || !(str[i + 1] >= '0' && str[i + 1] <= '9' || str[i + 1] == '.')) {
					return false;
				}
				if (!(i == 0 || str[i - 1] == 'e' || str[i - 1] == 'E')) { // +-��ֻ�����ڵ�һλ��eE�ĺ�һλ
					return false;
				}

			} else if (str[i] == '.') {// .����ض�Ϊ���� ��Ϊ���һλ��233. = 233.0��
				if (point || exp || !(i + 1 < str.length && str[i + 1] >= '0' && str[i + 1] <= '9')) {
					return false;
				}
				point = true;
			} else if (str[i] == 'e' || str[i] == 'E') {
				if (exp || i + 1 == str.length
						|| !(str[i + 1] >= '0' && str[i + 1] <= '9' || str[i + 1] == '+' || str[i + 1] == '-')) { // eE����ض�Ϊ���ֻ�+-��
					return false;
				}
				exp = true;
			} else if (str[i] >= '0' && str[i] <= '9') {
			
			} else {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		String s = "123.45e+6";
		boolean res = new IsNumeric().isNumeric(s.toCharArray());
		System.out.println(res);
	}
}
