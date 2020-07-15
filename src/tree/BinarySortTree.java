package tree;

public class BinarySortTree {
	private BinarySortTreeNode root;

	public void add(BinarySortTreeNode node) {
		if (root == null) {
			this.root = node;
		} else {
			this.root.add(node);
		}
	}

//	查找父节点
	public BinarySortTreeNode searchParent(int value) {
		if (root == null) {
			return null;
		} else {
			return root.searchParent(value);
		}
	}

	public void delNode(int value) {
		if (root == null) {
			return;
		} else {
			BinarySortTreeNode targetNode = searchParent(value);
			if (targetNode == null) {
				return;
			}
//			如果我们发现targetNode没有父节点
			if (root.getLeft() == null && root.getRight() == null) {
				root = null;
				return;
			}
			BinarySortTreeNode parent = searchParent(value);
//			如果要删除的节点是一个叶子
			if (targetNode.getLeft() == null && targetNode.getRight() == null) {
//				判断targetNode是父亲节点的左子节点，还是右字节点
				if (parent.getLeft() != null && parent.getLeft().getValue() == value) {
					parent.setLeft(null);
				} else if (parent.getRight() != null && parent.getRight().getValue() == value) {
					parent.setRight(null);
				}
			}

		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 7, 3, 10, 12, 5, 1, 9 };
		BinarySortTree bst = new BinarySortTree();
		for (int i = 0; i < arr.length; i++) {
			bst.add(new BinarySortTreeNode(i));
		}
	}

}

class BinarySortTreeNode {
	private int value;
	private BinarySortTreeNode left;
	private BinarySortTreeNode right;

	public BinarySortTreeNode(int val) {
		this.setValue(val);
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public BinarySortTreeNode getLeft() {
		return left;
	}

	public void setLeft(BinarySortTreeNode left) {
		this.left = left;
	}

	public BinarySortTreeNode getRight() {
		return right;
	}

	public void setRight(BinarySortTreeNode right) {
		this.right = right;
	}

	// 添加节点的方法
//	递归地形式台南佳节点，注意需要满足二叉排序树的要求
	public void add(BinarySortTreeNode node) {
		if (node == null) {
			return;
		}
		if (node.value < this.getValue()) {
			if (this.getLeft() == null) {
				this.setLeft(node);
			} else {
				this.getLeft().add(node);
			}
		} else {
			if (this.getRight() == null) {
				this.setRight(node);
			} else {
				this.getRight().add(node);
			}
		}
	}

	// 查找要删除结点的父节点
	public BinarySortTreeNode searchParent(int value) {
		if (this.getLeft() != null && this.getLeft().value == value
				|| this.getRight() != null && this.getRight().getValue() == value) {
			return this;
		} else {
//			如果查找的值小于当前节点的值，并且当前节点的左子节点不为空
			if (value < this.value && this.getLeft() != null) {
				return this.getLeft().searchParent(value);
			} else if (value >= this.value && this.getRight() != null) {
				return this.getRight().searchParent(value);
			} else {
				return null;
			}
		}
	}

	public BinarySortTreeNode search(int value) {
		if (value == this.value) {
			return this;
		} else if (value < this.value) {
			if (this.left == null) {
				return null;
			}
			return this.left.search(value);
		} else {
			if (this.right == null) {
				return null;
			} else {
				return this.right.search(value);
			}
		}
	}

}