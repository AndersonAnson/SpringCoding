package tree;

class TreeLinkNode {
	int val;
	TreeLinkNode left = null;
	TreeLinkNode right = null;
	TreeLinkNode next = null;

	TreeLinkNode(int val) {
		this.val = val;
	}
}

public class GetNext {
//	������������һ������������е������㣬���� B����һ����� H
//	�����������ҽ���Ǹý�㸸����������������һ����Ǹý��ĸ���㣬���� H����һ����� E
//	�����������ҽ���Ǹý�㸸������������������һֱ���Ÿ����׷˷��ֱ���ҵ�ĳ��������丸������������������������Ľ�㣬��ô������ĸ�����������Ҫ�ҵ���һ��㡣���� I����һ����� A������ G����û�з�������Ľ�㣬���� G û����һ���
	public TreeLinkNode getNext(TreeLinkNode pNode) {
		// 1
		if (pNode.right != null) {
			TreeLinkNode pRight = pNode.right;
			while (pRight.left != null) {
				pRight = pRight.left;
			}
			return pRight;
		}
		// 2
		else {
			TreeLinkNode father = pNode.next;
			while (father != null && father.left != pNode) {
				pNode = father;
				father = pNode.next;
			}
			pNode = father;
			return pNode;
		}
	}
}
