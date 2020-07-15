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

	// ��ӽڵ�ķ���
//	�ݹ����ʽ̨�ϼѽڵ㣬ע����Ҫ���������������Ҫ��
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
		// �������һ�����֮������������ĸ߶�-�������ĸ߶ȴ���1��������ת
		if (this.rightHeight() - this.leftHeight() > 1) {
			// ����˫��ת
			// ����������Ә�����Ә�ĸ߶ȣ��������������������ĸ߶�
			// �ȶ����ӽ���������ת
			// Ȼ���ٶԵ�ǰ�ڵ��������ת
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
			// ����������Ә�����Ә�߶ȴ���������Ә�ĸ߶�
			if (this.getLeft() != null && this.getLeft().rightHeight() > this.getLeft().leftHeight()) {
				this.getLeft().leftRotate();
				this.rightRotate();
			} else {
				this.rightRotate();
			}
		}
	}

	// ����Ҫɾ�����ĸ��ڵ�
	public AVLTreeNode searchParent(int value) {
		if (this.getLeft() != null && this.getLeft().value == value
				|| this.getRight() != null && this.getRight().getValue() == value) {
			return this;
		} else {
//			������ҵ�ֵС�ڵ�ǰ�ڵ��ֵ�����ҵ�ǰ�ڵ�����ӽڵ㲻Ϊ��
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

	// �����������ĸ߶�
	public int leftHeight() {
		if (this.getLeft() == null) {
			return 0;
		} else {
			return this.getLeft().getHeight();
		}
	}

	// �����������ĸ߶�
	public int rightHeight() {
		if (this.getRight() == null) {
			return 0;
		} else {
			return this.getRight().getHeight();
		}
	}

	// ���ص�ǰ���ĸ߶� �Ըý��Ϊ���ڵ�����ĸ߶�
	public int getHeight() {
		return Math.max(this.getLeft() == null ? 0 : this.getLeft().getHeight(),
				this.getRight() == null ? 0 : this.getRight().getHeight()) + 1;
	}

	// ����ת����
	public void leftRotate() {
		// ����һ���µĽڵ��Ե�ǰ���ڵ��ֵ
		AVLTreeNode newNode = new AVLTreeNode(value);
		// ���µĽڵ�����������óɵ�ǰ����������
		newNode.setLeft(this.getLeft());
		// ���µĽڵ�����������óɵ�ǰ������������������
		newNode.setRight(this.getRight().getLeft());
		// �ѵ�ǰ����ֵ�����������ӽڵ��ֵ
		this.setValue(this.getRight().getValue());
		// �ѵ�ǰ�ڵ�����������óɵ�ǰ������������������'
		this.setRight(this.getRight().getRight());
		// �ѵ�ǰ�������������ó��µĽ��
		this.setLeft(newNode);
	}

	// ����ת����
	public void rightRotate() {
		// ����һ���Ľڵ�
		AVLTreeNode newNode = new AVLTreeNode(value);
		// ���½ڵ������������Ϊ��ǰ����������
		newNode.setRight(this.getRight());
		// �½ڵ������������Ϊ��ǰ������������������
		newNode.setLeft(this.getLeft().getRight());
		// �ѵ�ǰ�ڵ��ֵ�滻�����ӽڵ��ֵ
		this.setValue(this.getLeft().getValue());
		// �ѵ�ǰ��������������Ϊ��ǰ�����������������
		this.setLeft(this.getLeft().getLeft());
		// �ѵ�ǰ�ڵ����������Ϊ�µĽ��
		this.setRight(newNode);
	}
}
