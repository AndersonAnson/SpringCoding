package queue;

public class CircleQueueDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

class CircleQueue {
	// 是用数组模拟一个队列
	private int maxSize;
	// front指向第一个元素
	private int front;
	// rear指向最后一个元素前一个位置
	private int rear;
	private int[] queue;

	public CircleQueue(int maxQueueSize) {
		this.maxSize = maxQueueSize;
		queue = new int[this.maxSize];
		this.front = 0;
		this.rear = 1;
	}

	// 条件是（rear+1）%maxSize=front
	public boolean isFull() {
		return rear == maxSize - 1;
	}

	public boolean isEmpty() {
		return front == (rear + 1) % maxSize;
	}

	public void addQueue(int n) {
		// 判断是否慢
		if (isFull()) {
			return;
		}
		queue[rear] = n;
		rear = (rear + 1) % maxSize;
	}

	// 获取队列数据
	public int getQueue() {
		if (isEmpty()) {
			throw new RuntimeException("队列空不能取");
		}
		int value = queue[front];
		front = (front + 1) % maxSize;
		return value;
	}

	// 显示所有数据
	public void listQueue() {
		for (int i = 0; i < front + size(); i++) {
			System.out.println(queue[i]);
		}
	}

	public int size() {
		return (rear + maxSize - front) % maxSize;
	}
}