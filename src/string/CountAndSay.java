package string;

public class CountAndSay {
	public String countAndSay(int n) {
		if (n == 1) {
			return "1";
		}
		return countAndSayLine(countAndSay(n - 1));
	}

	public String countAndSayLine(String line) {
		StringBuilder newLine = new StringBuilder();
		int i = 0;
		int count = 0;
		while (i < line.length()) {
			if (i == 0 || line.charAt(i) == line.charAt(i - 1)) {
				count++;
			} else {
				newLine.append(count).append(line.charAt(i - 1));
				count = 1;
			}
			if (i == line.length() - 1) {
				newLine.append(count).append(line.charAt(i));
			}
			i++;
		}
		return newLine.toString();
	}
}
