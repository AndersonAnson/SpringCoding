package tree;

import java.util.ArrayList;

public class FindPath {
	public ArrayList<ArrayList<Integer>> findPath(TreeNode root, int target) {
		ArrayList<ArrayList<Integer>> result = new ArrayList<>();
		if (root == null) {
			return result;
		}
		ArrayList<Integer> path = new ArrayList<>();
		find(root, target, result, path);
		return result;
	}

	private void find(TreeNode root, int target, ArrayList<ArrayList<Integer>> result, ArrayList<Integer> path) {
		// 0�����ڵ�Ϊ�գ�return
		if (root == null) {
			return;
		}
		path.add(root.val);
		target -= root.val;
		// 1����Ŀ��ֵС��0��return
		if (target < 0) {
			return;
		}
		// 2����Ŀ��ֵΪ0 ���� �ڵ����������ڵ�, ���沢����
		if (target == 0 && root.left == null && root.right == null) {
			result.add(path);
			return;
		}
		// �����������ҽڵ�
		// ����new path����Ϊ���Ҷ������´εݹ�path.add(root.val);
		this.find(root.left, target, result, new ArrayList<>(path));
		this.find(root.right, target, result, new ArrayList<>(path));
	}

}
