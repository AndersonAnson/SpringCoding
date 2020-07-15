package tree;

public class BSTConvertLinkedList {
	TreeNode pre = null;
	public TreeNode Convert(TreeNode pRootOfTree) {
		if (pRootOfTree == null) {
			return null;
		}
		Convert(pRootOfTree.right);
		if (pre == null) {
			pre = pRootOfTree;//���ҵ��������ұߵĽ��
		} else {
			pRootOfTree.right = pre;
			pre.left = pRootOfTree;
			pre = pRootOfTree;
		}
		Convert(pRootOfTree.left);
		return pre;
	}
}
