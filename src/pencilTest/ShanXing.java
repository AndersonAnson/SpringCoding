package pencilTest;

import java.util.Scanner;

public class ShanXing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
//		����Զ��
		int oriX = in.nextInt();
		int oriY = in.nextInt();
		// ����������
		int centralX = in.nextInt();
		int centralY = in.nextInt();
//		����Բ�ĽǴ�С
		int angle = in.nextInt();
//		����p������
		int pX = in.nextInt();
		int pY = in.nextInt();

		int dX = pX - oriX;
		int dY = pY - oriY;
		float length = (float) Math.sqrt(dX * dX + dY * dY);
		float normalDx = dX / length;
		float normalDy = dY / length;
		double hudu = Math.acos(normalDx * centralX + normalDy * centralY);
		if (Math.toDegrees(hudu) <= angle) {
			System.out.println(1);
		} else {
			System.out.println(0);
		}
	}

}
