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

//	电视塔贪婪算法
	public void broadcastsSearch() {
		HashSet<String> hs1 = new HashSet<String>();
		hs1.add("北京");
		hs1.add("上海");
		hs1.add("天津");

		HashSet<String> hs2 = new HashSet<String>();
		hs2.add("广州");
		hs2.add("北京");
		hs2.add("深圳");

		HashSet<String> hs3 = new HashSet<String>();
		hs3.add("成都");
		hs3.add("上海");
		hs3.add("杭州");

		HashSet<String> hs4 = new HashSet<String>();
		hs4.add("北京");
		hs4.add("上海");

		HashSet<String> hs5 = new HashSet<String>();
		hs5.add("杭州");
		hs5.add("大连");
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
//		存放选择的电台的集合
		ArrayList<String> selects = new ArrayList<String>();
//		定义一个临时的集合 在遍历的过程中 存放遍历过程中的电台覆盖的地区和当前还没有覆盖的地区的交集
		HashSet<String> tempSet = new HashSet<String>();

		String maxKey = null;
		while (allAreas.size() > 0) {
			maxKey = null;
			for (String key : broadcasts.keySet()) {
				tempSet.clear();
//				当前覆盖的地区
				HashSet<String> areas = broadcasts.get(key);
				tempSet.addAll(areas);
				tempSet.retainAll(allAreas);
				if (tempSet.size() > 0 && (maxKey == null || tempSet.size() > broadcasts.get(maxKey).size())) {//体现了贪心算法的思想
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
