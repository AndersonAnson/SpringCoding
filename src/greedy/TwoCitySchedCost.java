package greedy;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;

public class TwoCitySchedCost {
//	��˾�ƻ����� 2N �ˡ��� i �˷��� A �еķ���Ϊ costs[i][0]������ B �еķ���Ϊ costs[i][1]��
//	���ؽ�ÿ���˶��ɵ�ĳ�����е���ͷ��ã�Ҫ��ÿ�����ж��� N �˵ִ

//	������������������⣬��˾���Ƚ��� 2N2N ����ȫ�����ŷ��� BB �У���ѡ�� NN ���˸ı����ǵ��г̣������Ƿ��� AA �С����ѡ��ı�һ���˵��г̣���ô��˾������⸶�� price_A - price_B �ķ��ã�������ÿ����ɸ���
//	������ŵķ����ǣ�ѡ�� price_A - price_B ��С�� NN ���ˣ������Ƿ��� A �У������˷��� B �С�
//	���� price_A - price_B ��С��������
//	��ǰ NN ���˷��� A �У������˷��� B �У���������ܷ��á�
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
