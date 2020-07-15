package queue;

public class ArrayQueueDemo {
	public class ArrayQueue {
		// ��������ģ��һ������
		private int maxSize;
		// frontָ���һ��Ԫ��
		private int front;
		// rearָ�����һ��Ԫ��ǰһ��λ��
		private int rear;
		private int[] queue;

		public ArrayQueue(int maxSize) {
			this.maxSize = maxSize;
			queue = new int[maxSize];
			this.front = 0;
			this.rear = 1;
		}

		// �����ǣ�rear+1��%maxSize=front
		public boolean isFull() {
			return rear == maxSize - 1;
		}

		public boolean isEmpty() {
			return front == rear;
		}

		public void addQueue(int n) {
			// �ж��Ƿ���
			if (isFull()) {
				return;
			}
			rear++;
			queue[rear] = n;
		}

		// ��ȡ��������
		public int getQueue() {
			if (isEmpty()) {
				throw new RuntimeException("���пղ���ȡ");
			}
			front++;
			return queue[front];
		}

		// ��ʾ��������
		public void listQueue() {
			for (int i = 0; i < queue.length; i++) {
				System.out.println(queue[i]);
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ��̬�ڲ���
//		ArrayQueueDemo.ArrayQueue aq=new ArrayQueueDemo.ArrayQueue(10);
		// ��Ա�ڲ���
		ArrayQueueDemo aqd = new ArrayQueueDemo();
		ArrayQueueDemo.ArrayQueue aq = aqd.new ArrayQueue(10);
		// ֱ��class
//		ArrayQueue aq = new ArrayQueue(10);
		aq.addQueue(1);
		aq.addQueue(2);
		aq.addQueue(3);
		aq.addQueue(4);
		aq.listQueue();
	}

}
