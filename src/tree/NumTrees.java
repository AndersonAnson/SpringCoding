package tree;

public class NumTrees {
	public int numTrees(int n) {
		// 设dp表示以 1 ... n 为节点组成的二叉搜索树有多少种
		// F(3,7)=G(2)⋅G(4) F(i,n)=G(i−1)⋅G(n−i)
		int[] G = new int[n + 1];
		G[0] = 1;
		G[1] = 1;
		for (int i = 2; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				G[i] = G[i] + G[j - 1] * G[i - j];
			}
		}
		return G[n];
	}
}
