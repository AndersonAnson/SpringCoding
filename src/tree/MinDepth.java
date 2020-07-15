package tree;

public class MinDepth {
	public int minDepth(TreeNode root) {
		if (root == null)
			return 0;
		// �����ݹ��������Ϊ�������
		// 1.���Ӻ��к��Ӷ�Ϊ�յ������˵��������Ҷ�ӽڵ㣬ֱ�ӷ���1����
		if (root.left == null && root.right == null)
			return 1;
		// 2.������Ӻ��ɺ�������һ��Ϊ�գ���ô��Ҫ���رȽϴ���Ǹ����ӵ����
		int m1 = minDepth(root.left);
		int m2 = minDepth(root.right);
		// ��������һ���ڵ�Ϊ�գ�˵��m1��m2��һ����ȻΪ0�����Կ��Է���m1 + m2 + 1;
		if (root.left == null || root.right == null)
			return m1 + m2 + 1;
		// 3.���һ�������Ҳ�������Һ��Ӷ���Ϊ�գ�������С���+1����
		return Math.min(m1, m2) + 1;
	}
}
