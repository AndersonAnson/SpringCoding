package tree;

import java.util.ArrayList;
import java.util.List;

public class HasSubtree {
	// �������ö�����A��B���ж�B�ǲ���A���ӽṹ����ps������Լ��������������һ�������ӽṹ��
	public boolean hasSubtree(TreeNode root1, TreeNode root2) {
		if (root1 == null || root2 == null) {
			return false;
		}
		return judgeSubTree(root1, root2) || judgeSubTree(root1.left, root2) || judgeSubTree(root1.right, root2);
	}

	public boolean judgeSubTree(TreeNode root1, TreeNode root2) {
		if (root2 == null) {
			return true;
		}
		if (root1 == null) {
			return false;
		}
		if (root1.val != root2.val) {
			return judgeSubTree(root1.left, root2) || judgeSubTree(root1.right, root2);
		}
		return judgeSubTree(root1.left, root2.left) && judgeSubTree(root1.right, root2.right);
	}
}
