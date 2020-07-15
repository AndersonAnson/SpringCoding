package tree;

import java.util.ArrayList;
import java.util.List;

public class IsBalanced_Solution {
	// ƽ�����������������Ҳ��ƽ�����������ô��νƽ��������������ĸ߶Ȳ����1.
	public int depth(TreeNode root) {
		if (root == null)
			return 0;
		int left = depth(root.left);
		if (left == -1)
			return -1; // �������������ƽ��֮���û�б�Ҫ��������ĸ߶ȵ������
		int right = depth(root.right);
		if (right == -1)
			return -1;// �������������ƽ��֮���û�б�Ҫ��������ĸ߶ȵ������
		if (left - right < (-1) || left - right > 1)
			return -1;
		else
			return 1 + (left > right ? left : right);
	}

	public boolean isBalanced_Solution(TreeNode root) {
		return depth(root) != -1;
	}
}
