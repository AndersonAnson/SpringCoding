package string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeSet;

public class Permutation {
//		����������ù����ַ��������ã�����Ҫ�� boolean visited[] �������һ���ù����ù��˾Ͳ��������
//		��Ŀ˵�������ظ���ĸ��TreeSet �պô��ֵ�����ظ��������� TreeSet�������� List �����ڣ�
//		S = "aa"
//		List = ["aa", "aa"]
//		��һ���ǵ�һ�� a ��ͷ�ģ��ڶ����ǵڶ��� a ��ͷ��
	private ArrayList<String> res = new ArrayList<>();
	private TreeSet<String> paths = new TreeSet<>();
	private StringBuilder path = new StringBuilder();
	private boolean[] visited;

	public ArrayList<String> permutation(String str) {
		if (str == null || str.equals("")) {
			return res;
		}
		char[] cha = str.toCharArray();
		Arrays.sort(cha);
		visited = new boolean[cha.length];
		combination(cha, 0);
		res.addAll(paths);
		return res;
	}

	public void combination(char[] arr, int len) {
		if (len == arr.length) {// ��һ�������ף�����һ�����
			paths.add(path.toString());
			return;
		}
		for (int i = 0; i < arr.length; i++) {
			if (!visited[i]) {
				visited[i] = true;
				path = path.append(arr[i]);
				combination(arr, len + 1);
				// һ��������֮���ڻ��ݵ�ʱ������״̬
				visited[i] = false;
				path.deleteCharAt(path.length() - 1);
			}
		}
	}
}
