package tree;

public class VerifySquenceOfBST {
	public boolean verifySquenceOfBST(int[] sequence) {
//			���ͼ�з�����
//			һ�� BST ������ < ����� < �Һ���
//			һ�� BST ���������������������� BST
//			��������ǣ����Ҹ���[3, 4, 9, 5, 12, 11, 10]�����ͼ�ٴ������ҷ����������У��������������Է��֣�
//			[3, 4, 9, 5] 10 [12, 11]
//			[3, 4] 5 [9]
//			[3] 4
//			[12] 11
//			���ֶ���ÿһ�����������ĸ�������Ƕ�Ӧ�������ĺ������е����һ����
//			��ô��ֻ��Ҫ���ϵ�ȷ������������������������䣬�����жϣ���������������н��ֵ < �����ֵ < �������������н��ֵ����������Ƿ����㼴��
		if (sequence == null || sequence.length == 0) {
			return false;
		}
		return isBST(sequence, 0, sequence.length - 1);
	}

	boolean isBST(int[] arr, int start, int root) {
		if (start >= root) {
			return true;
		}
		int key = arr[root];
		int i;
		// �ҵ����������ķֽ��
		for (i = start; i < root; i++) {
			if (arr[i] > key) {
				break;
			}
		}
		// �����������ж��Ƿ���С��root��ֵ������з���false
		for (int j = i; j < root; j++) {
			if (arr[j] < key) {
				return false;
			}
		}
		return isBST(arr, start, i - 1) && isBST(arr, i, root - 1);
	}
}
