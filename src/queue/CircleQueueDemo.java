package queue;

public class CircleQueueDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

class CircleQueue {
	// ��������ģ��һ������
	private int maxSize;
	// frontָ���һ��Ԫ��
	private int front;
	// rearָ�����һ��Ԫ��ǰһ��λ��
	private int rear;
	private int[] queue;

	public CircleQueue(int maxQueueSize) {
		this.maxSize = maxQueueSize;
		queue = new int[this.maxSize];
		this.front = 0;
		this.rear = 1;
	}

	// �����ǣ�rear+1��%maxSize=front
	public boolean isFull() {
		return rear == maxSize - 1;
	}

	public boolean isEmpty() {
		return front == (rear + 1) % maxSize;
	}

	public void addQueue(int n) {
		// �ж��Ƿ���
		if (isFull()) {
			return;
		}
		queue[rear] = n;
		rear = (rear + 1) % maxSize;
	}

	// ��ȡ��������
	public int getQueue() {
		if (isEmpty()) {
			throw new RuntimeException("���пղ���ȡ");
		}
		int value = queue[front];
		front = (front + 1) % maxSize;
		return value;
	}

	// ��ʾ��������
	public void listQueue() {
		for (int i = 0; i < front + size(); i++) {
			System.out.println(queue[i]);
		}
	}

	public int size() {
		return (rear + maxSize - front) % maxSize;
	}
}