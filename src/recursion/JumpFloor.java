package recursion;

public class JumpFloor {
	public int jumpFloor(int target) {
//		用递归 定义初始值 和递归出口
		if (target == 1) {
			return 1;
		}
		if (target == 2) {
			return 2;
		}
		int ans = jumpFloor(target - 1) + jumpFloor(target - 2);
		return ans;
	}

	public static void main(String[] args) {
		int a = new JumpFloor().jumpFloor(4);
		System.out.print(a);
	}
}
