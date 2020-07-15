package recursion;

public class DivideAndProcedure {
	public static void main(String[] args) {
		hanoiTower(10,'A','B','C');
	}

	public static void hanoiTower(int num, char a, char b, char c) {
		if (num == 1) {
			System.out.println("第1个盘从" + a + "->" + c);
		} else {
//			如果我们有n》=2，我们总是可以看成两个盘是最下边的盘和上面所有盘的集合
//			先把最上面的所有盘移动到b，移动过程会使用到c
			hanoiTower(num - 1, a, c, b);
//			把最下边的盘从A移动到C
			System.out.println("第 " + num + "个盘从" + a + "->" + c);
//			把b塔的所有盘从b到c
			hanoiTower(num - 1, b, a, c);
		}
	}
}
