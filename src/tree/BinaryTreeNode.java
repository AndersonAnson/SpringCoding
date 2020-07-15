package tree;

public class BinaryTreeNode {
	private int no;
	private String name;
	private BinaryTreeNode left;
	private BinaryTreeNode right;

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public BinaryTreeNode getLeft() {
		return left;
	}

	public void setLeft(BinaryTreeNode left) {
		this.left = left;
	}

	public BinaryTreeNode getRight() {
		return right;
	}

	public void setRight(BinaryTreeNode right) {
		this.right = right;
	}

	// 编写前序遍历的方法
	@Override
	public String toString() {
		return "BinaryTreeNode [no=" + no + ", name=" + name + "]";
	}

	public void preOrder(BinaryTreeNode root) {
		if (root != null) {
			System.out.println(root.toString());
		}
		if (root.left != null) {
			preOrder(root.left);
		}
		if (root.right != null) {
			preOrder(root.right);
		}
	}

	public void inOrder(BinaryTreeNode root) {
		if (root.left != null) {
			inOrder(root.left);
		}
		if (root != null) {
			System.out.println(root.toString());
		}
		if (root.right != null) {
			inOrder(root.right);
		}
	}

	public void postOrder(BinaryTreeNode root) {
		if (root.left != null) {
			postOrder(root.left);
		}
		if (root.right != null) {
			postOrder(root.right);
		}
		if (root != null) {
			System.out.println(root.toString());
		}
	}

	public BinaryTreeNode preOrderSearch(BinaryTreeNode node, int no) {
		if (node.getNo() == no) {
			return node;
		}
		BinaryTreeNode resNode = null;
		if (node.left != null) {
			resNode = preOrderSearch(node.left, no);
		}
		if (resNode != null) {
			return resNode;
		}
		if (node.right != null) {
			resNode = preOrderSearch(node.right, no);
		}
		return resNode;
	}

	public BinaryTreeNode inOrderSearch(BinaryTreeNode node, int no) {
		BinaryTreeNode resNode = null;
		if (node.left != null) {
			resNode = inOrderSearch(node.left, no);
		}
		if (resNode != null) {
			return resNode;
		}
		if (node.getNo() == no) {
			return node;
		}
		if (node.right != null) {
			resNode = inOrderSearch(node.right, no);
		}
		return resNode;
	}

	public BinaryTreeNode postOrderSearch(BinaryTreeNode node, int no) {
		BinaryTreeNode resNode = null;
		if (node.left != null) {
			resNode = postOrderSearch(node.left, no);
		}
		if (resNode != null) {
			return resNode;
		}
		if (node.right != null) {
			resNode = postOrderSearch(node.right, no);
		}
		if (resNode != null) {
			return resNode;
		}
		if (node.getNo() == no) {
			return node;
		}
		return resNode;
	}

	public void delNode(BinaryTreeNode node, int no) {
		if (node.left != null && node.left.getNo() == no) {
			node.left = null;
			return;
		}
		if (node.right != null && node.right.getNo() == no) {
			node.right = null;
			return;
		}
		if (node.left != null) {
			node.delNode(node.getLeft(), no);
		}
		if (node.right != null) {
			node.delNode(node.getRight(), no);
		}
	}
}
