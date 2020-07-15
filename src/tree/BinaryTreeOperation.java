package tree;

public class BinaryTreeOperation {
	private BinaryTreeNode root;

	public BinaryTreeNode getRoot() {
		return root;
	}

	public void setRoot(BinaryTreeNode root) {
		this.root = root;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinaryTreeNode root = new BinaryTreeNode();
		BinaryTreeNode node1 = new BinaryTreeNode();
		BinaryTreeNode node2 = new BinaryTreeNode();
		BinaryTreeNode node3 = new BinaryTreeNode();
		root.setNo(1);
		root.setName("songjiang");
		node1.setNo(2);
		node1.setName("songjiang2");
		node2.setNo(3);
		node2.setName("songjiang3");
		node3.setNo(4);
		node3.setName("songjiang4");
		root.setLeft(node1);
		root.setRight(node2);
		node2.setLeft(node3);
//		root.preOrder(root);
//		root.inOrder(root);
//		root.postOrder(root);
		BinaryTreeNode res = root.inOrderSearch(root, 3);
		System.out.println(res.getNo() + res.getName());
//		BinaryTreeOperation btd = new BinaryTreeOperation();
//		btd.setRoot(root);
//		btd.getRoot().preOrder(root);

	}

}
