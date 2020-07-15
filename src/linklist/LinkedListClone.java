package linklist;

import java.util.HashMap;

class RandomListNode {
	int label;
	RandomListNode next = null;
	RandomListNode random = null;

	RandomListNode(int label) {
		this.label = label;
	}
}

public class LinkedListClone {
	public RandomListNode Clone(RandomListNode pHead) {
		if (pHead == null) {
			return null;
		}
		RandomListNode currentNode = pHead;
		// 1������ÿ����㣬�縴�ƽ��A�õ�A1�������A1�嵽���A���棻
		while (currentNode != null) {
			RandomListNode cloneNode = new RandomListNode(currentNode.label);
			RandomListNode nextNode = currentNode.next;
			currentNode.next = cloneNode;
			cloneNode.next = nextNode;
			currentNode = nextNode;
		}
		currentNode = pHead;
		// 2�����±��������������Ͻ������ָ����½�㣬��A1.random = A.random.next;
		while (currentNode != null) {
			currentNode.next.random=currentNode.random==null?null:currentNode.random.next;
			currentNode = currentNode.next.next;
		}
		// 3��������������������Ϊԭ�����͸��ƺ������
		currentNode = pHead;
		RandomListNode pCloneHead = pHead.next;
		while (currentNode != null) {
			RandomListNode temp = currentNode.next;
			currentNode.next = temp.next;
			temp.next = temp.next == null ? null : temp.next.next;
			currentNode = currentNode.next;
		}
		return pCloneHead;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}