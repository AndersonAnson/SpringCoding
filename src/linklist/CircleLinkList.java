package linklist;

public class CircleLinkList {
//	����һ������Ļ�������˼·
//	�ȴ�����һ���ڵ㣬��firstָ��ýڵ㣬���γɻ���
//	���浱����ÿ����һ���µĽڵ㣬�ͰѸýڵ���뵽���еĻ�������
//	����һ��first�ڵ㣬û�б��
	private CircleLinkListNode first = new CircleLinkListNode(-1);

	public void addNode(int nums) {
		if (nums < 1) {
			return;
		}
//		���帨��ָ��
		CircleLinkListNode supp = null;
		for (int i = 1; i <= nums; i++) {
			CircleLinkListNode temp = new CircleLinkListNode(i);
			if (i == 1) {
				first = temp;
				temp.setNext(temp);
				supp = first;
			} else {
				supp.setNext(temp);
				temp.setNext(first);
				supp = temp;
			}
		}
	}

	public void print() {
		if (first == null) {
			return;
		}
//		��Ϊfirst���ܶ� ����ʹ��һ������ָ����ɱ���
		CircleLinkListNode supp = first;
		while (true) {
			System.out.print(supp.getId() + " ");
			if (supp.getNext() == first) {
				break;
			} else {
				supp = supp.getNext();
			}
		}
	}

	// �����û�����������һ����Ȧ��˳��
//	��Ҫ����һ������ָ�� ����ָ������������һ���ڵ�
//	��С������ʱ�� ��first��helperָ��ͬʱ�ƶ�m-1��
//	��ʱ��firstָ���С����Ȧ
	public void quitThisCircleLinkList(int startId, int countNum) {
		CircleLinkListNode helper = first;
		while (true) {
			if (helper.getNext() == first) {
				break;
			}
			helper = helper.getNext();
		}
		for(int j=0;j<startId-1;j++) {
			first=first.getNext();
			helper=helper.getNext();
		}
		while(true) {
//			˵��Ȧ��ֻ��һ���ڵ�
			if(helper==first) {
				break;
			}
			for(int j=0;j<countNum-1;j++) {
				first=first.getNext();
				helper=helper.getNext();
			}
			System.out.print(first.getId()+"->");
//			first=first.getNext();
//			helper.setNext(first);
			helper.setNext(first.getNext());
			first=first.getNext();
		}
		System.out.print(first.getId());
	}

	public static void main(String[] args) {
//		����һ����������
		CircleLinkList cll = new CircleLinkList();
		cll.addNode(2);
		cll.print();
		cll.quitThisCircleLinkList(1, 2);
	}
}

class CircleLinkListNode {
	private int id;
	private CircleLinkListNode next;

	CircleLinkListNode(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public CircleLinkListNode getNext() {
		return next;
	}

	public void setNext(CircleLinkListNode next) {
		this.next = next;
	}
}
