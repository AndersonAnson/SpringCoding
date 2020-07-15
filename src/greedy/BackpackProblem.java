package greedy;

public class BackpackProblem {
	public static void main(String[] args) {
		BackpackProblem dp = new BackpackProblem();
		dp.backProblem();
	}

//	v[i][0]=v[0][j]=0
//	if w[i]>j:v[i][j]=v[i]=v[i-1][j]
//	if w[i]<j:v[i][j]=max{v[i-1][j],v[i]+v[i-1][j-w[i]]}
	public void backProblem() {
//		��Ʒ������
		int[] weight = { 1, 4, 3, 5, 2 };
//		��Ʒ�ļ�ֵ
		int[] value = { 1500, 3000, 2000, 4500, 1800 };
//		�����������
		int maxWeight = 10;
//		��Ʒ�ĸ���
		int maxNumber = value.length;
//		Ϊ�˼�¼������Ʒ����� ���Ƕ�һ����Ʒ������
		int[][] path = new int[maxNumber + 1][maxWeight + 1];
//		������ά����
		int[][] v = new int[maxNumber + 1][maxWeight + 1];
		for (int i = 0; i < v.length; i++) {
			v[i][0] = 0;
		}
		for (int i = 0; i < v[0].length; i++) {
			v[0][i] = 0;
		}
//		����ǰ��Ĺ�ʽ�����ж�̬�滮����
		for (int i = 1; i < v.length; i++) {
			for (int j = 1; j < v[0].length; j++) {
				if (weight[i - 1] > j) {
					v[i][j] = v[i - 1][j];
				} else {
//					Ϊ�˼�¼��Ʒ��ŵ���������������ǲ��ܼ�ʹ������Ĺ�ʽ����Ҫʹ��if-else�����ֹ�ʽ
					if (v[i - 1][j] < value[i - 1] + v[i - 1][j - weight[i - 1]]) {
						v[i][j] = value[i - 1] + v[i - 1][j - weight[i - 1]];
//						�ѵ�ǰ�������¼��path
						path[i][j] = 1;
					} else {
						v[i][j] = v[i - 1][j];
					}
//					v[i][j] = Math.max(v[i - 1][j], value[i - 1] + v[i - 1][j - weight[i - 1]]);
				}
			}
		}
		for (int i = 0; i < v.length; i++) {
			for (int j = 0; j < v[0].length; j++) {
				System.out.print(v[i][j] + " ");
			}
			System.out.println();
		}

//		for (int i = 0; i < path.length; i++) {
//			for (int j = 0; j < path.length; j++) {
//				System.out.print(path[i][j] + " ");
//			}
//			System.out.println();
//		}
		int i = path.length - 1;
		int j = path[0].length - 1;
		while (i > 0 && j > 0) {
			if (path[i][j] == 1) {
				System.out.println("��" + i + "����Ʒ���뱳��");
				j = j - weight[i - 1];
			}
			i--;
		}
	}
}
