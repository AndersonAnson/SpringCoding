package tree;

public class SerializableAndDeSerializable {
	public String Serialize(TreeNode root) {
		if (root == null) {
			return "#";
		}
		return root.val + "," + Serialize(root.left) + "," + Serialize(root.right);
	}

	int index = -1;

	public TreeNode DeSerialize(String str) {
		String[] tree = str.split(",");
		index++;
		int len = tree.length;
		if (index > len) {
			return null;
		}
		TreeNode tn = null;
		if (tree[index].equals("#")) {
			return null;
		} else {
			tn = new TreeNode(Integer.parseInt(tree[index]));
			tn.left = DeSerialize(str);
			tn.right = DeSerialize(str);
		}
		return tn;
	}

	public static void main(String[] args) {
		TreeNode treeNode1 = new TreeNode(1);
		TreeNode treeNode2 = new TreeNode(2);
		TreeNode treeNode3 = new TreeNode(3);
		TreeNode treeNode4 = new TreeNode(4);
		TreeNode treeNode5 = new TreeNode(5);
		TreeNode treeNode6 = new TreeNode(6);

		treeNode1.left = treeNode2;
		treeNode1.right = treeNode3;

		treeNode2.left = treeNode4;
		treeNode3.left = treeNode5;
		treeNode3.right = treeNode6;

		SerializableAndDeSerializable serializeTree = new SerializableAndDeSerializable();

		String str = serializeTree.Serialize(treeNode1);
		TreeNode treeNode = serializeTree.DeSerialize(str);
	}
}
