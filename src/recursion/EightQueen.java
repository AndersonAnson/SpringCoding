package recursion;

public class EightQueen {
//	定义一个数组
	int max = 20;
	int[] array = new int[max];
	int count = 0;
	int judgeCount = 0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EightQueen eq = new EightQueen();
		System.out.println(System.currentTimeMillis());
		eq.check(0);
		System.out.println(System.currentTimeMillis());
		System.out.println(eq.count);
		System.out.println(eq.judgeCount);
	}

	public void check(int n) {
//		第八个皇后已经放好了
		if (n == max) {
//			print();
			count++;
			return;
		}
//		依次放入皇后
		for (int i = 0; i < max; i++) {
//			先把皇后放到该行的第1列
			array[n] = i;
//			判断这个位置的第n个皇后是否冲突
			if (judge(n)) {
				check(n + 1);
			}
//			如果冲突继续执行array[n-1];
		}
	}

//	检测该皇后是否和前面的已经拜访的皇后冲突
	public boolean judge(int n) {
		judgeCount++;
		for (int i = 0; i < n; i++) {
//			判断是否在同一列
//			判断是否在同一个斜线
			if (array[i] == array[n] || Math.abs(n - i) == Math.abs(array[n] - array[i])) {
				return false;
			}
		}
		return true;
	}

	public void print() {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}
}
