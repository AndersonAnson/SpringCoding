package tree;

public class TreeMaxDepth {
	public int TreeDepth(TreeNode root) {
//		˼· �Ӹ���㿪ʼ��·�� ����Ҷ�ӽ����γ�������·�� Ȼ���·�������ֵ�滻
		if (root == null) {
			return 0;
		}
		int nLeft = TreeDepth(root.left);
		int nRight = TreeDepth(root.right);
		return Math.max(nLeft,nRight)+1;
	}
}
