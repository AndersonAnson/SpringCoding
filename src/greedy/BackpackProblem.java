package greedy;

public class BackpackProblem {
	public static void main(String[] args) {
		BackpackProblem dp = new BackpackProblem();
		dp.backProblem();
	}

//	v[i][0]=v[0][j]=0
//	if w[i]>j:v[i][j]=v[i]=v[i-1][j]
//	if w[i]<j:v[i][j]=max{v[i-1][j],v[i]+v[i-1][j-w[i]]}
	public void backProblem() {
//		物品的重量
		int[] weight = { 1, 4, 3, 5, 2 };
//		物品的价值
		int[] value = { 1500, 3000, 2000, 4500, 1800 };
//		背包最大容量
		int maxWeight = 10;
//		物品的个数
		int maxNumber = value.length;
//		为了记录放入商品的情况 我们定一个商品的数组
		int[][] path = new int[maxNumber + 1][maxWeight + 1];
//		创建二维数组
		int[][] v = new int[maxNumber + 1][maxWeight + 1];
		for (int i = 0; i < v.length; i++) {
			v[i][0] = 0;
		}
		for (int i = 0; i < v[0].length; i++) {
			v[0][i] = 0;
		}
//		根据前面的公式来进行动态规划处理
		for (int i = 1; i < v.length; i++) {
			for (int j = 1; j < v[0].length; j++) {
				if (weight[i - 1] > j) {
					v[i][j] = v[i - 1][j];
				} else {
//					为了记录商品存放到背包的情况，我们不能简单使用上面的公式，需要使用if-else来体现公式
					if (v[i - 1][j] < value[i - 1] + v[i - 1][j - weight[i - 1]]) {
						v[i][j] = value[i - 1] + v[i - 1][j - weight[i - 1]];
//						把当前的情况记录到path
						path[i][j] = 1;
					} else {
						v[i][j] = v[i - 1][j];
					}
//					v[i][j] = Math.max(v[i - 1][j], value[i - 1] + v[i - 1][j - weight[i - 1]]);
				}
			}
		}
		for (int i = 0; i < v.length; i++) {
			for (int j = 0; j < v[0].length; j++) {
				System.out.print(v[i][j] + " ");
			}
			System.out.println();
		}

//		for (int i = 0; i < path.length; i++) {
//			for (int j = 0; j < path.length; j++) {
//				System.out.print(path[i][j] + " ");
//			}
//			System.out.println();
//		}
		int i = path.length - 1;
		int j = path[0].length - 1;
		while (i > 0 && j > 0) {
			if (path[i][j] == 1) {
				System.out.println("第" + i + "个商品放入背包");
				j = j - weight[i - 1];
			}
			i--;
		}
	}
}
