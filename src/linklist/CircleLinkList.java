package linklist;

public class CircleLinkList {
//	构建一个单向的环形链表思路
//	先创建第一个节点，让first指向该节点，并形成环形
//	后面当我们每创建一个新的节点，就把该节点加入到已有的环形链表
//	创建一个first节点，没有编号
	private CircleLinkListNode first = new CircleLinkListNode(-1);

	public void addNode(int nums) {
		if (nums < 1) {
			return;
		}
//		定义辅助指针
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
//		因为first不能动 所以使用一个辅助指针完成遍历
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

	// 根据用户的输入生成一个出圈的顺序
//	需要创建一个辅助指针 事先指向环形链表的最后一个节点
//	当小孩报数时候 让first和helper指针同时移动m-1次
//	这时候将first指向的小孩出圈
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
//			说明圈中只有一个节点
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
//		定义一个环形链表
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
