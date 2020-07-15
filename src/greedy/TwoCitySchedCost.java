package greedy;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;

public class TwoCitySchedCost {
//	公司计划面试 2N 人。第 i 人飞往 A 市的费用为 costs[i][0]，飞往 B 市的费用为 costs[i][1]。
//	返回将每个人都飞到某座城市的最低费用，要求每个城市都有 N 人抵达。

//	我们这样来看这个问题，公司首先将这 2N2N 个人全都安排飞往 BB 市，再选出 NN 个人改变它们的行程，让他们飞往 AA 市。如果选择改变一个人的行程，那么公司将会额外付出 price_A - price_B 的费用，这个费用可正可负。
//	因此最优的方案是，选出 price_A - price_B 最小的 NN 个人，让他们飞往 A 市，其余人飞往 B 市。
//	按照 price_A - price_B 从小到大排序；
//	将前 NN 个人飞往 A 市，其余人飞往 B 市，并计算出总费用。
	public int twoCitySchedCost(int[][] costs) {
		Arrays.sort(costs, new Comparator<int[]>() {
			public int compare(int[] o1, int[] o2) {
				// TODO Auto-generated method stub
				if ((o1[0] - o1[1]) - (o2[0] - o2[1]) > 0) {
					return 1;
				}
				return -1;
			}
		});
		int total = 0;
		int everyCity = costs.length / 2;
		for (int i = 0; i < everyCity; ++i) {
			total = total + costs[i][0] + costs[i + everyCity][1];
		}
		return total;
	}

	public static void main(String[] args) {
		int[][] costs = { { 10, 20 }, { 30, 200 }, { 400, 50 }, { 30, 20 } };
		System.out.println(new TwoCitySchedCost().twoCitySchedCost(costs));
	}
}
