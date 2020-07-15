package string;

public class ReverseString {
	public String reverse(String str) {
		// write code here
		int len = str.length();
		String newStr = new String();
		char[] cha = str.toCharArray();

		for (int i = len - 1; i >= 0; i--) {
			newStr = newStr + cha[i];
		}
		return newStr;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Douyu";
		System.out.println(new ReverseString().reverse(str));
	}

}
