package array;

public class SparseMatrix {
	private String name;
	private Integer id;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public SparseMatrix(String name, Integer id) {
		super();
		this.name = name;
		this.id = id;
	}
//	@Override
//	public int hashCode() {
//		// TODO Auto-generated method stub
//		return 1000;
//	}
	public static void main(String[] args) {
		long[] longArray=new long[10000];
		SparseMatrix sm0 = new SparseMatrix("xiaohua", 221321312);
		SparseMatrix sm1 = new SparseMatrix("xiaohua", 2);
		SparseMatrix sm2 = new SparseMatrix("xiaohua", 221321312);
		SparseMatrix sm3 = new SparseMatrix("xiaohua", 221321312);
		SparseMatrix sm4 = new SparseMatrix("xiaohua", 221321312);
//		sm2=sm1;
//		System.out.println(sm0);
//		System.out.println(sm0.hashCode());
//		System.out.println(sm0.getId().hashCode());
//		System.out.println(Integer.toHexString(sm0.getId().hashCode()));
//		System.out.println(sm1.hashCode());
//		System.out.println(sm2.hashCode());
//		System.out.println(sm3.hashCode());
//		System.out.println(sm4.hashCode());
		System.out.println(sm2.equals(sm1));
		System.out.println(sm2==sm1);
		// 创建一个原始的二维数组11*11
		// 0表示没有棋子
		// 1表示有棋子
		int[][] chessArray = new int[11][11];
		chessArray[1][2] = 1;
		chessArray[2][3] = 2;
		// 输出原始的二维数组
//		for (int[] row : chessArray) {
//			for (int data : row) {
//				System.out.printf("%d\t", data);
//			}
//			System.out.printf("\n");
//		}
		// 先遍历整个二维数组，得到非0的个数
		int sum = 0;
		for (int[] row : chessArray) {
			for (int data : row) {
				if (data != 0) {
					sum++;
				}
			}
		}
		// 创建稀疏数组
		int[][] sparseArray = new int[sum + 1][3];
		sparseArray[0][0] = 11;
		sparseArray[0][1] = 11;
		sparseArray[0][2] = 2;
		// 遍历二维数组，将非0的值存放到稀疏数组
		int flag = 0;
		for (int i = 0; i < 11; i++) {
			for (int j = 0; j < 11; j++) {
				if (chessArray[i][j] != 0) {
					flag++;
					sparseArray[flag][0] = i;
					sparseArray[flag][1] = j;
					sparseArray[flag][2] = chessArray[i][j];

				}
			}
		}
//		for (int i = 0; i < sparseArray.length; i++) {
//			System.out.printf("%d\t%d\t%d\t\n", sparseArray[i][0], sparseArray[i][1], sparseArray[i][2]);
//		}
		
	}

}
