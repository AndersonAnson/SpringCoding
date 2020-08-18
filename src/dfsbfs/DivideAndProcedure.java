package dfsbfs;

public class DivideAndProcedure {
	public static void main(String[] args) {
		hanoiTower(10,'A','B','C');
	}

	public static void hanoiTower(int num, char a, char b, char c) {
		if (num == 1) {
			System.out.println("��1���̴�" + a + "->" + c);
		} else {
//			���������n��=2���������ǿ��Կ��������������±ߵ��̺����������̵ļ���
//			�Ȱ���������������ƶ���b���ƶ����̻�ʹ�õ�c
			hanoiTower(num - 1, a, c, b);
//			�����±ߵ��̴�A�ƶ���C
			System.out.println("�� " + num + "���̴�" + a + "->" + c);
//			��b���������̴�b��c
			hanoiTower(num - 1, b, a, c);
		}
	}
}
