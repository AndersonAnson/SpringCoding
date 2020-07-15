package dynamicProgramming;

public class StockMaxProfit3 {
	public int maxProfit(int[] prices) {
		// dp[i][j]��ʾ��0��i�����״̬Ϊj��������棬j�ĺ�����
		// 0��ʾ��δ��ʼ���� 1��ʾ��1������һֻ��Ʊ 2��ʾ��1������һֻ��Ʊ
		// 3��ʾ��2������һֻ��Ʊ 4��ʾ��2������һֻ��ƱD
		int len = prices.length;
		if (len < 2)
			return 0;
		int[][] dp = new int[len][5];
		dp[0][0] = 0;
		dp[0][1] = -prices[0];
		for (int i = 0; i < dp.length; i++) {
			dp[i][3] = Integer.MIN_VALUE;
		}
		// ״̬ת��ֻ�� 2 �������
		// ��� 1��ʲô������
		// ��� 2������һ��״̬ת�ƹ���
		for (int i = 1; i < len; i++) {
			dp[i][0] = 0;
			dp[i][1] = Math.max(dp[i - 1][1], dp[i - 1][0] - prices[i]);
			dp[i][2] = Math.max(dp[i - 1][2], dp[i - 1][1] + prices[i]);
			dp[i][3] = Math.max(dp[i - 1][3], dp[i - 1][2] - prices[i]);
			dp[i][4] = Math.max(dp[i - 1][4], dp[i - 1][3] + prices[i]);
		}
		// ���ֵֻ�����ڲ��ֹɵ�ʱ�������Դ�� 3 ����j = 0 ,j = 2, j = 4
		int res = Math.max(0, Math.max(dp[len - 1][2], dp[len - 1][4]));
		return res;
	}
}
