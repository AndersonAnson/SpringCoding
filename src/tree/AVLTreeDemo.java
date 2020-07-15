package tree;

public class AVLTreeDemo {
	private AVLTreeNode root;

	public void add(AVLTreeNode node) {
		if (root == null) {
			this.root = node;
		} else {
			this.root.add(node);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 4, 3, 6, 5, 7, 8 };
		AVLTreeDemo demo = new AVLTreeDemo();
		for (int i = 0; i < arr.length; i++) {
			demo.add(new AVLTreeNode(i));
		}
		System.out.println(demo.root.getHeight());
	}

}

class AVLTreeNode {
	private int value;
	private AVLTreeNode left;
	private AVLTreeNode right;

	public AVLTreeNode(int val) {
		this.setValue(val);
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public AVLTreeNode getLeft() {
		return left;
	}

	public void setLeft(AVLTreeNode left) {
		this.left = left;
	}

	public AVLTreeNode getRight() {
		return right;
	}

	public void setRight(AVLTreeNode right) {
		this.right = right;
	}

	// 添加节点的方法
//	递归地形式台南佳节点，注意需要满足二叉排序树的要求
	public void add(AVLTreeNode node) {
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
		// 当添加完一个结点之后，如果右子树的高度-左子树的高度大于1，就左旋转
		if (this.rightHeight() - this.leftHeight() > 1) {
			// 进行双旋转
			// 如果它的右子樹的左子樹的高度＞它的右子树的右子树的高度
			// 先对右子结点进行右旋转
			// 然后再对当前节点进行左旋转
			if (this.getRight() != null && this.getRight().leftHeight() > this.getRight().rightHeight()) {
				this.getRight().rightRotate();
				this.leftRotate();
			} else {
				this.leftRotate();
			}
			this.leftRotate();
			return;
		}
		if (this.leftHeight() - this.rightHeight() > 1) {
			// 如果它的左子樹的右子樹高度大於它的左子樹的高度
			if (this.getLeft() != null && this.getLeft().rightHeight() > this.getLeft().leftHeight()) {
				this.getLeft().leftRotate();
				this.rightRotate();
			} else {
				this.rightRotate();
			}
		}
	}

	// 查找要删除结点的父节点
	public AVLTreeNode searchParent(int value) {
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

	public AVLTreeNode search(int value) {
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

	// 返回左子树的高度
	public int leftHeight() {
		if (this.getLeft() == null) {
			return 0;
		} else {
			return this.getLeft().getHeight();
		}
	}

	// 返回右子树的高度
	public int rightHeight() {
		if (this.getRight() == null) {
			return 0;
		} else {
			return this.getRight().getHeight();
		}
	}

	// 返回当前结点的高度 以该结点为根节点的树的高度
	public int getHeight() {
		return Math.max(this.getLeft() == null ? 0 : this.getLeft().getHeight(),
				this.getRight() == null ? 0 : this.getRight().getHeight()) + 1;
	}

	// 左旋转方法
	public void leftRotate() {
		// 创建一个新的节点以当前根节点的值
		AVLTreeNode newNode = new AVLTreeNode(value);
		// 把新的节点的左子树设置成当前结点的左子树
		newNode.setLeft(this.getLeft());
		// 把新的节点的右子树设置成当前结点的右子树的左子树
		newNode.setRight(this.getRight().getLeft());
		// 把当前结点的值替他换成右子节点的值
		this.setValue(this.getRight().getValue());
		// 把当前节点的右子树设置成当前结点的右子树的右子树'
		this.setRight(this.getRight().getRight());
		// 把当前结点的左子树设置成新的结点
		this.setLeft(newNode);
	}

	// 右旋转方法
	public void rightRotate() {
		// 创建一个心节点
		AVLTreeNode newNode = new AVLTreeNode(value);
		// 把新节点的右子树设置为当前结点的右子树
		newNode.setRight(this.getRight());
		// 新节点的左子树设置为当前结点的左子树的右子树
		newNode.setLeft(this.getLeft().getRight());
		// 把当前节点的值替换成左子节点的值
		this.setValue(this.getLeft().getValue());
		// 把当前结点的左子树设置为当前结点左子树的左子树
		this.setLeft(this.getLeft().getLeft());
		// 把当前节点的右子树设为新的结点
		this.setRight(newNode);
	}
}
