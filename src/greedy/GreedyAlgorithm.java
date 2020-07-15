package greedy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class GreedyAlgorithm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GreedyAlgorithm gag = new GreedyAlgorithm();
		gag.broadcastsSearch();
	}

//	������̰���㷨
	public void broadcastsSearch() {
		HashSet<String> hs1 = new HashSet<String>();
		hs1.add("����");
		hs1.add("�Ϻ�");
		hs1.add("���");

		HashSet<String> hs2 = new HashSet<String>();
		hs2.add("����");
		hs2.add("����");
		hs2.add("����");

		HashSet<String> hs3 = new HashSet<String>();
		hs3.add("�ɶ�");
		hs3.add("�Ϻ�");
		hs3.add("����");

		HashSet<String> hs4 = new HashSet<String>();
		hs4.add("����");
		hs4.add("�Ϻ�");

		HashSet<String> hs5 = new HashSet<String>();
		hs5.add("����");
		hs5.add("����");
		HashMap<String, HashSet<String>> broadcasts = new HashMap<String, HashSet<String>>();
		broadcasts.put("K1", hs1);
		broadcasts.put("K2", hs2);
		broadcasts.put("K3", hs3);
		broadcasts.put("K4", hs4);
		broadcasts.put("K5", hs5);

		HashSet<String> allAreas = new HashSet<String>();
		for (String s : hs1) {
			allAreas.add(s);
		}
		for (String s : hs2) {
			allAreas.add(s);
		}
		for (String s : hs3) {
			allAreas.add(s);
		}
		for (String s : hs4) {
			allAreas.add(s);
		}
		for (String s : hs5) {
			allAreas.add(s);
		}
		System.out.print(allAreas);
//		���ѡ��ĵ�̨�ļ���
		ArrayList<String> selects = new ArrayList<String>();
//		����һ����ʱ�ļ��� �ڱ����Ĺ����� ��ű��������еĵ�̨���ǵĵ����͵�ǰ��û�и��ǵĵ����Ľ���
		HashSet<String> tempSet = new HashSet<String>();

		String maxKey = null;
		while (allAreas.size() > 0) {
			maxKey = null;
			for (String key : broadcasts.keySet()) {
				tempSet.clear();
//				��ǰ���ǵĵ���
				HashSet<String> areas = broadcasts.get(key);
				tempSet.addAll(areas);
				tempSet.retainAll(allAreas);
				if (tempSet.size() > 0 && (maxKey == null || tempSet.size() > broadcasts.get(maxKey).size())) {//������̰���㷨��˼��
					maxKey = key;
				}
			}
			if (maxKey != null) {
				selects.add(maxKey);
				allAreas.removeAll(broadcasts.get(maxKey));
			}
		}
		System.out.print(selects);
	}
}
