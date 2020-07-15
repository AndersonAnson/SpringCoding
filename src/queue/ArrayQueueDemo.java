package queue;

public class ArrayQueueDemo {
	public class ArrayQueue {
		// 是用数组模拟一个队列
		private int maxSize;
		// front指向第一个元素
		private int front;
		// rear指向最后一个元素前一个位置
		private int rear;
		private int[] queue;

		public ArrayQueue(int maxSize) {
			this.maxSize = maxSize;
			queue = new int[maxSize];
			this.front = 0;
			this.rear = 1;
		}

		// 条件是（rear+1）%maxSize=front
		public boolean isFull() {
			return rear == maxSize - 1;
		}

		public boolean isEmpty() {
			return front == rear;
		}

		public void addQueue(int n) {
			// 判断是否慢
			if (isFull()) {
				return;
			}
			rear++;
			queue[rear] = n;
		}

		// 获取队列数据
		public int getQueue() {
			if (isEmpty()) {
				throw new RuntimeException("队列空不能取");
			}
			front++;
			return queue[front];
		}

		// 显示所有数据
		public void listQueue() {
			for (int i = 0; i < queue.length; i++) {
				System.out.println(queue[i]);
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 静态内部类
//		ArrayQueueDemo.ArrayQueue aq=new ArrayQueueDemo.ArrayQueue(10);
		// 成员内部类
		ArrayQueueDemo aqd = new ArrayQueueDemo();
		ArrayQueueDemo.ArrayQueue aq = aqd.new ArrayQueue(10);
		// 直接class
//		ArrayQueue aq = new ArrayQueue(10);
		aq.addQueue(1);
		aq.addQueue(2);
		aq.addQueue(3);
		aq.addQueue(4);
		aq.listQueue();
	}

}
