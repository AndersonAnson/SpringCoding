package alibaba;

public class Shulie {

	public int shulie(int n, int first) {
		if (n == 0) {
			return 0;
		}
		if (n == 1) {
			return first;
		}
		if (n == 2) {
			return first;
		}
//		定义好了两个初始值
		return shulie(n - 1, first) + shulie(n - 2, first);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shulie s = new Shulie();
		System.out.print(s.F(3, 3, 5));
		Integer i=10;
	}

	public int F(int v1, int v2, int n) {
		if (n < 3)
			return v2;
		return F(v2, v1 + v2, n - 1);
	}

	public int shulie2(int n, int first) {
		int i = 1;
		int second = first;
		if (n == 1 || n == 2) {
			return second;
		}
		int third = 0;
		while (i <= n - 2) {
			third = second + first;
			first = second;
			second = third;
			i++;
		}
		return third;
	}
}
